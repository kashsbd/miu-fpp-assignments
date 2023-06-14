import java.util.Comparator;
import java.util.Objects;

public class Marketing  {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing o1 = (Marketing) o;
        return Double.compare(o1.salesAmount, salesAmount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }
}
