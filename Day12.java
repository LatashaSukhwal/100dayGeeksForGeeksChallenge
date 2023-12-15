class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class GfG {
    // Function to check if two trees are mirrors of each other
    public static boolean isMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.data == root2.data) {
            return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        }
        return false;
    }

    // Function to check if a tree is symmetric
    public static boolean isSymmetric(Node root) {
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }
}

public class Day12 {
    public static void main(String[] args) {
        // Creating a symmetric tree for testing
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        GfG gfg = new GfG();

        // Testing the isSymmetric method
        boolean result = gfg.isSymmetric(root);

        if (result) {
            System.out.println("The tree is symmetric.");
        } else {
            System.out.println("The tree is not symmetric.");
        }
    }
}
