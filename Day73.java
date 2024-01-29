import java.util.ArrayList;
import java.util.List;

public class Day73 {
    static class Solution {
        public boolean solve(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int prev, int vertex) {
            vis[vertex] = true;
            for (int i : graph.get(vertex)) {
                if (i == prev)
                    continue;
                else if (!vis[i]) {
                    if (!solve(graph, vis, vertex, i))
                        return false;
                } else
                    return false;
            }
            return true;
        }

        public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
            boolean vis[] = new boolean[n];
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                graph.get(edges.get(i).get(0)).add(edges.get(i).get(1));
                graph.get(edges.get(i).get(1)).add(edges.get(i).get(0));
            }
            if (!solve(graph, vis, -1, 0))
                return false;
            for (boolean i : vis)
                if (!i)
                    return false;
            return true;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Example graph input
        int n = 5;
        int m = 4;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(0, 1)));
        edges.add(new ArrayList<>(List.of(0, 2)));
        edges.add(new ArrayList<>(List.of(0, 3)));
        edges.add(new ArrayList<>(List.of(1, 4)));

        boolean isTree = solution.isTree(n, m, edges);
        System.out.println("Is the graph a tree? " + isTree);
    }
}
