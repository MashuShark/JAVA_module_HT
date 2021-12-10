package HT4.Task4;

public class Main {
    public static double SumGeometricElements(int a1, double t, int alim){

        int sum = 0;
        for (int i = 0; (a1 * Math.pow(t, i)) > alim; ++i){
            sum += (a1 * Math.pow(t, i));
        }
        return sum;

    }
}
