import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        String html = Jsoup.connect("http://cimkezes.origo.hu/cimkek/microsoft/index.html?tag=Microsoft&hits=10&offset=10").get().html();
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("./file.html"), html);

        Document doc = Jsoup.parse(new File("./file.html"), "utf-8");
        System.out.println(doc.title());
    }



    public static void readFromWeb(String webURL) throws IOException {
        URL url = new URL(webURL);
        InputStream is =  url.openStream();
        try( BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
            throw new MalformedURLException("URL is malformed!!");
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new IOException();
        }

    }
}

