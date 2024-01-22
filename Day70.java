import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Day70 {
    public static void main(String[] args) {
        // Example usage
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);

        int targetSum = 22;

        ArrayList<ArrayList<Integer>> result = Solution.printPaths(root, targetSum);

        System.out.println("Paths with sum " + targetSum + ":");
        for (ArrayList<Integer> path : result) {
            System.out.println(path);
        }
    }
}

class Solution {
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(root, sum, 0, list, new ArrayList<Integer>());
        return list;
    }  

    private static void helper(Node root, int target, int sum, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> curr) {
        if (root == null) return;
        curr.add(root.data);
        sum += root.data;
        if (sum == target) list.add(new ArrayList<>(curr));
        helper(root.left, target, sum, list, curr);
        helper(root.right, target, sum, list, curr);
        curr.remove(curr.size() - 1);
    }
}
