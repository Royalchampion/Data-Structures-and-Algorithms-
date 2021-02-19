public class BestTimeToBuyAndSellTheStock {
//     Time Complexity : O(n)
//     Auxiliary Space : O(1)
    public static int stock(int[] array) {
        int minValue = 0;
        int profit = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            else if (array[i]-minValue > profit){
                profit = array[i] - minValue;
            }
        }
        return profit;
    }
}
