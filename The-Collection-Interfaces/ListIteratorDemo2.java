//using the for-each loop to cycle through a collection
import java.util.ArrayList;
import java.util.Arrays;
class ListIteratorDemo2{
    public static void main(String[] args) {
        
        //create an array list for integers
        ArrayList<Integer> vals= new ArrayList<>();

        //add value to the array list
        vals.addAll(Arrays.asList(1,2,3,4,5));

        //use for loop to display the values
        System.out.print("Contents of vals: ");
        for(int v: vals)
            System.out.print(v+ " ");

        System.out.println();
        
        //sum the values by using a for loop
        int sum= 0;
        for(int v: vals)
           sum+= v;
           
        System.out.println("Sum of values: "+sum);   
    }
}