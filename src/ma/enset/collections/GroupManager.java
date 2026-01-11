package ma.enset.collections;
import java.util.*;

public class GroupManager {
    public static void main(String[] args) {
        Set<String> groupA = new HashSet<>(Arrays.asList("Omar", "Ali", "Laila"));
        Set<String> groupB = new HashSet<>(Arrays.asList("Sara", "Ali", "Mehdi"));

        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection: " + intersection);

        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);
    }
}