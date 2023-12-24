import java.util.Arrays;

public class Day42 {

    // Function to find the maximum number of stocks that can be bought
    static int maxStocks(int[] prices, int k) {
        int n = prices.length;
        int[][] stockInfo = new int[n][2];

        // Create a 2D array to store the prices and their respective indices
        for (int i = 0; i < n; i++) {
            stockInfo[i][0] = prices[i];
            stockInfo[i][1] = i + 1;
        }

        // Sort the 2D array based on prices in ascending order
        Arrays.sort(stockInfo, (a, b) -> Integer.compare(a[0], b[0]));

        int maxStocks = 0;

        // Iterate through the sorted array and buy stocks until the budget is exhausted
        for (int i = 0; i < n; i++) {
            int price = stockInfo[i][0];
            maxStocks += count;
            k -= count * price;
        }

        return maxStocks;
    }

    // Main method
    public static void main(String[] args) {
        // Example prices array
        int[] prices = {10, 7, 19};
        int initialAmount = 45;

        // Calculate the maximum number of stocks
        int result = maxStocks(prices, initialAmount);

        // Print the result
        System.out.println("Maximum number of stocks that can be bought: " + result);
    }
}
