package min;

import java.util.Arrays;
public class minimumkivalasztas {

    public static void main(String[] args) {
        int[] array = {47, 56, 2345, 844, 9};
        for (int i = 0; array.length > i; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}