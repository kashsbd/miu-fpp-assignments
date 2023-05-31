public class Prog6 {
    public static int min(int[] arrayOfInts) {
        int minValue = 0;
        for (int eachValue : arrayOfInts) {
            if (eachValue < minValue) {
                minValue = eachValue;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] inputArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println("Minimum value is: " + Prog6.min(inputArray));
    }
}
