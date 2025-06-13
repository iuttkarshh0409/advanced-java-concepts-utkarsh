import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String args[]){

        // create an array list
        ArrayList<String> al = new ArrayList<>();

        // add elements to the array list
        al.addAll(Arrays.asList("C","A","E","B","D","F"));

        // use list iterator to modify contents of al
        System.out.print("Original content of al: ");
        for (String element : al) {
        System.out.print(element + " ");
}
        System.out.println();
        ListIterator<String> litr = al.listIterator();  // Correct type: ListIterator
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");  // valid with ListIterator
        }

        // print modified contents using Iterator
        System.out.print("Modified contents of al: ");
        Iterator<String> itr = al.iterator();  // Declare itr properly
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // displaying the list backwards
        System.out.print("Modified list backwards: ");
        while(litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
