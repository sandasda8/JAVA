import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public Map<String, Integer> wordCounter (String rawText) {
        Map<String, Integer> textMap = new HashMap<>();
        String[] textArray = (rawText.split("[^a-zA-ZÁ-ű]+"));

        for (String word : textArray) {
            int counter = 1;
            if (textMap.containsKey(word)) {
                counter = textMap.get(word);
                counter++;
                textMap.replace(word, counter);
            } else {
                textMap.put(word, counter);
            }
        }
        List<WordCountWrapper> wrapperList = new ArrayList<>();
        for (String key: textMap.keySet()) {
            WordCountWrapper temp = new WordCountWrapper(key, textMap.get(key));
            wrapperList.add(temp);
        }

        Collection.sort(wrapperList);
        return wrapperList;
    }

    public String[] readFile(String fileName) {
        StringBuilder results = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                results.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String words = results.toString().replaceAll("[^\\p{L}]", " "); //[^a-zA-ZÁ-ű]+
        String[] wordArray = words.split("\\s+");
        return wordArray;
    }

}
