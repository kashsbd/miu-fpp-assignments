package problem_five;

public class Main {
    public static void main(String[] args) {
        Computer computerOne = new Computer("NameTest", "ProcessorTest", 1024, 3.1);
        Computer computerTwo = new Computer("NameTestTwo", "ProcessorTestTwo", 2048, 4.1);

        System.out.println(computerOne.equals(computerTwo));

        System.out.println("Computer one hash code: " + computerOne.hashCode());
        System.out.println("Computer two hash code: " + computerTwo.hashCode());

        System.out.println(computerOne.hashCode() == computerTwo.hashCode());
    }
}
