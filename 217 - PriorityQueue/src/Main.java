/*
 * PriorityQueue
 *
 * The underlying data structure is a **Binary Heap** (implemented as a Min-Heap by default).
 *
 * Characteristics:
 * - Present in java.util package.
 * - It is a type of **Queue** that orders elements according to their **natural ordering**
 *   or by a **Comparator** provided at creation time.
 * - The **head element** of the queue is always the **least (or highest priority) element**.
 * - Null elements are **NOT allowed** (throws NullPointerException).
 * - Heterogeneous elements are **NOT allowed** (will cause ClassCastException).
 * - Duplicate elements are allowed.
 * - Not synchronized.
 * - Implements Serializable, Iterable, Collection, and Queue interfaces.
 * - Used in scheduling, task management, and algorithms like Dijkstra or Huffman coding.
 *
 * Constructors:
 * PriorityQueue priorityQueue = new PriorityQueue();
 *   → Default initial capacity = 11, natural ordering (min-heap)
 *
 * PriorityQueue priorityQueue = new PriorityQueue(int initialCapacity);
 *
 * PriorityQueue priorityQueue = new PriorityQueue(Comparator comparator);
 *   → Creates a PriorityQueue with custom ordering (e.g., max-heap)
 *
 * PriorityQueue priorityQueue = new PriorityQueue(Collection c);
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);

        System.out.println("PriorityQueue Elements: " + priorityQueue);
        // Internal structure is a heap — order in printing is NOT sorted

        System.out.println("\nHead element (peek): " + priorityQueue.peek());
        // Smallest element (10)

        System.out.println("\n---- Removing elements (poll) ----");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // Custom ordering (Max-Heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(30);

        System.out.println("\nMax-Heap PriorityQueue Elements: " + maxHeap);
        System.out.println("Head element (peek): " + maxHeap.peek());
    }
}
