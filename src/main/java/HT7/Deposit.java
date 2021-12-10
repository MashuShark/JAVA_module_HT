package HT7;

import java.math.BigDecimal;

public abstract class Deposit {

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

}
