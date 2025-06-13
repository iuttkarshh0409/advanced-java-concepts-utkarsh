import java.util.*;

// Comparator to sort accounts by last name, then full name if last names match
class Tcomp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i = aStr.lastIndexOf(' ');
        int j = bStr.lastIndexOf(' ');

        int k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0)
            return aStr.compareToIgnoreCase(bStr); // fallback: full name
        else
            return k;
    }
}

class ComparatorDemo3 {
    public static void main(String[] args) {
        // Create a TreeMap with custom comparator
        TreeMap<String, Double> tm = new TreeMap<>(new Tcomp());

        // Add elements
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Get and display entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // Deposit 1000 to John Doe
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
