package HT4.Task4;

public class Main {
    public static double sumGeometricElements(int a1, double t, int alim) throws IllegalArgumentException {

        if (t <= 0 || t >= 1) throw new IllegalArgumentException();
        if (a1 == 0) throw new IllegalArgumentException();
        if (alim < 0 || alim >= a1) throw new IllegalArgumentException();

        if (alim != 0) {
            double sum = 0;
            for (int i = 0; (a1 * Math.pow(t, i)) > alim; ++i) {
                sum += (a1 * Math.pow(t, i));
            }
            int answer= (int) Math.round(sum);
            return answer;
        } else {
            int answer= (int) Math.round(a1/(1-t));
            return answer;
        }
    }

}
