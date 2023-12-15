class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution {
    // Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.data != root2.data)
            return false;
        return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
    }
}

public class Day11 {
    public static void main(String[] args) {
        // Creating two identical trees for testing
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        Solution solution = new Solution();

        // Testing the isIdentical method
        boolean result = solution.isIdentical(root1, root2);

        if (result) {
            System.out.println("The trees are identical.");
        } else {
            System.out.println("The trees are not identical.");
        }
    }
}
