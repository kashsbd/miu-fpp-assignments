public class Prog1 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1, 9);
        double resultOne = Math.pow(Math.PI, x);
        System.out.println("Result one: " + resultOne);

        int y = RandomNumbers.getRandomInt(3, 14);
        double resultTwo = Math.pow(y, Math.PI);
        System.out.println("Result two: " + resultTwo);
    }
}
