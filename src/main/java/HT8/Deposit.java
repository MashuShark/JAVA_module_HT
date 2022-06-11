package HT8;

import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit>{

    private BigDecimal Amount;
    private int Period;

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        this.Amount = depositAmount;
        this.Period = depositPeriod;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public int getPeriod() {
        return Period;
    }

    public abstract BigDecimal Income ();

    @Override
    public int compareTo(Deposit o) {
        return this.Income().compareTo(o.Income());

//        if (this.Income() == o.Income()) {
//           return 0;
//        } else if (this.Income().compareTo(o.Income()) == 1) {
//            return 1;
//        } else {
//            return -1;
//        }
    }

}
