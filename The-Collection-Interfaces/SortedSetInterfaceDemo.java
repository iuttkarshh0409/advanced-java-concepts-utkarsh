import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceDemo {
    public static void main(String[] args) {
        
           SortedSet<Integer> demo= new TreeSet<>();
        
           demo.add(3);
           demo.add(6);
           demo.add(9);
           //System.out.println(demo.first());
           //System.out.println(demo.last());

           @SuppressWarnings("unused")
           SortedSet<Integer> head = demo.headSet(7);
           //System.out.println(head);

           demo.addAll(Arrays.asList(12,15,18));
           //System.out.println(demo.tailSet(9));


    }
}
