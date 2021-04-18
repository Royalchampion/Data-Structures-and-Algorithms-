public class StrStr {
    public static void main(String[] args) {
        System.out.println(find("geeksforgeeks", "for"));
    }

    //  Time Complexity : O(m*n)
    //  Auxiliary Space : O(1)
    public static int find(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        for (int i=0; i<m-n; i++) {
            int j;
            for (j=0; j<n; j++) {
                if (str1.charAt(i+j)!=str2.charAt(j)) {
                    break;
                }
            }
            if (j==n) {
                return i;
            }
        }
        return -1;
    }
}
