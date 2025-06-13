import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class CollectionInterfaceDemo{  //Collection Interface Demo
    public static void main(String args[]){
        Collection <Integer> demo= new ArrayList<>();
        Collection <Integer> demo2= new ArrayList<>();

        demo.add(7);
        demo.add(77);
        demo.add(777);

        //System.out.print(demo); //demo before addAll()
        //System.out.println("\n");

        demo2.add(1);
        demo2.add(11);
        demo2.add(111);

       // demo.addAll(demo2);
        //System.out.println(demo); //demo after addAll()

        demo2.clear();
        //System.out.print(demo);

        //System.out.print(demo.contains(1));
       // System.out.print(demo.containsAll(demo2));

       //System.out.print(demo.equals(demo2));

       //System.out.println(demo.hashCode());
       //System.out.println(demo2.hashCode());

       //System.out.print(demo2.isEmpty());

       demo.remove(777);
       //System.out.print(demo);
       demo.removeAll(demo);
       //System.out.print(demo);

       demo.addAll(Arrays.asList(1,3,5,7,9));
       demo2.addAll(Arrays.asList(2,4,6,8,10));
       demo.addAll(demo2);
       //System.out.print(demo);

       demo.retainAll(Arrays.asList(1,2,3,4,5));
       //System.out.print(demo);

       //System.out.println(demo.size());
       //System.out.println(demo2.size());
    }
}