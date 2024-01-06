public class Day52 {
    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Example input value
        String S = "122345";

        int result = solution.smallestSubstring(S);
        System.out.println("Length of the smallest substring containing all distinct digits: " + result);
    }
}

class Solution {
    public int smallestSubstring(String S) {
        int[] freq = new int[3];
        int i = 0, n = S.length(), count = 0, ans = n + 1;

        for (int j = 0; j < n; j++) {
            char ch1 = S.charAt(j);
            freq[ch1 - '0']++;

            if (freq[ch1 - '0'] == 1) {
                count++;
            }

            while (i < j && count == 3) {
                ans = Math.min(j - i + 1, ans);
                char ch2 = S.charAt(i++);
                freq[ch2 - '0']--;

                if (freq[ch2 - '0'] == 0) {
                    count--;
                }
            }
        }

        return ans == n + 1 ? -1 : ans;
    }
}
