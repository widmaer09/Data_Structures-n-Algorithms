package Arrays;

import java.util.Random;

public class arrayHelper {
    int[] intArray;

    arrayHelper(int howMany) {

        intArray = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            Random rand = new Random();
            int n = rand.nextInt(10);
            intArray[i] = n;
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < intArray.length; i++) {
            sb.append(intArray[i]).append(", ");

        }
        return sb.toString();
    }

}
