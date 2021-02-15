public class ProductAndSumDifference {
    public static int differenceBetweenProductAndSum(int number) {
        int product = 1;
        int sum = 0;
        while (number>0) {
            product *= number%10;
            sum += number%10;
            number /= 10;
        }
        return product-sum;
    }
}
