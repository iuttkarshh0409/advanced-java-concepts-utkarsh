import java.util.EnumSet;

// Define an Enum type for demonstration
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumSetDemo {
    public static void main(String[] args) {
        
        // Create an empty EnumSet of type Day
        EnumSet<Day> set1 = EnumSet.noneOf(Day.class);
        System.out.println("Initial empty set: " + set1);

        // Add elements
        set1.add(Day.MON);
        set1.add(Day.WED);
        System.out.println("After adding MON and WED: " + set1);

        // Add all elements
        set1.addAll(EnumSet.of(Day.FRI, Day.SAT));
        System.out.println("After adding FRI and SAT: " + set1);

        // Create a full EnumSet
        EnumSet<Day> set2 = EnumSet.allOf(Day.class);
        System.out.println("All days: " + set2);

        // Remove an element
        set1.remove(Day.MON);
        System.out.println("After removing MON from set1: " + set1);

        // Complement of a set
        EnumSet<Day> complement = EnumSet.complementOf(set1);
        System.out.println("Complement of set1: " + complement);

        // Copy a set
        EnumSet<Day> copySet = EnumSet.copyOf(set1);
        System.out.println("Copied set from set1: " + copySet);

        // Range of enums (inclusive)
        EnumSet<Day> rangeSet = EnumSet.range(Day.TUE, Day.FRI);
        System.out.println("Range TUE to FRI: " + rangeSet);

        // Clear all elements
        set1.clear();
        System.out.println("set1 after clearing: " + set1);

        // Check if set is empty
        System.out.println("Is set1 empty? " + set1.isEmpty());

        // Check if set contains a value
        System.out.println("Does set2 contain SUN? " + set2.contains(Day.SUN));

        // Size of a set
        System.out.println("Size of set2: " + set2.size());

        // Iterate over set2
        System.out.print("Elements in set2: ");
        for (Day d : set2) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
