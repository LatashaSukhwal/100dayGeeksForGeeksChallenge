#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

// Assuming a Node structure is defined like this:
struct Node {
    int data;
    Node* left;
    Node* right;
    Node(int val) : data(val), left(nullptr), right(nullptr) {}
};

class Solution {
public:
    bool isDeadEnd(Node* root) {
        queue<Node*> q;
        vector<int> leaf;
        vector<int> visited;
        q.push(root);

        while (!q.empty()) {
            Node* node = q.front();
            visited.push_back(node->data);
            q.pop();
            if (node->left) q.push(node->left);
            if (node->right) q.push(node->right);
            if (node->left == nullptr && node->right == nullptr) leaf.push_back(node->data);
        }

        int n = leaf.size();
        for (int i = 0; i < n; i++) {
            if ((leaf[i] == 1 && find(visited.begin(), visited.end(), 2) != visited.end()) ||
                (find(visited.begin(), visited.end(), leaf[i] - 1) != visited.end() &&
                 find(visited.begin(), visited.end(), leaf[i] + 1) != visited.end()))
                return true;
        }

        return false;
    }
};

class Day21 {
public:
    static void main() {
        Solution solution;

        // Example usage with a sample tree
        Node* root = new Node(5);
        root->left = new Node(3);
        root->right = new Node(8);
        root->left->left = new Node(2);
        root->left->right = new Node(4);
        root->right->left = new Node(6);
        root->right->right = new Node(9);

        if (solution.isDeadEnd(root)) {
            cout << "The tree has a dead end." << endl;
        } else {
            cout << "The tree does not have a dead end." << endl;
        }
    }
};

int main() {
    Day21::main();
    return 0;
}
