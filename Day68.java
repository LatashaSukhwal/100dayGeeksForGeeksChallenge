import java.util.Arrays;

class Day68 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] gallery = {1, -1, 2, 1, -1, -1, 0, 0, 0};
        int n = gallery.length;

        int result = solution.min_sprinklers(gallery, n);

        if (result == -1) {
            System.out.println("It is not possible to cover the entire gallery with sprinklers.");
        } else {
            System.out.println("Minimum number of sprinklers needed: " + result);
        }
    }
}
