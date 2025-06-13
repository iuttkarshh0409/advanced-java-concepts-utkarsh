import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceDemo {
    public static void main(String[] args) {
       
        Deque<Integer> demo= new ArrayDeque<>();

        demo.addFirst(7);
        demo.addFirst(77);
        demo.addFirst(777);
        //System.out.println(demo);

        demo.addLast(1);
        demo.addLast(11);
        demo.addLast(111);
        //System.out.println(demo);

        /*System.out.println(demo);
        System.out.println(demo.getFirst());
        System.out.println(demo.getLast());*/

        /*System.out.println(demo.offerFirst(1));
        System.out.println(demo);
        System.out.println(demo.offerLast(-1));
        System.out.println(demo);*/

        /*System.out.println(demo.peekFirst());
        System.out.println(demo.peekLast());*/

        /*System.out.println(demo.pollFirst());
        System.out.println(demo);
        System.out.println(demo.pollLast());
        System.out.println(demo);*/

        /*System.out.println(demo);
        demo.pop();
        System.out.println(demo);*/
    }
}
