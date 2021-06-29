public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String str = "Leetcode is so awesome!";
        char[] charString = str.toCharArray();
        reverseWords(charString, str.length());
        System.out.println(charString);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public static void reverseWords(char[] str, int n) {
        int start = 0;
        for (int end=0; end<str.length; end++) {
            if (str[end]==' ') {
                reverse(str, start, end-1);
                start = end + 1;
            }
        }
        reverse(str, start, n-1);
        reverse(str, 0, n-1);
    }

    public static void reverse(char[] str, int low, int high) {
        while (low<=high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
}
