public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("naman"));
    }

    //  Auxiliary Space = O(n)
    //  Time Complexity = O(n)
    public static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
}
