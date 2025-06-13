import java.util.*;

class CollectionsClassDemo {
    public static void main(String[] args) {

        // create and initialize a list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) 
            list.add(i);

        // shuffle the list
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        // sort the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // reverse the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // fill a portion of list
        Collections.fill(list.subList(2, 5), 100);
        System.out.println("After fill(): " + list);

        // swap two elements
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("After swap: " + list);

        // binary search (list must be sorted first)
        Collections.sort(list);
        int index = Collections.binarySearch(list, 100);
        System.out.println("Binary search for 100: " + index);

        // replaceAll oldVal with newVal
        Collections.replaceAll(list, 100, -1);
        System.out.println("After replaceAll(): " + list);

        // frequency of an element
        int freq = Collections.frequency(list, -1);
        System.out.println("Frequency of -1: " + freq);

        // max and min
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max: " + max + ", Min: " + min);

        // copy contents to another list (destination list must be pre-sized)
        List<Integer> list2 = new ArrayList<>(Collections.nCopies(list.size(), 0));
        Collections.copy(list2, list);
        System.out.println("Copied list2: " + list2);

        // disjoint check
        boolean isDisjoint = Collections.disjoint(list, Arrays.asList(999));
        System.out.println("Disjoint with [999]: " + isDisjoint);

        // synchronized version
        List<Integer> syncList = Collections.synchronizedList(list);
        System.out.println("Synchronized list created: "+syncList);

        // unmodifiable version
        List<Integer> unmodList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable list created: "+unmodList);

        // checked version
        List<Integer> checkedList = Collections.checkedList(new ArrayList<>(), Integer.class);
        checkedList.add(5);
        System.out.println("Checked list created: "+checkedList);
    }
}
