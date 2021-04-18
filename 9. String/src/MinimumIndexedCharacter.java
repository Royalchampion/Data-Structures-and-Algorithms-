public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        System.out.println(findMinIndexedCharacter("onkl", "adcffaet"));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int findMinIndexedCharacter(String str1, String str2) {
        int minIndex = Integer.MAX_VALUE;
        for (int i=0; i<str1.length(); i++) {
            for (int j=0; j<str2.length(); j++) {
                if (str1.charAt(i)==str2.charAt(j) && j<minIndex) {
                    minIndex = j;
                    break;
                }
            }
        }
        if (minIndex!=Integer.MAX_VALUE) {
            return minIndex;
        }
        return -1;
    }
}
