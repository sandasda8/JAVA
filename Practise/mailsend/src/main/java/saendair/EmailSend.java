package saendair;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EmailSend {

    Timer timer;

    public EmailSend() {
        int mins = 48;
        int index = 0;
        while (index < 10) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 00);
            calendar.set(Calendar.MINUTE, mins++);
            calendar.set(Calendar.SECOND, 0);
            Date time = calendar.getTime();
            timer = new Timer();
            timer.schedule(new RemindTask(), time);
            index++;
            if (index == 10) {
                System.out.println("Job done.");
            }
        }
    }

    class RemindTask extends TimerTask {
        public void run() {
            try {
                    String timeStamp = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss").format(Calendar.getInstance().getTime());
                    JSONParser parser = new JSONParser();
                    Object obj = parser.parse(new FileReader("/home/attila/Desktop/pubsimulatorasd/mailsend/text.json"));

                    JSONObject jsonObject = (JSONObject) obj;

                    String from = (String) jsonObject.get("e-mail");
                    String to = (String) jsonObject.get("to");
                    String pw = (String) jsonObject.get("password");
                    String subject = (String) jsonObject.get("subject");
                    String content = (String) jsonObject.get("body");
                    sendMyMail(from, pw, to, subject, content + " Mail has been sent at: " + timeStamp);
                    System.out.println("Mail has been sent at: " + timeStamp);
                    timer.cancel();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        new EmailSend();

    }

    static void sendMyMail(String from, String pw, String to, String subject, String content) {

        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pw);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress toAddress = new InternetAddress(to);

            message.addRecipient(Message.RecipientType.TO, toAddress);

            message.setSubject(subject);
            message.setText(content);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pw);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}

