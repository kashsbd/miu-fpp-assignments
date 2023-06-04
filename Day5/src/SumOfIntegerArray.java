public class SumOfIntegerArray {
    public static void main(String[] args) {
        final int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of integer array using solution one is: " + sumIntegerArrayOne(arr));
        System.out.println("Sum of integer array using solution two is: " + sumIntegerArrayTwo(arr, arr.length));
    }

    private static int sumIntegerArrayOne(int[] arr) {
        if (arr.length == 0) return 0;

        int lastElement = arr[arr.length - 1];
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length - 1);

        return lastElement + sumIntegerArrayOne(newArray);
    }

    private static int sumIntegerArrayTwo(int[] arr, int length) {
        if (length == 0) return 0;

        int lastIndex = length - 1;

        return arr[lastIndex] + sumIntegerArrayTwo(arr, lastIndex);
    }
}
