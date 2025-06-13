import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
       
        //create a linked list
        LinkedList<String> ll= new LinkedList<>();

        //add eleements to the linked list
        ll.addAll(Arrays.asList("F","B","D","E","C"));
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");

        System.out.println("Contents of ll: "+ll);

        //remove elements from linked list
        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of ll after deletion: "+ll);

        //remove first and last elements
        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last values: "+ll);

        //get and set a value
        String val= ll.get(2);
        System.out.println(val);
        ll.set(2,val+" Changed");

        System.out.println("ll after changes: "+ ll);
    }
}
