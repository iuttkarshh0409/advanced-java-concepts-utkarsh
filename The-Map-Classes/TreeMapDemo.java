import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class TreeMapDemo{
    public static void main(String[] args) {
        
        //create a hash map
        TreeMap <String, Double> tm= new TreeMap<>();

        //put the elements to the map
        tm.put("John Doe",3434.34);
        tm.put("Tom Smith",123.22);
        tm.put("Jane Baker",1378.00);
        tm.put("Tod Hall",99.22);
        tm.put("Ralph Smith",-19.08);

        //get the set of entries
        Set<Map.Entry <String, Double>> set= tm.entrySet();

        //display the set
        for(Map.Entry<String,Double> me: set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //deposit 1000 into John Doe's Account
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance+1000);

        System.out.println("John Doe's new balance: "+tm.get("John Doe"));
    }
    
}