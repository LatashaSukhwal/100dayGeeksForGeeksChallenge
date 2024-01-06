#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]) {
        vector<pair<int, int>> temp;
        for(int i = 0; i < n; i++) {
            temp.push_back({price[i], i + 1});
        }
        sort(temp.begin(), temp.end());
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(k < temp[i].first) break;
            if((k / temp[i].first) > temp[i].second) {
                ans += temp[i].second;
                k -= (temp[i].second * temp[i].first);
            }
            else {
                ans += (k / temp[i].first);
                k -= (k / temp[i].first) * temp[i].first;
            }
        }
        return ans;
    }
};

class Day56 {
public:
    static void main() {
        // Example usage:
        Solution solution;

        // Example input values
        int n = 5;
        int k = 45;
        int price[] = {10, 7, 19, 4, 6};

        int result = solution.buyMaximumProducts(n, k, price);
        cout << "Maximum products that can be bought: " << result << endl;
    }
};

int main() {
    Day56::main();
    return 0;
}
