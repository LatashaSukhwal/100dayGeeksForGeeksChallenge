class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Day8 {
    public static void main(String[] args) {
        // Creating a doubly linked list for testing
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original Doubly Linked List:");
        printDLL(head);

        // Reversing the doubly linked list
        head = reverseDLL(head);

        System.out.println("\nReversed Doubly Linked List:");
        printDLL(head);
    }

    public static Node reverseDLL(Node head) {
        Node temp = head;
        Node prev = null;
        Node next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            temp.prev = next;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

