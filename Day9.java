class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day9 {
    public static void main(String[] args) {
        // Creating two linked lists for testing
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        System.out.println("Linked List 1:");
        printLinkedList(head1);

        System.out.println("Linked List 2:");
        printLinkedList(head2);

        // Finding the intersection of the linked lists
        Node intersection = findIntersection(head1, head2);

        System.out.println("\nIntersection Linked List:");
        printLinkedList(intersection);
    }

    public static Node findIntersection(Node head1, Node head2) {
        Node head = new Node(0); // Dummy node to simplify code
        Node temp = head;

        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                Node intersectionNode = new Node(head1.data);
                temp.next = intersectionNode;
                temp = intersectionNode;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data > head2.data) {
                head2 = head2.next;
            } else {
                head1 = head1.next;
            }
        }

        return head.next; // Return the intersection list, excluding the dummy node
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

