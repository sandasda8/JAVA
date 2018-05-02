import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main (String[] args) throws IOException {

        //drawDiagram(create2DArray());
        //drawDiagram(createLinkedList());
        //drawDiagram(doublesomething);
        //drawDiagram(createWithLinkedList(),"AddLinkedList");
        //drawDiagram(createWithArrayList(),"AddArrayList");
        //drawDiagram(createWithHashSet(),"AddHashSet");
        //drawDiagram(createWithLinkedListRemove(),"RemoveLinkedList");
        //drawDiagram(createWithArrayListRemove(),"RemoveLinkedList");
        //drawDiagram(createWithHashSetRemove(), "RemoveArrayList");
        //drawDiagram(createWithLinkedListContains(), "ContainsLinkedListAverage");
        //drawDiagram(createWithArrayListContains(), "ContainsArrayListAverage");
        //drawDiagram(createWithHashSetContains(), "ConstainsHashSetAverage");
        //drawDiagram(createWithLinkedListRemoveAverage(), "LinkedListRemoveAverage");
        //drawDiagram(createWithArrayListRemoveAverage(), "ArrayListRemoveAverage");
        //drawDiagram(createWithHashSettRemoveAverage(), "HashSetRemoveAverage");
        //drawDiagram(createWithLinkedListMemoryUsage(), "LinkedListMemoryUsage");
        //drawDiagram(createWithArrayListMemoryUsage(), "ArrayListMemoryUsage");
        //drawDiagram(createWithHashSetMemoryUsage(), "HashSetMemoryUsage");
        //drawDiagram(createWithTreeSetMemoryUsage(), "TreeSetMemoryUsage");
        TreeSet<String> treeSet = new TreeSet<>();
        //HashSet<String> hashSet = new HashSet<>();
        fileToTreeSet("/home/attila/Desktop/pubsimulatorasd/dataStructures/vers.txt", treeSet);
        //fileToHashSet("/home/attila/Desktop/pubsimulatorasd/dataStructures/src/main/java/vers.txt", hashSet);
        /*
        for(String hs : hashSet){
            System.out.println(hs);
        }
        for(String ts : treeSet){
            System.out.println(ts);
        } */
        BufferedReader reallyRewText = new BufferedReader(new FileReader("/home/attila/Desktop/pubsimulatorasd/dataStructures/vers.txt"));

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
        List <WordCounterWrapper> wrapperList = new ArrayList <>();
        for (String key: textMap.keySet()) {
            WordCounterWrapper temp = new WordCounterWrapper(key, textMap.get(key));
            wrapperList.add(temp);
        }
        Collection.sort(wrapperList);
        return wrapperList;
    }

    public static void fileToTreeSet(String path, TreeSet<String> treeSet) {
        try {
            String line;
            BufferedReader inRead = new BufferedReader(new FileReader(path));
            while((line = inRead.readLine()) != null) {
                String[] splitLine = line.split("\\s+");
                for (int k = 0; k < splitLine.length; k++) {
                    treeSet.add(splitLine[k]);
                }
            }
            inRead.close();
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
    public static void fileToHashMap(String path, HashMap<String, Integer> set) {
        try {
            String line;
            BufferedReader inRead = new BufferedReader(new FileReader(path));
            while((line = inRead.readLine()) != null) {
                String[] splitLine = line.split("\\s+");
                for (int k = 0; k < splitLine.length; k++) {
                    int counter = 1;

                }
            }
            inRead.close();
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
*/
    public static double[][] createWithLinkedListMemoryUsage() {

        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            double beforeUsedMem = Runtime.getRuntime().totalMemory();
            LinkedList linkedList = new LinkedList();
            for (int j = 0; j < xValues[i]; j++) {
                linkedList.add(j);
            }
            double afterUsedMem=Runtime.getRuntime().totalMemory();
            yValues[i] = (afterUsedMem - beforeUsedMem) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithArrayListMemoryUsage() {

        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            double beforeUsedMem = Runtime.getRuntime().totalMemory()  ;
            ArrayList arrayList = new ArrayList();
            for (int j = 0; j < xValues[i]; j++) {
                arrayList.add(j);
            }
            double afterUsedMem = Runtime.getRuntime().totalMemory() ;
            yValues[i] = (afterUsedMem - beforeUsedMem) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithHashSetMemoryUsage() {

        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            double beforeUsedMem = Runtime.getRuntime().totalMemory();
            HashSet hashSet = new HashSet();
            for (int j = 0; j < xValues[i]; j++) {
                hashSet.add(j);
            }
            double afterUsedMem = Runtime.getRuntime().totalMemory();
            yValues[i] = (afterUsedMem - beforeUsedMem) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithTreeSetMemoryUsage() {

        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            double beforeUsedMem = Runtime.getRuntime().totalMemory();
            TreeSet treeSet = new TreeSet();
            for (int j = 0; j < xValues[i]; j++) {
                treeSet.add(j);
            }
            double afterUsedMem = Runtime.getRuntime().totalMemory();
            yValues[i] = (afterUsedMem - beforeUsedMem) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }

    public static double[][] createWithArrayListRemoveAverageMemoryUsage() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            ArrayList arrayList = new ArrayList();
            for (int j = 0; j < xValues[i]; j++) {
                arrayList.add(j);
            }
            int k = 100;
            double totalMemory = 0;
            while (k > 0) {
                double beforeUsedMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
                arrayList.remove(xValues[7]);
                double afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
                totalMemory += (afterUsedMem - beforeUsedMem);
                k--;
            }
            yValues[i] = (totalMemory / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithLinkedListRemoveAverage() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            LinkedList linkedList = new LinkedList();
            for (int j = 0; j < xValues[i]; j++) {
                linkedList.add(j);
            }
            int k = 100;
            double totalTime = 0;
            while (k > 0) {
                startTime = System.nanoTime();
                linkedList.remove(xValues[7]);
                endTime = System.nanoTime();
                totalTime += (endTime - startTime);
                k--;
            }
            yValues[i] = (totalTime / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithArrayListRemoveAverage() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            ArrayList arrayList = new ArrayList();
            for (int j = 0; j < xValues[i]; j++) {
                arrayList.add(j);
            }
            int k = 100;
            double totalTime = 0;
            while (k > 0) {
                startTime = System.nanoTime();
                arrayList.remove(xValues[7]);
                endTime = System.nanoTime();
                totalTime += (endTime - startTime);
                k--;
            }
            yValues[i] = (totalTime / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithHashSettRemoveAverage() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            HashSet hashSet = new HashSet();
            for (int j = 0; j < xValues[i]; j++) {
                hashSet.add(j);
            }
            int k = 100;
            double totalTime = 0;
            while (k > 0) {
                startTime = System.nanoTime();
                hashSet.remove(xValues[7]);
                endTime = System.nanoTime();
                totalTime += (endTime - startTime);
                k--;
            }
            yValues[i] = (totalTime / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithLinkedListRemove() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            LinkedList linkedList = new LinkedList();
            for (int j = 0; j < xValues[i]; j++) {
                linkedList.add(j);
            }
            startTime = System.nanoTime();
            linkedList.remove(xValues[7]);
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithHashSetRemove() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            HashSet hashSet = new HashSet();
            for (int j = 0; j < xValues[i]; j++) {
                hashSet.add(j);
            }
            startTime = System.nanoTime();
            hashSet.remove(xValues[7]);
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithArrayListRemove() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            ArrayList arrayList = new ArrayList();
            for (int j = 0; j < xValues[i]; j++) {
                arrayList.add(j);
            }
            startTime = System.nanoTime();
            arrayList.remove(xValues[7]);
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithLinkedListContains() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            LinkedList linkedList = new LinkedList();
            for (int j = 0; j < xValues[i]; j++) {
                linkedList.add(j);
            }
            int k = 100;
            double totalTime = 0;
            while (k > 0) {
                startTime = System.nanoTime();
                linkedList.contains(xValues[7]);
                endTime = System.nanoTime();
                totalTime += (endTime - startTime);
                k--;
            }
            yValues[i] = (totalTime / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithArrayListContains() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            ArrayList arrayList = new ArrayList();
            for (int j = 0; j < xValues[i]; j++) {
                arrayList.add(j);
            }
            int k = 100;
            double totalTime = 0;
            while (k > 0) {
                startTime = System.nanoTime();
                arrayList.contains(xValues[7]);
                endTime = System.nanoTime();
                totalTime += (endTime - startTime);
                k--;
            }
            yValues[i] = (totalTime / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithHashSetContains() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            HashSet hashSet = new HashSet();
            for (int j = 0; j < xValues[i]; j++) {
                hashSet.add(j);
            }
            int k = 100;
            double totalTime = 0;
            while (k > 0) {
                startTime = System.nanoTime();
                hashSet.contains(xValues[7]);
                endTime = System.nanoTime();
                totalTime += (endTime - startTime);
                k--;
            }
            yValues[i] = (totalTime / 100d) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }

    public static double[][] createWithArrayList() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            ArrayList arrayList = new ArrayList();
            startTime = System.nanoTime();
            for (int j = 0; j < xValues[i]; j++) {
                arrayList.add(j);
            }
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }
    public static double[][] createWithHashSet() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            HashSet hashSet = new HashSet();
            startTime = System.nanoTime();
            for (int j = 0; j < xValues[i]; j++) {
                hashSet.add(j);
            }
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }

    public static double[][] createWithLinkedList() {

        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        for (int i = 0; i < xValues.length; i++) {
            LinkedList linkedList = new LinkedList();
            startTime = System.nanoTime();
            for (int j = 0; j < xValues[i]; j++) {
                linkedList.add(j);
            }
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }

    public static double[][] create2DArray() {
        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        Random rand = new Random();
        for (int i = 0; i < xValues.length; i++) {
            double[] array = new double[(int) xValues[i]];
            startTime = System.nanoTime();
            for (int j = 0; j < xValues[i]; j++) {
                array[j] = rand.nextInt(101);
            }
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 100000000d;
        }
        return new double[][]{xValues, yValues};
    }


    public static int [][] intSomething = {{10,100,1000,10000,100000},{62,65,70,70,81}};
    public static double[][] doublesomething = {{10,100,1000,10000,100000},{62,65,70,70,81}};

    public static void showChart(JFreeChart chart) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Charts");

                frame.setSize(600, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                ChartPanel cp = new ChartPanel(chart);

                frame.getContentPane().add(cp);
            }
        });
    }

    public static void drawDiagram(double[][] data, String name) {
        // Diagram elkeszitese
        DefaultXYDataset ds = new DefaultXYDataset();
        ds.addSeries(name, data);
        JFreeChart chart = ChartFactory.createXYLineChart(name, "input size", "time", ds,
                PlotOrientation.VERTICAL, true, true, false);

        LogarithmicAxis xAxis = new LogarithmicAxis("input size");

        XYPlot plot = chart.getXYPlot();
        plot.setDomainAxis(xAxis);

        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer)plot.getRenderer();
        renderer.setSeriesShapesVisible(0, true);

        // Diagram megjelenitese
        showChart(chart);
    }
}
