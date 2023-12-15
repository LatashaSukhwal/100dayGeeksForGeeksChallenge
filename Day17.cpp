#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    // Function to detect cycle using DSU in an undirected graph.

    int findPar(vector<int>& parent, int node) {
        if (parent[node] == node) return node;

        return parent[node] = findPar(parent, parent[node]);
    }

    bool unionSet(int i, int j, vector<int>& parent) {
        int u = findPar(parent, i);
        int v = findPar(parent, j);

        if (u != v) {
            parent[u] = v;
            return false;
        }

        return true;
    }

    int detectCycle(int V, vector<int> adj[]) {
        // Code here
        vector<int> parent(V);
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                // i < adj[i][j] to handle the case for 1->2 and 2->1 not considered as a cycle
                if (i < adj[i][j] && unionSet(i, adj[i][j], parent)) {
                    return 1;
                }
            }
        }

        return 0;
    }
};

class Day17 {
public:
    static void main() {
        Solution solution;

        // Testing the detectCycle method
        int V = 4;
        vector<int> adj[V];

        // Adding edges to create a cycle
        adj[0].push_back(1);
        adj[1].push_back(2);
        adj[2].push_back(3);
        adj[3].push_back(0);

        int result = solution.detectCycle(V, adj);

        if (result) {
            cout << "The graph contains a cycle." << endl;
        } else {
            cout << "The graph does not contain a cycle." << endl;
        }
    }
};

int main() {
    Day17::main();
    return 0;
}
