public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Reversed digit is: " + reverseDigit(0));
    }

    private static int reverseDigit(int num) {
        if (num < 10) return num;

        int powerOfTen = (int) Math.log10(num);
        int lastDigit = num % 10;
        int newDigit = num / 10;

        return (lastDigit * (int) Math.pow(10, powerOfTen) + reverseDigit(newDigit));
    }

}
