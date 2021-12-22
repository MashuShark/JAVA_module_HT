package HT2;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
        int sum = 0;
        do {
            if ((value%10)%2 != 0) {
                sum = sum+(value%10);
            }
            value = value/10;
        } while (value>0);

        return sum;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
        int orig = value;
        int count = 0;
        while(value>0)
        {
            value = value >> 1 << 1;
            if(orig-value==1)
                count++;
            orig = value >> 1;
            value = orig;
        }
        return count;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        if (value <= 0)
            return 0;

        int fibo[]=new int[value+1];
        fibo[0] = 0; fibo[1] = 1;

        // Initialize result
        int sum = fibo[0] + fibo[1];

        // Add remaining terms
        for (int i=2; i<value; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    }
}
