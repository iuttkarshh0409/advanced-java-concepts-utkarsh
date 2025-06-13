import java.util.*;

class CollectionsClassDemo3 {
    public static void main(String[] args) {
        
        //create a list of integers
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));

        System.out.print("Original list: ");
        display(list);

        //sort the list
        Collections.sort(list);
        System.out.print("After sort(): ");
        display(list);

        //reverse the list
        Collections.reverse(list);
        System.out.print("After reverse(): ");
        display(list);

        //shuffle the list
        Collections.shuffle(list);
        System.out.print("After shuffle(): ");
        display(list);

        //swap elements at index 0 and 2
        Collections.swap(list, 0, 2);
        System.out.print("After swap(0,2): ");
        display(list);

        //replace all occurrences of 1 with 10
        Collections.replaceAll(list, 1, 10);
        System.out.print("After replaceAll(1, 10): ");
        display(list);

        //fill sublist with -1
        Collections.fill(list.subList(2, 5), -1);
        System.out.print("After fill() from index 2 to 4: ");
        display(list);

        //sort again before binary search
        Collections.sort(list);
        System.out.print("After final sort(): ");
        display(list);

        //binary search for 5
        int index = Collections.binarySearch(list, 5);
        System.out.println("Index of 5: " + index);

        //find max and min
        System.out.println("Max value: " + Collections.max(list));
        System.out.println("Min value: " + Collections.min(list));

        //frequency of 10
        System.out.println("Frequency of 10: " + Collections.frequency(list, 10));

        //create another list and check disjoint
        List<Integer> list2 = Arrays.asList(100, 200, 300);
        System.out.println("Are both lists disjoint? " + Collections.disjoint(list, list2));
    }

    static void display(List<Integer> list) {
        for (int val : list)
            System.out.print(val + " ");
        System.out.println();
    }
}
