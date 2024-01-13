import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) st.push(q.remove());
        for (int i = 0; i < k; i++) ((LinkedList<Integer>) q).addFirst(st.get(i));
        return q;
    }
}

// Additional class Day62
public class Day62 {
    public static void main(String[] args) {
        // Example usage
        GfG gfG = new GfG();
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements to the queue
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }

        int k = 3;

        System.out.println("Original Queue:");
        printQueue(queue);

        Queue<Integer> modifiedQueue = gfG.modifyQueue(queue, k);

        System.out.println("\nQueue after reversing first " + k + " elements:");
        printQueue(modifiedQueue);
    }

    private static void printQueue(Queue<Integer> q) {
        for (Integer element : q) {
            System.out.print(element + " ");
        }
    }
}
