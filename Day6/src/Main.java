public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("red", 100, 120);
        shapes[1] = new Circle("green", 12.3);
        shapes[2] = new Square("blue", 200);
        shapes[3] = new Rectangle("yellow", 110, 125);
        shapes[4] = new Circle("black", 15.7);

        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println("area: " + shape.calculateArea() + " perimeter: " + shape.calculatePerimeter());
        }
    }
}