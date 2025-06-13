import java.util.Arrays;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        
        //create a hash set
        HashSet<String> hs= new HashSet<>();

        //add elements to the hash set
        hs.addAll(Arrays.asList("Beta","Alpha","Eta","Gamma","Epsilon","Omega"));
        hs.add("Zeta");
        hs.add("Delta");

       for (String s : hs) {
            System.out.println(s + " → hashCode: " + s.hashCode());
        }

        System.out.println(hs);
    }
}
