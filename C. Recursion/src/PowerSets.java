import java.util.ArrayList;

public class PowerSets {
    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> arrayString = new ArrayList<String>();
        generateSubsets(s, arrayString, "", 0);
        return arrayString;
    }

    static void generateSubsets(String s, ArrayList<String> arr, String currentString, int i) {
        if(i==s.length()) {
            arr.add(currentString);
            return;
        }
        generateSubsets(s, arr, currentString, i+1);
        generateSubsets(s, arr, currentString + s.charAt(i), i+1);
    }
}
