public class SubsetsUsingRecursion {
    public static void main(String[] args) {
        subsets("ABC", "", 0);
    }

    public static void subsets(String inputString, String currentString, int i) {
        if(i==inputString.length()) {
            System.out.println(currentString + "");
            return;
        }

        subsets(inputString, currentString, i+1);
        subsets(inputString, currentString+inputString.charAt(i), i+1);
    }
}
