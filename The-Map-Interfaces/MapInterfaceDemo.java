import java.util.HashMap;
import java.util.Map;
public class MapInterfaceDemo {
    public static void main(String[] args) {
        
        Map<Integer, String> m= new HashMap<>();
        
        /*int size= m.size();
        System.out.println("Initial size of map: "+size);
        System.out.println("Is map empty? "+m.isEmpty());*/

        //adding key, value to map
        m.put(1,"A");
        m.put(2,"B");
        m.put(3,"C");
        m.put(4,"D");
        m.put(5,"E");
        m.put(6,"E");
        m.put(7,"F");
        
        /*System.out.println("Size of map after additions: "+m.size());

        System.out.println("Does map contain 7? "+m.containsKey(7));
        System.out.println("Does map contain D? "+m.containsValue("D"));*/

        //System.out.println("Value at key 3 is: "+m.get(3));
        m.remove(1);
        m.remove(7);
        //System.out.println("Map after removals: "+m);

         Map<Integer, String> n= new HashMap<>();
         n.putAll(m);
         //System.out.println(n);

         //n.clear();
         //System.out.println(n);

         //System.out.println("Are m and n equal? "+m.equals(n));
         //System.out.println(n.hashCode());
    }
}
