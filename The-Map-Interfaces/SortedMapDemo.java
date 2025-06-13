import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer, String> sm = new TreeMap<>();

        // Adding key-value pairs to the sorted map
        sm.put(5, "E");
        sm.put(2, "B");
        sm.put(8, "H");
        sm.put(1, "A");
        sm.put(4, "D");
        sm.put(7, "G");

        // Display the entire map (keys will be in sorted order)
        // System.out.println("SortedMap contents: " + sm);

        // Get the comparator used for ordering (null means natural ordering)
        // System.out.println("Comparator: " + sm.comparator());

        // Get first (lowest) key
        // System.out.println("First Key: " + sm.firstKey());

        // Get last (highest) key
        // System.out.println("Last Key: " + sm.lastKey());

        // Get a view of the map with keys strictly less than 5
        SortedMap<Integer, String> headMap = sm.headMap(5);
        // System.out.println("headMap(<5): " + headMap);

        // Get a view of the map with keys greater than or equal to 4
        SortedMap<Integer, String> tailMap = sm.tailMap(4);
        // System.out.println("tailMap(>=4): " + tailMap);

        // Get a view of the map with keys from 2 (inclusive) to 7 (exclusive)
        SortedMap<Integer, String> subMap = sm.subMap(2, 7);
        // System.out.println("subMap(2 to 7): " + subMap);
    }
}
