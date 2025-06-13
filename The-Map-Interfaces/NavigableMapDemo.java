import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> nm = new TreeMap<>();

        // adding key, value to navigable map
        nm.put(10, "Ten");
        nm.put(20, "Twenty");
        nm.put(30, "Thirty");
        nm.put(40, "Forty");
        nm.put(50, "Fifty");

        // System.out.println("NavigableMap contents: " + nm);

        // Returns the greatest key strictly less than the given key
        // System.out.println("Lower key than 30: " + nm.lowerKey(30));

        // Returns the greatest key less than or equal to the given key
        // System.out.println("Floor key of 30: " + nm.floorKey(30));

        // Returns the least key greater than or equal to the given key
        // System.out.println("Ceiling key of 30: " + nm.ceilingKey(30));

        // Returns the least key strictly greater than the given key
        // System.out.println("Higher key than 30: " + nm.higherKey(30));

        // Returns and removes the first entry (lowest key)
        // System.out.println("Poll First Entry: " + nm.pollFirstEntry());

        // Returns and removes the last entry (highest key)
        // System.out.println("Poll Last Entry: " + nm.pollLastEntry());

        // Returns a reverse order view of the map
        NavigableMap<Integer, String> reverseMap = nm.descendingMap();
        // System.out.println("Descending map: " + reverseMap);

        // Returns a view of the portion whose keys are < given key
        NavigableMap<Integer, String> headMap = nm.headMap(40, false);
        // System.out.println("HeadMap (<40): " + headMap);

        // Returns a view of the portion whose keys are >= given key
        NavigableMap<Integer, String> tailMap = nm.tailMap(30, true);
        // System.out.println("TailMap (>=30): " + tailMap);

        // Returns view from 20 (inclusive) to 50 (exclusive)
        NavigableMap<Integer, String> subMap = nm.subMap(20, true, 50, false);
        // System.out.println("SubMap (20 to 50): " + subMap);
    }
}
