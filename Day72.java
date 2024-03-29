import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Day72 {
    static class Solution {
        int solve(int Num1, int Num2) {
            //code here
            int primes[] = new int[10000];
            for (int i = 2; i < 10000; i++) {
                if (primes[i] == 0)
                    for (int j = i * i; j < 10000; j += i) primes[j] = 1;
            } // here 0 means prime and 1 means not prime

            int res[] = new int[10000];
            Arrays.fill(res, -1);
            res[Num1] = 0;

            Queue<Integer> q = new LinkedList<>();
            q.add(Num1);

            while (q.size() > 0) {
                int num = q.remove();

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (i == 0 && j == 0) continue;

                        String str = Integer.toString(num);
                        String nstr = str.substring(0, i) + Integer.toString(j) + str.substring(i + 1);
                        int next = Integer.valueOf(nstr);

                        if (primes[next] == 0 && res[next] == -1) {
                            res[next] = 1 + res[num];
                            q.add(next);
                        }
                    }
                }
            }
            return res[Num2];
        }
    }

    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        int Num1 = 1033; // Example value for Num1, you can change it accordingly
        int Num2 = 8179; // Example value for Num2, you can change it accordingly

        int result = solution.solve(Num1, Num2);
        System.out.println("Minimum steps to convert " + Num1 + " to " + Num2 + ": " + result);
    }
}
