package datastructures.linkedlist;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedListTest extends TestCase {
    List<SingleLinkedList.Node> intData = new ArrayList<>();
    List<SingleLinkedList.Node> stringData = new ArrayList<>();

    @Test
    public void testAppendToList() {
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
        SingleLinkedList.display(list.head);
    }

    @Test
    public void testReverseList() {
        SingleLinkedList list =  new SingleLinkedList();
        intData.add(new SingleLinkedList.Node(1));
        intData.add(new SingleLinkedList.Node(2));
        intData.add(new SingleLinkedList.Node(3));
        intData.add(new SingleLinkedList.Node(4));
        intData.add(new SingleLinkedList.Node(5));
        intData.forEach(list::append);
        System.out.println("Before");
        SingleLinkedList.display(list.head);
        SingleLinkedList.Node n = list.reverse(list.head);
        System.out.println("After");
        SingleLinkedList.display(n);
    }

    @Test
    public void testContainsLoop() {
        SingleLinkedList linkedList = SingleLinkedList.createALoopInLinkedlist();
        System.out.println("Linked list contains loop => " + linkedList.containsLoop(linkedList.head));
        assertTrue(linkedList.containsLoop(linkedList.head));
    }

    @Test
    public void testDetectAndRemoveLoop() {
        SingleLinkedList linkedList = SingleLinkedList.createALoopInLinkedlist();
        assertTrue(linkedList.containsLoop(linkedList.head));
        linkedList.findAndRemoveLoop(linkedList.head);
        SingleLinkedList.display(linkedList.head);
        assertFalse(linkedList.containsLoop(linkedList.head));
    }

}