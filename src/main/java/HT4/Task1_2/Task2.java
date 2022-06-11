package HT4.Task1_2;

public class Task2 {

    public static int[] transform(int[] array, SortOrder order) {
        int[] transformedArray = new int[array.length];
        if (Task1.isSorted(array, order)) {
            for (int i = 0; i<array.length; ++i){
                transformedArray[i] = array[i] + i;
            }
        }
        return transformedArray;
    }

}
