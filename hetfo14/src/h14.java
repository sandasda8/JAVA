import java.util.Arrays;

public class h14 {
    public static void main(String[] args) {
        //  first(args);
       third(args);
    }

    public static void first(String[] args) {

        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        for (int j = args.length - 1; j >= 0; j--) {
            System.out.println(args[j]);
        }
    }

    public static void third(String[] args) {
        int[] array = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);

        }
        for(int i = 0; i < args.length; i++) {
            System.out.println(array[2]);
           // System.out.println(array[2]+" "+args[3]);
           // System.out.println(array[2]+" "+args[3]+" "+args[4]);
           // System.out.println(array[2]+" "+args[3]+" "+args[4]+" "+args[5]);
           // System.out.println(array[2]+" "+args[3]+" "+args[4]+" "+args[5]+" "+args[6]);
        }
    }
}
