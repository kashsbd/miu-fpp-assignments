import java.util.Arrays;

public class Prog5 {
    public int[] combine(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static void main(String[] args) {
        Prog5 prog5 = new Prog5();
        int[] result = prog5.combine(new int[]{5, 6, -4, 3, 1}, new int[]{3, 8, 9, 11});
        System.out.println("Result is: " + Arrays.toString(result));
    }
}
