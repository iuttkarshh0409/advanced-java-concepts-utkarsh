import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        
        
        NavigableSet <Integer> demo= new TreeSet<>();
        demo.addAll(Arrays.asList(0,1,3,4,5,6,7));

        //System.out.println(demo.ceiling(2));
        //System.out.println(demo.floor(2));

         //System.out.println(demo.descendingSet());

        //System.out.println(demo.higher(6));
        //System.out.println(demo.lower(6));

        /*System.out.println(demo.pollFirst());
        System.out.println(demo);
        System.out.println(demo.pollLast());
        System.out.println(demo);*/


    }
}
