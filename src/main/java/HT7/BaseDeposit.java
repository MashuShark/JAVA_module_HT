package HT7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {
    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal Income() {
        BigDecimal percent = new BigDecimal(0.05);
        BigDecimal temp = getAmount();
        for (int i = 0; i < getPeriod(); ++i) {
            temp = temp.add(temp.multiply(percent));
        }
        temp = temp.subtract(getAmount());
        return temp.setScale(2, RoundingMode.CEILING);

    }

    @Override
    public String toString() {
        return "BaseDeposit{"+ Income() +"}";
    }
}
