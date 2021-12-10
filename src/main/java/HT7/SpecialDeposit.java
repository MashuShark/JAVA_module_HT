package HT7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit {
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
}
