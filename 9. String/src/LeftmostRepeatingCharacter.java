public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
//        System.out.println(findLeftmostRepeatingCharacter("cabbad"));
        System.out.println(findLeftmostRepeatingCharacterGood("geeksforgeeks"));
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

    static final int CHAR = 256;
    public static int findLeftmostRepeatingCharacterGood(String str) {
        int[] count = new int[CHAR];
        for (int i=0; i<str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i=0; i<str.length(); i++) {
            if (count[str.charAt(i)]>1) {
                return i;
            }
        }
        return -1;
    }
}
