package problem_four;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new CommissionEmployee(900000, 10),
                new HourlyEmployee(60, 200),
                new SalariedEmployee(2500),
                new BasePlusCommissionEmployee(750000)
        };

        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getPayment();
        }
        System.out.println("Total salaries of all employees: " + totalSalary);
    }
}
