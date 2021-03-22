public class StringsInJava {
    public static void main(String[] args) {
        String str = "geeks";
        //  Length of the string
        System.out.println(str.length());

        //  Index positioning at string
        System.out.println(str.charAt(3));

        //  String Slicing method
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));

        //  Memory for str1 is allocated while same isn't done for str2(str1 and str2 is same.)
        String str1 = "geeks";
        String str2 = "geeks";

        if (str1==str2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        //  New memory is allocated for str3.
        String str3 = new String("geeks");
        if (str1==str3) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        //  Checks whether the one string contains another or not.
        String str4 = "geeksforgeeks";
        if (str4.contains(str1)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        String str5 = "geeksforgeeks";
        if (str4.equals(str5)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
