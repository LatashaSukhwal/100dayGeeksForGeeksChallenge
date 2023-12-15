import java.util.ArrayList;
import java.util.List;

class Solution {
    public int isEulerCircuit(int V, List<Integer>[] adj) {
        int odd = 0, ev = 0;
        // counting degree of all nodes, odd and even degree nodes
        for (int i = 0; i < V; i++) {
            if (adj[i].size() % 2 == 0) ev++;
            else odd++;
        }

        // for an undirected graph
        // Euler circuit must have all nodes with an even degree
        // Euler circuit must have all even-degree nodes with at most 2 odd-degree nodes
        if (ev == V) return 2;
        else if (odd > 0 && odd == 2) return 1;
        return 0;
    }
}

public class Day19 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testing the isEulerCircuit method
        int V = 4;
        List<Integer>[] adj = new ArrayList[V];

        // Initializing adjacency lists
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        adj[0].add(1);
        adj[1].add(2);
        adj[2].add(3);
        adj[3].add(0);

        int result = solution.isEulerCircuit(V, adj);

        if (result == 2) {
            System.out.println("The graph has an Euler Circuit.");
        } else if (result == 1) {
            System.out.println("The graph has an Euler Path.");
        } else {
            System.out.println("The graph does not have an Euler Circuit or Path.");
        }
    }
}
