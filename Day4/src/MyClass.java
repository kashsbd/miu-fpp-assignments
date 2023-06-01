public class MyClass {
    private int a = 0;
    private String b = "";

    private static int staticAttribute = staticMethod();

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public static int staticMethod() {
        System.out.println("Inside static method");
        return 0;
    }

    public static void printB() {
        System.out.println("Printing B.");
    }

    {
        System.out.println("Instance initialization block one.");
    }

    {
        System.out.println("Instance initialization block two.");
    }

    static {
        System.out.println("Static initialization block one.");
    }

    static {
        System.out.println("Static initialization block two.");
    }

    public MyClass() {
        System.out.println("Inside default constructor.");
    }

    public MyClass(int a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside constructor.");
    }
}
