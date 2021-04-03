import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listan"));
    }

    //  Time Complexity : O(nlogn)
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length()!=str2.length()) {
            return false;
        }
        char a[] = str1.toCharArray();
        Arrays.sort(a);
        str1 = new String(a);

        char b[] = str2.toCharArray();
        Arrays.sort(b);
        str2 = new String(b);
        return str1.equals(str2);
    }
}
