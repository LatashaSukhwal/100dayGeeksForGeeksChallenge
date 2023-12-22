import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {

    static class Pair {
        int first;
        Pair second;

        public Pair(int first, Pair second) {
            this.first = first;
            this.second = second;
        }
    }

    static boolean myCompare(Pair vec1, Pair vec2) {
        if (vec1.first < vec2.first) {
            return true;
        } else if (vec1.first > vec2.first) {
            return false;
        } else {
            return vec1.second.first < vec2.second.first;
        }
    }

    static List<Integer> maxMeetings(int N, int[] S, int[] F) {
        List<Pair> vec = new ArrayList<>();
        int n = S.length;
        for (int i = 0; i < n; i++) {
            vec.add(new Pair(F[i], new Pair(S[i], i + 1)));
        }

        Collections.sort(vec, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                return myCompare(a, b) ? -1 : 1;
            }
        });

        List<Integer> ans = new ArrayList<>();
        ans.add(vec.get(0).second.second);
        int end = vec.get(0).first;

        for (int i = 1; i < n; i++) {
            if (vec.get(i).second.first > end) {
                ans.add(vec.get(i).second.second);
                end = vec.get(i).first;
            }
        }

        Collections.sort(ans);
        return ans;
    }
}

public class Day40 {
    public static void main(String[] args) {
        int N = 6;
        int[] S = { 1, 3, 0, 5, 8, 5 };
        int[] F = { 2, 4, 6, 7, 9, 9 };

        List<Integer> result = Solution.maxMeetings(N, S, F);

        System.out.println("Maximum number of meetings that can be accommodated is: " + result.size());
        System.out.println("Meeting indices: " + result);
    }
}
