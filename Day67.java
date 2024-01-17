import java.util.ArrayList;
import java.util.Collections;

public class Day67 {

    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);

        int n = inputList.size();

        ArrayList<ArrayList<Integer>> result = Solution.uniquePerms(inputList, n);

        // Display the result
        System.out.println("Unique Permutations:");
        for (ArrayList<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> A, int n) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> copy = new ArrayList<>(A);

        do {
            ans.add(new ArrayList<>(A));
            A = nextPermutation(A, n);
        } while (!copy.equals(A));

        Collections.sort(ans, (a, b) -> {
            for (int i = 0; i < n; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });

        return ans;
    }

    private static ArrayList<Integer> nextPermutation(ArrayList<Integer> A, int n) {

        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Collections.reverse(A);
            return A;
        }

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                Collections.swap(A, i, ind);
                break;
            }
        }

        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}
