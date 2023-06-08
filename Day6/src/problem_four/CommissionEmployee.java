package problem_four;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commsionRate;

    CommissionEmployee() {
    }

    CommissionEmployee(double grossSales, double commsionRate) {
        this.grossSales = grossSales;
        this.commsionRate = commsionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commsionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commsionRate=" + commsionRate +
                '}';
    }
}
