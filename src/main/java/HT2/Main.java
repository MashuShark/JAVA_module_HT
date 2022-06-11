package HT2;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */

    public static int task1(int n) throws IllegalArgumentException {

        if ( n > 0 ) {
            int sum = 0;
            do {
                if ((n % 10) % 2 != 0) {
                    sum = sum + (n % 10);
                }
                n = n / 10;
            } while (n > 0);

            return sum;
        }
        else throw new IllegalArgumentException();

    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) throws IllegalArgumentException{
        if (n <= 0) throw new IllegalArgumentException();
        else {
            int orig = n;
            int count = 0;
            while (n > 0) {
                n = n >> 1 << 1;
                if (orig - n == 1)
                    count++;
                orig = n >> 1;
                n = orig;
            }
            return count;
        }
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int n) throws IllegalArgumentException{
        if (n <= 0)
            throw new IllegalArgumentException();

        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;

        // Initialize result
        int sum = fibo[0] + fibo[1];

        // Add remaining terms
        for (int i=2; i<n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    }
}
