import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryInterfaceDemo {
    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        // adding key, value to map
        m.put(101, "Utkarsh");
        m.put(102, "Ankit");
        m.put(103, "Priya");
        m.put(104, "Ravi");

        // get the entry set from map
        Set<Map.Entry<Integer, String>> entrySet = m.entrySet();

        // iterate through the entry set using for-each
        for (Map.Entry<Integer, String> entry : entrySet) {
            // get key
            // System.out.println("Key: " + entry.getKey());

            // get value
            // System.out.println("Value: " + entry.getValue());

            // update the value
            if (entry.getKey() == 102) {
                entry.setValue("Aniket");
            }

            // System.out.println("Updated Entry: " + entry);
        }

        // final map after updates
        // System.out.println("Final Map: " + m);
    }
}
