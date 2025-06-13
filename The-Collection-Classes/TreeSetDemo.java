import java.util.Arrays;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        
        //creating a tree set
        TreeSet<String> ts= new TreeSet<>();
        ts.addAll(Arrays.asList("C","A","B","E","F","D"));
        System.out.println(ts);

        TreeSet<Integer> ts2= new TreeSet<>();
        ts2.add(2);
        ts2.add(6);
        ts2.add(1);
        ts2.add(8);
        ts2.add(-1);
        System.out.println(ts2);
    }
}
