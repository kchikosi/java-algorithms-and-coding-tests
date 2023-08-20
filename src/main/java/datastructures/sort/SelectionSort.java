package datastructures.sort;

/* Sort numbers in ascending order using selection sort
 *  process: first pass, starting at position 0, find the smallest number to the left in the entire list,
 * interchange smallest with position 0.
 * second pass , starting at position 1, find the smallest number on the right, interchange
 * the smallest with position 1.
 * repeat until the end.
 * demo: https://www.youtube.com/watch?v=EwjnF7rFLns
 * */
public class SelectionSort {

    /**
     * main method
     * for loop
     *  - first becomes current, last is list length minus one
     *  - loop until end of list
     * @param list of numbers
     * @return
     */
    public static int[] selectionSort(int[] list) {
        int first = 0;
        int last = list.length-1;
        for (int current = first; current < last; current++) {
            int smallest = getSmallest(list, current, last);
            swap(list, current, smallest);
        }
        return list;
    }

    /**
     *
     * @param list
     * @param current
     * @param last
     * @return
     */
    private static int getSmallest(int[] list, int current, int last) {
        int smallest = current;
        for (int next = smallest + 1; next <= last; next++) {
            if (list[next] < list[smallest]) smallest = next;
        }
        return smallest;
    }

    /**
     *
     * @param list
     * @param current
     * @param smallest
     */
    private static void swap(int[] list, int current, int smallest) {
        int hold = list[current];
        list[current] = list[smallest];
        list[smallest] = hold;
    }
}
