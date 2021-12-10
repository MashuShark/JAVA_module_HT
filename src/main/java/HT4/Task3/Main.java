package HT4.Task3;

public class Main {
    public static int MultArithmeticElements(int a1, int t, int n){

        int multi = 1;
        for (int i = 0; i < n; ++i){
            multi *= a1 + (i * t);
        }
        return multi;

    }
}
