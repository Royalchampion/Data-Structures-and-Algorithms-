public class LeftmostNonRepeatingElement {
    public static void main(String[] args) {
        System.out.println(find("GeeksForGeeks"));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int find(String str) {
        for (int i=0; i<str.length(); i++) {
            boolean flag = true;
            for (int j=0; j<str.length(); j++) {
                if (i!=j && str.charAt(i)==str.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
