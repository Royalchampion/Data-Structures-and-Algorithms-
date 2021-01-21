public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(findSquareRootNaive(37));
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
