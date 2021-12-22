package HT3.Task1;

public class Main {
    public static int[] task1(int[] arr){
        for (int i = 0; i<arr.length/2; ++i){
            if ((arr[i]%2 == 0) && (arr[arr.length-1-i]%2 == 0)){
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        }

        return arr;
    }
}
