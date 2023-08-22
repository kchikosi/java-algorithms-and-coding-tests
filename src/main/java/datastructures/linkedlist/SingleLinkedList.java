package datastructures.linkedlist;

/**
 * Singly linked list
 * picture a linked as a stack or a queue
 */
public class SingleLinkedList {
    Node head;

    /**
     * add element to end of list
     *
     * @param val
     */
    public void append(int val) {
        //if new list, no elements
        if (head == null) {
            head = new Node(val);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);
    }

    /**
     * add element to end of list
     *
     * @param node
     */
    public void append(Node node) {
        //if new list, no elements
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }


    /**
     * add element to the front, new head
     */
    public void prepend(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    /**
     * remove element from list
     *
     * @param val
     */
    public void deleteWithValue(int val) {
        if (head == null) return;
        //if value is the head..
        if (head.val == val) {
            head = head.next;
            return;
        }
        //iterate through through the list and test the value
        Node current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    /**
     * inner class to manage list
     */
    public static class Node {
        int val;
        Node next;
        public Node() {
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
    }
}
