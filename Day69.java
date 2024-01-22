import java.util.Arrays;

class Day69 {
    public static void main(String[] args) {
        // Example usage
        int n = 5;  // Number of vertices
        int m = 4;  // Number of edges

        int[][] edges = {
            {1, 2},
            {1, 3},
            {2, 4},
            {3, 5}
        };

        int result = Solution.vertexCover(n, m, edges);

        System.out.println("Minimum Vertex Cover Size: " + result);
    }
}

class Solution {
    public static int vertexCover(int n, int m, int[][] edges) {
        // code here
        boolean[][] graph = new boolean[n][n];
        for (int[] edge : edges) {
            // Adjusting 1-based indexing to 0-based
            graph[edge[0] - 1][edge[1] - 1] = true;
            graph[edge[1] - 1][edge[0] - 1] = true;
        }

        boolean[] visited = new boolean[n];
        int minCoverSize = n;  // Start with the maximum possible size

        minCoverSize = findMinCover(graph, visited, 0, 0, minCoverSize);

        return minCoverSize;
    }

    private static int findMinCover(boolean[][] graph, boolean[] visited, int start, int size, int minCoverSize) {
        if (start == graph.length) {
            if (isVertexCover(graph, visited) && size < minCoverSize) {
                minCoverSize = size;
            }
            return minCoverSize;
        }

        // Don't include the current vertex in the cover
        minCoverSize = findMinCover(graph, Arrays.copyOf(visited, visited.length), start + 1, size, minCoverSize);

        // Include the current vertex in the cover
        visited[start] = true;
        minCoverSize = findMinCover(graph, Arrays.copyOf(visited, visited.length), start + 1, size + 1, minCoverSize);

        return minCoverSize;
    }

    private static boolean isVertexCover(boolean[][] graph, boolean[] visited) {
        for (int u = 0; u < graph.length; u++) {
            for (int v = 0; v < graph[u].length; v++) {
                if (graph[u][v] && !(visited[u] || visited[v])) {
                    return false;
                }
            }
        }
        return true;
    }
}
