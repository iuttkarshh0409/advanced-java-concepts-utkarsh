import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class LinkedHashMapDemo {
    public static void main(String[] args) {

        // create a linked hash map
        LinkedHashMap<String, Double> hm = new LinkedHashMap<>();

        // put the elements to the map
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        // get the set of entries
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // display the set
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // deposit 1000 into John Doe's Account
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
