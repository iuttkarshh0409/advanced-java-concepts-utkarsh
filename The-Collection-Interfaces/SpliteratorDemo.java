import java.util.ArrayList;
import java.util.Spliterator;
public class SpliteratorDemo {
    public static void main(String[] args) {
        
        //create an array list for doubles
        ArrayList<Double> vals= new ArrayList<>();

        //add values to the array list
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //use tryAdvance() to display contents of vals
        System.out.print("Contents of vals:\n");
        Spliterator <Double> spltitr= vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //create a new list that conatins square roots
        spltitr= vals.spliterator();
        ArrayList<Double> sqrs=  new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));


        //use forEachRemaining() to display contents of sqrs
        System.out.print("Contents of sqrs: \n");
        spltitr= sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
