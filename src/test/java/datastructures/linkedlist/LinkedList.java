package datastructures.linkedlist;

/**
 * Singly linked list
 * picture a linked as a stack or a queue
 */
public class LinkedList {
    Node head;

    /**
     * add element to end of list
     *
     * @param data
     */
    public void append(int data) {
        //if new list, no elements
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    /**
     * add element to the front, new head
     */
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    /**
     * remove element from list
     *
     * @param data
     */
    public void deleteWithValue(int data) {
        if (head == null) return;
        //if value is the head..
        if (head.data == data) {
            head = head.next;
            return;
        }
        //iterate through through the list and test the value
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    /**
     * inner class to manage list
     */
    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
