package HT4.Task1_2;

public class Task1 {

    public static boolean isSorted(int[] array, SortOrder order) throws IllegalArgumentException{

        if (array == null && order == null) throw new IllegalArgumentException();
        if (array == null ) throw new IllegalArgumentException();
        if (array.length == 0 ) throw new IllegalArgumentException();
        else if (order == SortOrder.ASC){

            for(int i=0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    return false;
                }
            }
            return true;

        }

        else if (order == SortOrder.DESC) {

            for(int i=0; i < array.length-1; i++) {
                if(array[i] < array[i+1]) {
                    return false;
                }
            }
            return true;

        }
        else return false;
    }

}