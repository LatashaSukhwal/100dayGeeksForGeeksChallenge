public class Day34 {
    public static long countStr(long n) {
        return 1 + n + n + n * (n - 1) + n * (n - 1) / 2 + n * (n - 1) * (n - 2) / 2;
    }

    public static void main(String[] args) {
        // You can test the countStr function here
        long input = 5; // You can change this value to test with different inputs
        long result = countStr(input);

        System.out.println("Result for n = " + input + ": " + result);
    }
}
