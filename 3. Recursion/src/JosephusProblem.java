public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephusProblem(5, 3));
    }

    //  Time Complexity : O(n)
    public static int josephusProblem(int n, int k) {
        if (n==1) {
            return 0;
        }
        else {
            return (josephusProblem(n-1, k) + k) % n;
        }
    }
}
