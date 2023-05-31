import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};
        String[] tempArray = new String[inputArray.length];

        int tempArrayLenght = 0;
        for (String arrayItem : inputArray) {

            boolean containItem = false;
            for (int j = 0; j < tempArrayLenght; j++) {
                String uniqueArrayItem = tempArray[j];
                if (arrayItem.equals(uniqueArrayItem)) {
                    containItem = true;
                    break;
                }
            }

            if (!containItem) {
                tempArray[tempArrayLenght] = arrayItem;
                tempArrayLenght++;
            }
        }

        String[] resultArray = new String[tempArrayLenght];
        System.arraycopy(tempArray,0,resultArray, 0, tempArrayLenght);

        System.out.println(Arrays.toString(resultArray));
    }
}