import java.util.ArrayList;

class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int r = 0;
        for (int i = 0; i < V; i++) {
            r = r + adj.get(i).size();
        }
        return r;
    }
}

public class Day18 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testing the sumOfDependencies method
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Adding adjacency lists for each vertex
        adj.add(new ArrayList<>()); // Vertex 0
        adj.add(new ArrayList<>()); // Vertex 1
        adj.add(new ArrayList<>()); // Vertex 2
        adj.add(new ArrayList<>()); // Vertex 3
        adj.add(new ArrayList<>()); // Vertex 4

        // Adding edges to the graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        int result = solution.sumOfDependencies(adj, V);

        System.out.println("Sum of dependencies: " + result);
    }
}

