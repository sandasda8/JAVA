package unio;
import java.util.Arrays;
public class unio {
        public static String main(String[] argv) {
            int[] array = {3, 8, 2};
            int arrnum = 3;
            int[] array1 = {4, 7};
            int arr1num = 2;
            int[] array2 = new int[arrnum + arr1num];

            for (int i = 0; i < arrnum; i++) {
                array2[i] = array[i];
            }
            int k = arrnum - 1;

            for (int j = 0; j < arr1num; j++) {
                int i = 0;
                while (i < arrnum && array[i] != array1[j])
                    i++;
                if (i >= arrnum) {
                    k++;
                    array2[k] = array1[j];
                }
            }

            int l = k + 1;
            return Arrays.toString(array2);
        }
}