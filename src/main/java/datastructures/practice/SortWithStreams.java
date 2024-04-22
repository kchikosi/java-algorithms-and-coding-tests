package datastructures.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithStreams {

static String[] s = null;



    public SortWithStreams(String[] s) {
        this.s = s;
    }

    public SortWithStreams() {
    }

/*    public static void main(String args[]) {
        sort();
    }*/

    static void sort() {
        List<String> l = Arrays.asList(s);
        Arrays.stream(s).sorted()
                .collect(Collectors.toList());
        System.out.println(s);
    }
}
