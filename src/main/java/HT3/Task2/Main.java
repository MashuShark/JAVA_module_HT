package HT3.Task2;

public class Main {
    public static int task2(int[] arr){
        int result = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] == max){
                for (int j = i; j < arr.length; ++j){
                    if ((arr[j] == max) && (j-i > result)){
                        result = j-i;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {4, 100, 3, 4};
        int[] test2 = {5, 50, 50, 4, 5};
        int[] test3 = {5, 350, 350, 4, 350};
        int[] test4 = {10, 10, 10, 10, 10};
        System.out.println(task2(test1) );
        System.out.println(task2(test2) );
        System.out.println(task2(test3) );
        System.out.println(task2(test4) );
    }
}
