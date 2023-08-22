package datastructures.linkedlist;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedListTest extends TestCase {
    List<SingleLinkedList.Node> intData = new ArrayList<>();
    List<SingleLinkedList.Node> stringData = new ArrayList<>();

/*    @Before
    public void setup() {
        intData.add(new SingleLinkedList.Node(1));
        intData.add(new SingleLinkedList.Node(2));
        intData.add(new SingleLinkedList.Node(3));
        intData.add(new SingleLinkedList.Node(4));
        intData.add(new SingleLinkedList.Node(5));
    }*/

    @Test
    public void testAppendVal() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.append(1);
        System.out.println(String.format("Result %s ", linkedList.head.val));
    }

    @Test
    public void testAppendNode() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        SingleLinkedList.Node node = new SingleLinkedList.Node();
        singleLinkedList.append(new SingleLinkedList.Node(4, node));
        System.out.println(String.format("Result %s ", singleLinkedList.head.val));
    }

    @Test
    public void testAppendNodes() {
        SingleLinkedList list =  new SingleLinkedList();
        intData.add(new SingleLinkedList.Node(1));
        intData.add(new SingleLinkedList.Node(2));
        intData.add(new SingleLinkedList.Node(3));
        intData.add(new SingleLinkedList.Node(4));
        intData.add(new SingleLinkedList.Node(5));
        intData.forEach(list::append);
        assertNotNull(list);
        SingleLinkedList.Node current = list.head;
        while (current != null) {
            System.out.println(String.format("Data %s", current.val));
            current = current.next;
        }
    }

}