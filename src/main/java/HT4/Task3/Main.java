package HT4.Task3;

public class Main {
    public static int multiArithmeticElements(int a1, int t, int n) throws IllegalArgumentException{

        if (n <=0) throw new IllegalArgumentException();

        int multi = 1;
        for (int i = 0; i < n; ++i) {
            multi *= a1 + (i * t);
        }
        return multi;

    }

}
