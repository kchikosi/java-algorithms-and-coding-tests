package datastructures.sort;

import datastructures.utils.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {
    SelectionSort  selectionSort = new SelectionSort();
    int[] list = new int[] {100, 2, 3569, 45, 1, 89, 70, 56, 6, 13, 0};
    @Test
    public void testSelectionSort() {
        selectionSort.selectionSort(list);
        assertArrayEquals(new int[]{0, 1, 2, 6, 13, 45, 56, 70, 89, 100, 3569}, list);
    }
    @Test
    public void testRandomSelectionSort() {
        list = ArrayUtils.randomIntArray(10, 100);
        System.out.println(String.format("Before %s", Arrays.toString(list)));
        selectionSort.selectionSort(list);
        System.out.println(String.format("After  %s", Arrays.toString(list)));
    }
}