import java.util.Arrays;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        //create a hash set
        LinkedHashSet<String> hs= new LinkedHashSet<>();

        //add elements to the hash set
        hs.addAll(Arrays.asList("Beta","Alpha","Eta","Gamma","Epsilon","Omega"));
        hs.add("Zeta");
        hs.add("Delta");

        System.out.println(hs);
    }
}
