public class SquareRoot {
    public static void main(String[] args) {
//        System.out.println(findSquareRootNaive(37));
        System.out.println(findSquareRootEfficient(26));
    }

//    Time Complexity : O(log(n))
//    Auxiliary Space : O(1)
    public static int findSquareRootEfficient(int number) {
        int low = 1;
        int high = number;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sqr = mid*mid;
            if (sqr == number) {
                return mid;
            }
            else if (sqr > number) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }

//    Time Complexity : O(sqrt(n))
//    Auxiliary Space : O(1)
    public static int findSquareRootNaive(int number) {
        int i=1;
        while (i*i <= number) {
            i++;
        }
        return i-1;
    }
}
