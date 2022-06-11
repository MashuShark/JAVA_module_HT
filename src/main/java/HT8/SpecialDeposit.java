package HT8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit implements Prolongable {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal Income() {

        BigDecimal percent = new BigDecimal(0.01);
        BigDecimal temp = getAmount();
        for (int i = 0; i < getPeriod(); ++i) {
            temp = temp.add(temp.multiply(percent));
            percent = percent.add(new BigDecimal(0.01));
        }
        temp = temp.subtract(getAmount());
        return temp.setScale(2, RoundingMode.CEILING);

    }

    @Override
    public String toString() {
        return "SpecialDeposit{"+ Income() +"}";
    }

    @Override
    public boolean canToProlong() {
        // (SpecialDeposit) can be prolonged only when more than
        //1000 UAH were deposited
        if (getAmount().compareTo(new BigDecimal(1000)) == 1 ){
            return true;
        }
        else return false;
    }
}
