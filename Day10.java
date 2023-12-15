import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution {
    int count = 0;

    void helper(Node root, int k, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        int size = path.size();
        int sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) {
                count++;
            }
        }
        helper(root.left, k, path);
        helper(root.right, k, path);
        path.remove(path.size() - 1);
    }

    public int sumK(Node root, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        helper(root, k, path);
        return count;
    }
}

public class Day10 {
    public static void main(String[] args) {
        // Creating a sample binary tree for testing
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(-3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);

        Solution solution = new Solution();

        // Testing the sumK method
        int k = 8;
        int result = solution.sumK(root, k);

        System.out.println("Number of paths with sum " + k + ": " + result);
    }
}
