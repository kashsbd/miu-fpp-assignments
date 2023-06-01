public class ThreeInstanceClass {
    private static int instanceCounter = 0;

    public ThreeInstanceClass() {
        if (instanceCounter < 4) {
            instanceCounter++;
        } else {
            System.out.println("More than three instances are created.");
        }
    }

    public int getInstanceCounter() {
        return instanceCounter;
    }

    public static void main(String[] args) {
        ThreeInstanceClass threeInstanceClass = null;
        for (int i = 0; i < 3; i++) {
            threeInstanceClass = new ThreeInstanceClass();
        }
        System.out.println("Number of created instances: " + threeInstanceClass.getInstanceCounter());
    }
}
