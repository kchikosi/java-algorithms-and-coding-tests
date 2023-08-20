package datastructures.linkedlist;

import junit.framework.TestCase;
import org.junit.Test;

public class LinkedListTest extends TestCase {
    @Test
    public void testAppend() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        System.out.println(String.format("Result %s ", linkedList.head.data));
    }
}