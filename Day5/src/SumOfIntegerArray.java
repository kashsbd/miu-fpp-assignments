public class SumOfIntegerArray {
    public static void main(String[] args) {
        System.out.println("Sum of integer array is: " + sumIntegerArray(new int[]{1, 2, 3}));
    }

    private static int sumIntegerArray(int[] arr) {
        if (arr.length == 0) return 0;

        int lastElement = arr[arr.length - 1];
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length - 1);

        return lastElement + sumIntegerArray(newArray);
    }
}
