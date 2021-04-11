public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(findLeftmostRepeatingCharacter("cabbad"));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int findLeftmostRepeatingCharacter(String str) {
        for (int i=0; i<str.length(); i++) {
            for (int j=i+1; j<str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
