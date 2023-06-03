public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Number of digit is: " + countDigit(0));
    }

    private static int countDigit(int num) {
        if (num < 10) return 1;
        int newDigit = num / 10;
        return 1 + countDigit(newDigit);
    }
}
