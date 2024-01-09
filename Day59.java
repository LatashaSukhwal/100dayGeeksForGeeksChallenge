import java.util.ArrayList;

class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = txt.indexOf(pat);
        while (index != -1) {
            list.add(index + 1);
            index = txt.indexOf(pat, index + 1);
        }
        return list;
    }
}

public class Day59 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String pattern = "abc";
        String text = "abcabcabc";
        
        ArrayList<Integer> result = solution.search(pattern, text);
        
        if (result.isEmpty()) {
            System.out.println("Pattern not found in the text.");
        } else {
            System.out.println("Pattern found at positions: " + result);
        }
    }
}
