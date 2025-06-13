import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        
            List<Integer> oddList = new ArrayList<>();
           
            oddList.add(0,1);
            oddList.add(1,3);
            oddList.add(2,5);
            //System.out.print(oddList);

            List<Integer> evenList= new ArrayList<>();
            evenList.add(0,2);
            evenList.add(1,4);
            evenList.add(2,6);
            //System.out.print(evenList);

            List<Integer> naturalList= new ArrayList<>();
            naturalList.addAll(0,oddList);
            naturalList.addAll(3,evenList);
            Collections.sort(naturalList); //Ascending order
            //System.out.println(naturalList);
            naturalList.sort(Comparator.reverseOrder()); // Descending order
            //System.out.println(naturalList);

           //System.out.println(oddList.get(0));
           //System.out.println(evenList.get(0));

           /*System.out.println(evenList);
           System.out.println(evenList.indexOf(2));
           System.out.println(oddList);  
           System.out.println(oddList.indexOf(5));   */

          /*System.out.println(evenList.lastIndexOf(2));
           System.out.println(oddList.lastIndexOf(5)); */

          /*evenList.remove(0);
           System.out.println(evenList);
           oddList.remove(2);
           System.out.println(oddList);*/

          /*evenList.replaceAll(n->n+2);
          System.out.println(evenList);
          oddList.replaceAll(n->n*2);
          System.out.println(oddList);*/
          
          /*evenList.set(1,0);
          System.out.println(evenList);
          oddList.set(0,1);
          System.out.println(oddList);*/

          //oddList.addAll(Arrays.asList(7,9,11,13,15,17,19));
          //System.out.println(oddList.subList(5,10));


    }
}
