import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Creating a priority queue (natural ordering)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Display initial size
        System.out.println("Initial size of pq: " + pq.size());

        // Adding elements to the priority queue
        pq.addAll(Arrays.asList(40, 10, 30, 20, 50));
        pq.offer(60);  // Adds element with offer()

        System.out.println("Size of pq after additions: " + pq.size());

        // Display contents (not sorted visually; heap order)
        System.out.println("Contents of pq: " + pq);

        // Peek at the head of the queue (smallest element)
        System.out.println("Head of pq (peek): " + pq.peek());

        // Remove head using poll()
        System.out.println("Removed head using poll(): " + pq.poll());
        System.out.println("Contents of pq after poll(): " + pq);

        // Remove a specific element
        pq.remove(30);
        System.out.println("Contents of pq after removing 30: " + pq);

        // Check if queue contains a specific element
        System.out.println("pq contains 20? " + pq.contains(20));
        System.out.println("pq contains 100? " + pq.contains(100));

        // Use element() to retrieve head (throws exception if empty)
        System.out.println("Head using element(): " + pq.element());

        // Convert to array
        Object[] arr = pq.toArray();
        System.out.print("pq as array: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // Check size and clear queue
        System.out.println("Size before clear(): " + pq.size());
        pq.clear();
        System.out.println("Size after clear(): " + pq.size());
        System.out.println("Is pq empty? " + pq.isEmpty());
    }
}
