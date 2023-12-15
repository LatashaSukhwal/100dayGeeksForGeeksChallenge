#include <iostream>

using namespace std;

class Solution {
public:
    long countSubarrays(int a[], int n, int l, int r) {
        long start = 0, ans = 0, empire = 0;
        for (long end = 0; end < n; end++) {
            if (a[end] >= l && a[end] <= r) {
                // king
                empire = end - start + 1;
            }

            if (a[end] > r) {
                // villain
                empire = 0;      // king ka empire tut gaya
                start = end + 1; // naya empire
            }
            ans = ans + empire;
        }
        return ans;
    }
};

class Day26 {
public:
    static void main() {
        Solution solution;

        // Example usage with a sample array
        int a[] = {2, 1, 4, 3};
        int n = sizeof(a) / sizeof(a[0]);
        int l = 2, r = 3;

        long result = solution.countSubarrays(a, n, l, r);

        cout << "Number of subarrays with king's empire: " << result << endl;
    }
};

int main() {
    Day26::main();
    return 0;
}

