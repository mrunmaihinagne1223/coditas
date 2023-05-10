

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

public class Que2 {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("John");
        queue.add("Mary");
        queue.add("Bob");

        // Check the size of the queue
        System.out.println("Queue size: " + queue.size());

        // Peek the first element of the queue
        System.out.println("First element: " + queue.peek());

        // Remove the first element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Check the size of the queue again
        System.out.println("Queue size after removal: " + queue.size());

        // Loop through the remaining elements in the queue
        for (String element : queue) {
            System.out.println("Element: " + element);
        }

        // Clear the queue
        queue.clear();

        // Check the size of the queue again
        System.out.println("Queue size after clearing: " + queue.size());

        Queue<Integer> queue1 = new PriorityQueue<>();

        // Add elements to the queue
        queue1.add(10);
        queue1.add(5);
        queue1.add(20);
        queue1.add(15);

        // Print the elements in the queue
        System.out.println("Elements in the queue: " + queue1);

        // Peek the first element of the queue
        System.out.println("First element: " + queue1.peek());

        // Remove the first element from the queue
        //int removedElement = queue1.remove();
        //System.out.println("Removed element: " + removedElement);

        // Print the elements in the queue again
        System.out.println("Elements in the queue after removal: " + queue1);
    }
}
