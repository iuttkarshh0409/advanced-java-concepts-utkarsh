import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        
        //create an array deque
        ArrayDeque<String> adq= new ArrayDeque<>();

        //inserting elements like a stack 
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("Popping the stack: ");

        while(adq.peek() != null)
             System.out.print(adq.pop()+ " ");

        System.out.println();     
    }
}
