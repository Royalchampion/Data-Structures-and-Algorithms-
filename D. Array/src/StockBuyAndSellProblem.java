public class StockBuyAndSellProblem {
    public static void main(String[] args) {
        System.out.println(finalProfit(new int[]{1, 5, 3, 8, 12}));
    }

//    Time Complexity : O(n);
//    Auxiliary Space : O(1)
    public static int finalProfit(int arr[]) {
        int profit = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                profit += (arr[i]-arr[i-1]);
            }
        }
        return profit;
    }
}
