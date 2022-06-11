package HT3.Task1;

import java.util.Arrays;

public class Main {
    public static void task1(int[] array) throws IllegalArgumentException {

        if (array == null) {
        } else {
            for (int i = 0; i < array.length / 2; ++i) {
                if ((array[i] % 2 == 0) && (array[array.length - 1 - i] % 2 == 0)) {
                    int temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        {
            int[] array = null;
            task1(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[] {};
            task1(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[] { 10, 5, 3, 4 };
            task1(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[] { 100, 2, 3, 4, 5 };
            task1(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[] { 100, 2, 3, 45, 33, 8, 4, 54 };
            task1(array);
            System.out.println(Arrays.toString(array));
        }
    }


}