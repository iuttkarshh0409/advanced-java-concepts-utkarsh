//use a lambda expression to create a reverse comparator
import java.util.Arrays;
import java.util.TreeSet;
class ComparatorDemo2{
    public static void main(String[] args) {
        
        //pass a reverse comparator to TreeSet() via a lambda expression 
        TreeSet<String> ts= new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        //add elements to the tree set
        ts.addAll(Arrays.asList("C","A","B","E","F","D"));

        //display the elements
        for(String element: ts)
            System.out.print(element + " ");

        System.out.println();    
    }
}