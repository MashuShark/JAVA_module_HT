package HT7;

import java.math.BigDecimal;
import java.util.Arrays;

public class Client {

    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public Deposit[] getDeposits() {

        return deposits;
    }

//    public void setDeposits(int i, Deposit deposit) {
//        this.deposits[i] = deposit;
//    }


    public Deposit getDeposit(int i) {
        return this.deposits[i];
    }

    public boolean AddDeposit(Deposit deposit) {
        for (int i = 0; i < 10; ++i) {
            if (getDeposit(i) == null) {
                //setDeposits(i, deposit);
                this.deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal TotalIncome() {
        BigDecimal count = new BigDecimal(0);
        for (int i = 0; i < 10; ++i) {
            if (getDeposit(i) != null)
                count = count.add(GetIncomeByNumber(i));
        }
        return count;
    }

    public BigDecimal MaxIncome () {
        BigDecimal temp = new BigDecimal(0);
        for (int i = 0; i < 10; ++i) {
            if (GetIncomeByNumber(i).compareTo(temp) == 1) {
                temp = GetIncomeByNumber(i);
            }
        }
        return temp;
    }

    public BigDecimal GetIncomeByNumber (int number){
        if (getDeposit(number) == null )
            return new BigDecimal(0);
        return getDeposit(number).Income();
    }

    @Override
    public String toString() {
        return "Client{" +
                "deposits=" + Arrays.toString(deposits) +
                '}';
    }
}
