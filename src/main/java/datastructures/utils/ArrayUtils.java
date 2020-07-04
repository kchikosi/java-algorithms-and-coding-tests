package datastructures.utils;

import java.util.Random;

public class ArrayUtils {
    private static Random intGenerator = new Random();

    /**
     * generate an array of random values
     * @param length array size
     * @param bound  max int value
     * @return
     */
    public static int[] randomIntArray(int length, int bound) {
        int[] numArray = new int[length];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = intGenerator.nextInt(bound);
        }
        return numArray;
    }
}
