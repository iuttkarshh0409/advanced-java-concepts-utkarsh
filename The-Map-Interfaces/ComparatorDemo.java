//use a custom comparator
import java.util.*;

//a reverse comparator for strings
class MyComp implements Comparator<String>{
    @Override
    public int compare(String aStr, String bStr){

        //reverse the comparison
        return bStr.compareTo(aStr);
    }
    //no need to override equals or the default method
}

class ComparatorDemo{
    public static void main(String[] args) {
        //create a tree set
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        //add elements to the tree set
        ts.addAll(Arrays.asList("c","a","b","e","f","d"));

        //display the elements 
        for(String element : ts)
            System.out.print(element + " ");

        System.out.println();    
    }
}