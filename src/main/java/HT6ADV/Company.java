package HT6ADV;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void GiveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee e: this.employees
        ) {
            e.setBonus(companyBonus);
        }
    }

    public BigDecimal TotalToPay(){
        BigDecimal total = new BigDecimal(0);
        for (Employee e: this.employees)
        {
            total.add(e.ToPay());
        }
        return total;
    }

    public String NameMaxSalary(){
        BigDecimal max = new BigDecimal(0);
        String name = "no salaries found";
        for (Employee e: this.employees
        ) {
            if (max.compareTo(e.ToPay()) == -1) {
                max = e.ToPay();
                name = e.getName();
            }
        }
        return name;
    }

}