import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {\
        //  TreeSet
        TreeSet<String> set = new TreeSet<>();

        //  Add operation
        set.add("geeks");
        set.add("for");
        set.add("students");

        //  Print the sets
        System.out.println(set);

        //  Boolean operation
        System.out.println(set.contains("geeks"));

        //  Iteration
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
