#include <iostream>

using namespace std;

class Solution {
public:
    int isRepresentingBST(int arr[], int N) {
        if (N == 0 || N == 1)
            return true;

        for (int i = 1; i < N; i++)
            if (arr[i - 1] > arr[i])
                return false;
        return true;
    }
};

class Day22 {
public:
    static void main() {
        Solution solution;

        // Example usage with an array
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 4, 3, 2, 1};

        if (solution.isRepresentingBST(arr1, 5)) {
            cout << "arr1 represents a BST." << endl;
        } else {
            cout << "arr1 does not represent a BST." << endl;
        }

        if (solution.isRepresentingBST(arr2, 5)) {
            cout << "arr2 represents a BST." << endl;
        } else {
            cout << "arr2 does not represent a BST." << endl;
        }
    }
};

int main() {
    Day22::main();
    return 0;
}
