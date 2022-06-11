package HT6ADV;

import java.math.BigDecimal;

public class Manager extends Employee {

    private int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }


    public void setBonus(BigDecimal bonus) {

        if (bonus == null) {
            throw new NullPointerException();
        } else if (quantity > 100 && quantity <= 150) {
            super.set_Bonus(bonus.multiply(new BigDecimal(2)));
        } else if (quantity > 150) {
            super.set_Bonus(bonus.multiply(new BigDecimal(3)));
        } else super.set_Bonus(bonus);

    }
}