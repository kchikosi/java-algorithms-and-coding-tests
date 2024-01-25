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

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(String.format("%s -> ", current.val));
            current = current.next;
        }
        System.out.print("\n");
    }

    /**
     * reverse a linked list
     * Given a list Before 1 -> 2 -> 3 -> 4 -> 5, After reverse 5 -> 4 -> 3 -> 2 -> 1
     * Demo https://www.youtube.com/watch?v=jY-EUKXYT20
     *
     * @param head
     * @return
     */
    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * Demo: https://www.youtube.com/watch?v=rOpnLs0lXy0
     *
     * @param head
     * @return
     */
    public boolean containsLoop(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    /**
     * Use this function to detect location of the loop
     * call a function break the loop
     * https://www.youtube.com/watch?v=LWDVM_kgvdE
     *
     * @param head
     */
    public void findAndRemoveLoop(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                removeLoop(slowPtr, head);
                return;
            }
        }
    }

    /**
     * Demo: https://www.youtube.com/watch?v=LWDVM_kgvdE
     *
     * @param slowPtr
     */
    private void removeLoop(Node slowPtr, Node head) {
        Node temp = head;
        while (slowPtr.next != temp.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    /**
     * create a loop in a linked list
     * 1 -> 2 -> 3 -> 4
     * 		     |    |
     * 		     6 <- 5
     * @return
     */

    public static SingleLinkedList createALoopInLinkedlist() {
        SingleLinkedList list = new SingleLinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        return list;
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
