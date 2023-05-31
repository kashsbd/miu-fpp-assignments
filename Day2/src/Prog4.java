public class Prog4 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;

        float sum = a + b + c;

        int resultOne = (int) sum;
        int resultTwo = Math.round(sum);

        System.out.println("Result one: "+ resultOne);
        System.out.println("Result two: "+ resultTwo);
    }
}
