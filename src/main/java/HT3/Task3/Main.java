package HT3.Task3;

public class Main {
    public static int[][] task3(int[][] arr){

        for (int i = 0; i < arr.length; ++i){
            for (int j = 0; j < i; ++j){
                arr[i][j] = 0;
            }
        }
        for (int j = 0; j < arr.length; ++j) {
            for (int i = 0; i < j ; ++i) {
                arr[i][j] = 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultArray = task3(a);
        for (int i = 0; i < resultArray.length; ++i){
            for (int j = 0; j < resultArray[0].length; ++j){
                System.out.print(resultArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
