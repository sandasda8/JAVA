import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;

public class Main {
    public String readFile (String fileName) {

        StringBuilder results = new StringBuilder();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(new java.io.File(fileName)));
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                results.append(line).append("\n");
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return results.toString();
    }
    public void writeContentToFile(String fileName, String content) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.write(content);

            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        main.writeContentToFile("/home/attila/IdeaProjects/filebolbeolvasas/src/file.txt", "retek");
        main.readFile("/home/attila/IdeaProjects/filebolbeolvasas/src/file.txt");
    }

    public void copyFile (String from, String to) throws IOException{
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(from));
            writer = new BufferedWriter(new FileWriter(to));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void copyfile2 (String from, String to){
        writeContentToFile(to, readFile(from));
    }
}
