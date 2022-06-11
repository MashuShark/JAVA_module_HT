package HT8;

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
//    public BigDecimal Income() {
//        int percent = 5;
//        BigDecimal temp = getAmount();
//        BigDecimal deposit = new BigDecimal(0);
//        for (int i = 0; i <= percent; ++i) {
//            deposit = temp.add(((temp.multiply(new BigDecimal(percent))).divide(new BigDecimal(100), 2)));
//            temp = deposit;
//        }
//        BigDecimal income = deposit.subtract(getAmount());
//        return income;
    @Override
    public String toString() {
        return "BaseDeposit{"+ Income() +"}";
    }

}
