/*
 * LinkedList
 *
 * Key Points:
 * - Underlying data structure → Doubly Linked List
 * - Insertion order → Preserved
 * - Duplicates → Allowed
 * - Heterogeneous objects → Allowed
 * - null insertion → Possible
 * - Implements Serializable & Cloneable (but not RandomAccess)
 *
 * Performance:
 * - Best choice → Frequent insertion/deletion (especially in middle)
 * - Worst choice → Frequent random access (retrieval by index)
 *
 * Constructors:
 * LinkedList linkedList = new LinkedList()
 * → Creates an empty LinkedList
 *
 * LinkedList linkedList = new LinkedList(Collection collection)
 * → Creates a LinkedList containing all elements of given collection
 *
 * Commonly Used Methods (with return types)
 * boolean add(E e)
 * → Adds element at the end of the list
 *
 * void add(int index, E e)
 * → Inserts element at the specified index
 *
 * void addFirst(E e)
 * → Adds element at the beginning of the list
 *
 * void addLast(E e)
 * → Adds element at the end of the list
 *
 * E getFirst()
 * → Returns the first element (without removing)
 *
 * E getLast()
 * → Returns the last element (without removing)
 *
 * E get(int index)
 * → Returns the element at specified index
 *
 * E removeFirst()
 * → Removes and returns the first element
 *
 * E removeLast()
 * → Removes and returns the last element
 *
 * boolean remove(Object o)
 * → Removes the first occurrence of the specified element
 *
 * E remove(int index)
 * → Removes and returns the element at the specified index
 *
 * boolean contains(Object o)
 * → Returns true if the list contains the element
 *
 * int size()
 * → Returns the number of elements
 *
 * void clear()
 * → Removes all elements
 *
 * boolean isEmpty()
 * → Returns true if the list is empty
 *
 * boolean offer(E e)
 * → Adds element at the end (queue-style)
 *
 * boolean offerFirst(E e)
 * → Adds element at the beginning (queue-style)
 *
 * boolean offerLast(E e)
 * → Adds element at the end (queue-style)
 *
 * E peek()
 * → Returns head element (without removing)
 *
 * E peekFirst()
 * → Returns first element (without removing)
 *
 * E peekLast()
 * → Returns last element (without removing)
 *
 * E poll()
 * → Removes and returns head element (queue-style)
 *
 * E pollFirst()
 * → Removes and returns first element
 *
 * E pollLast()
 * → Removes and returns last element
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("Adding elements...");
        linkedList.add("Hello");
        linkedList.add(30);
        linkedList.add(null);
        System.out.println("List after additions: " + linkedList);

        System.out.println("\nModifying elements...");
        linkedList.set(0, "Alex"); // Replace element at index 0
        linkedList.add(0, "Kara"); // Add at index 0
        linkedList.addFirst("Eva"); // Add at beginning
        linkedList.addLast("Zoe"); // Add at end
        System.out.println("List after modifications: " + linkedList);

        System.out.println("\nAccessing elements...");
        System.out.println("getFirst(): " + linkedList.getFirst());
        System.out.println("getLast(): " + linkedList.getLast());
        System.out.println("get(2): " + linkedList.get(2));

        System.out.println("\nRemoving elements...");
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.remove("Hello"); // no effect if not present
        System.out.println("List after removals: " + linkedList);

        System.out.println("\nQueue-style operations...");
        linkedList.offer("Mia");
        linkedList.offerFirst("Leo");
        linkedList.offerLast("Ryan");
        System.out.println("After offers: " + linkedList);

        System.out.println("peek(): " + linkedList.peek());
        System.out.println("poll(): " + linkedList.poll());
        System.out.println("After poll: " + linkedList);

        System.out.println("\nFinal LinkedList: " + linkedList);
        System.out.println("size(): " + linkedList.size());
        System.out.println("contains('Alex'): " + linkedList.contains("Alex"));
        System.out.println("isEmpty(): " + linkedList.isEmpty());
    }
}
