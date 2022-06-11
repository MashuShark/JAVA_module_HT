package HT3.Task2;

public class Main {
    public static int maximumDistance(int[] array) {

        if (array == null ) return 0;
        else if (array.length == 0) return 0;
        else {
            int result = 0;
            int max = array[0];

            for (int i = 0; i < array.length; ++i) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == max) {
                    for (int j = i; j < array.length; ++j) {
                        if ((array[j] == max) && (j - i > result)) {
                            result = j - i;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        {
            int[] array = null;
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[] {};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[] { 4, 100, 3, 4 };
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[] { 5, 50, 50, 4, 5 };
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[] { 5, 350, 350, 4, 350 };
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[] { 10, 10, 10, 10, 10 };
            System.out.println("result = " + maximumDistance(array));
        }
    }
}
