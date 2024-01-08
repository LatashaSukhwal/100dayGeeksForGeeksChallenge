class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Day58 {
    public static void main(String[] args) {
        // Create some sample linked lists
        Node node1 = new Node(1);
        node1.next = new Node(3);
        node1.next.next = new Node(5);

        Node node2 = new Node(2);
        node2.next = new Node(4);
        node2.next.next = new Node(6);

        // Create an instance of the GfG class
        GfG gfg = new GfG();

        // Reverse the linked lists
        Node reversedNode1 = gfg.reverse(node1);
        Node reversedNode2 = gfg.reverse(node2);

        // Merge the reversed linked lists
        Node mergedResult = gfg.mergeResult(reversedNode1, reversedNode2);

        // Print the merged result
        while (mergedResult != null) {
            System.out.print(mergedResult.data + " ");
            mergedResult = mergedResult.next;
        }
    }
}
