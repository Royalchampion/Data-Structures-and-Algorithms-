import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> keywords = new HashSet<String>();
        //  Add operation on hashset
        keywords.add("Suraj");
        keywords.add("Salman");
        keywords.add("Ganesh");
        System.out.println(keywords);
        //  Contains operation on hashset
        System.out.println(keywords.contains("Suraj"));
        System.out.println(keywords.contains("Ronaldo"));
        //  Iterators on hashset 
        Iterator<String> iterator = keywords.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
