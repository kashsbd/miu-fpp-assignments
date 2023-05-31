package problem_three;

final public class Triangle {
    final private double base;
    final private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }
}
