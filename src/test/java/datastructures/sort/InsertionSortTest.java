package datastructures.sort;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest extends TestCase {
    int[] list = new int[]{4, 1, 6, 5, 2, 3};

    @Test
    public void testInsertionSort() {

        System.out.println(String.format("Before  %s", Arrays.toString(list)));

        int[] result = InsertionSort.sort(list);

        System.out.println(String.format("After  %s", Arrays.toString(result)));


    }
}