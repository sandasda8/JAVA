import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Reminder {

    Timer timer;

    public Reminder() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 06);
        calendar.set(Calendar.SECOND, 30);
        Date time = calendar.getTime();
        timer = new Timer();
        timer.schedule(new RemindTask(), time);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Lejárt az idő!");
            timer.cancel(); //A timer szál megszüntetése}    }
        }
    }

    public static void main(String args[]) {
        new Reminder();
        System.out.println("Munka ütemezve.");

    }
}