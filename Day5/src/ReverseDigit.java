public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Reversed digit using solution one is : " + reverseDigitOne(1234));
        System.out.println("Reversed digit using solution two is : " + reverseDigitTwo(123456));
    }

    private static int reverseDigitOne(int num) {
        if (num < 10) return num;

        int powerOfTen = (int) Math.log10(num);
        int lastDigit = num % 10;
        int newDigit = num / 10;

        return (lastDigit * (int) Math.pow(10, powerOfTen) + reverseDigitOne(newDigit));
    }

    private static int reverseDigitTwo(int num) {
        if (num < 10) return num;

        int powerOfTen = CountDigit.countDigit(num) - 1;
        int lastDigit = num % 10;
        int newDigit = num / 10;

        return (lastDigit * (int) Math.pow(10, powerOfTen) + reverseDigitTwo(newDigit));
    }

}
