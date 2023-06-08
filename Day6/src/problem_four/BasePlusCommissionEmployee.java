package problem_four;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    BasePlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return super.getPayment() + baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
