import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> al= new ArrayList<>(); //creating an ArrayList
        System.out.println("Initial size of al: "+al.size());

        //add elements to ArrayList
        al.addAll(Arrays.asList("c","A","E","B","D","F"));
        al.add(1,"A2");

        System.out.println("Size of al after additions: "+al.size());

        //display the ArrayList
        System.out.println("Contents of al: "+al);

        //remove elements from the ArrayList
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: "+al.size());
        System.out.println("Contents of al: "+al);
    }
}
