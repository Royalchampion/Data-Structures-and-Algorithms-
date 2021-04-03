public class CheckIfAStringIsSubsequenceOfOther {
    public static void main(String[] args) {
        System.out.println(check("ABCDEF", "ADB"));
    }

    //  Time Complexity : O(m+n)
    //  Auxiliary Space : O(1)
    public static boolean check(String str1, String str2) {
        if (str1.length()<str2.length()) {
            return false;
        }
        int j=0;
        for (int i=0; i<str1.length() && j<str2.length(); i++) {
            if (str1.charAt(i)==str2.charAt(j)) {
                j++;
            }
        }
        return (j==str2.length());
    }
}
