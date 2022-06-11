package HT6LOW;

import java.math.BigDecimal;

public abstract class Employee {
    
    private String name;
    private BigDecimal salary;
    private BigDecimal bonus;

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public void set_Bonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public abstract void setBonus(BigDecimal bonus);

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal ToPay() {
        return salary.add(bonus);
    }
}
