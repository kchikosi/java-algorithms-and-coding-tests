package datastructures.sort;

/*
 * after comparing element to the left, shift element to the right to make room to insert value
 * demo: https://www.youtube.com/watch?v=8mJ-OhcfpYg
 */
public class InsertionSort {

    public static int[] sort(int[] list) {
        for (int currPos = 1; currPos < list.length; currPos++) {
            int hold = list[currPos];
            int prevPos = currPos - 1;
            while (prevPos >= 0 && list[prevPos] > hold) {
                list[prevPos + 1] = list[prevPos];
                prevPos--;
            }
            list[prevPos + 1] = hold;
        }
        return list;
    }
}
