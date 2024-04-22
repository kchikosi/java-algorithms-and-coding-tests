package datastructures.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class SortWithStreamsTest extends TestCase {

    @Test
    public void testSort() {
        String[] arr = new String[] {};
        SortWithStreams sws =  new SortWithStreams(arr);
        sws.sort();
    }
}