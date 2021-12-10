package HT6ADV;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    private int percent;


    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    public void setBonus(BigDecimal bonus){
        if (bonus == null) {
            throw new NullPointerException();
        } else if (this.percent > 100 && this.percent <= 200) {
            super.set_Bonus(bonus.multiply(new BigDecimal(2)));
        } else if (percent > 200) {
            super.set_Bonus(bonus.multiply(new BigDecimal(3)));
        }  else super.set_Bonus(bonus);
    }

}