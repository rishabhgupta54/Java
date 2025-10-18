/*
 * StringBuffer and StringBuilder
 *
 * StringBuffer is mutable and thread-safe (synchronized). Use when content changes often and thread-safety is required.
 * StringBuilder is mutable and NOT thread-safe (non-synchronized). Use for better performance in single-threaded context.
 *
 * Important Note:
 * Whenever StringBuffer exceeds its current capacity, a new capacity is allocated:
 *      new capacity = (current capacity + 1) * 2
 */

public class Main {
    public static void main(String[] args) {
        // Creating StringBuffer objects
        StringBuffer sb1 = new StringBuffer(); // default capacity 16
        StringBuffer sb2 = new StringBuffer(10); // initial capacity 10
        StringBuffer sb3 = new StringBuffer("Hello"); // capacity = 5 + 16 = 21

        System.out.println("Initial sb3: " + sb3);

        // length() - number of characters in content
        System.out.println("Length of sb3: " + sb3.length()); // 5

        // capacity() - total space allocated
        System.out.println("Capacity of sb3: " + sb3.capacity()); // 21

        // charAt(index) - get character at index
        System.out.println("Char at index 1: " + sb3.charAt(1)); // 'e'

        // setCharAt(index, char) - set character at index
        sb3.setCharAt(0, 'h'); // Hello -> hello
        System.out.println("After setCharAt: " + sb3);

        // append() - add content at end
        sb3.append(" World");
        System.out.println("After append: " + sb3);

        // insert(index, string) - insert content at index
        sb3.insert(5, ",");
        System.out.println("After insert: " + sb3);

        // delete(start, end) - remove substring
        sb3.delete(5, 6); // remove comma
        System.out.println("After delete: " + sb3);

        // deleteCharAt(index) - remove character at index
        sb3.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb3);

        // reverse() - reverse the content
        sb3.reverse();
        System.out.println("After reverse: " + sb3);

        // setLength(newLength) - change the length (truncate or pad with '\0')
        sb3.setLength(5);
        System.out.println("After setLength(5): " + sb3);

        // ensureCapacity(minCapacity) - ensure minimum capacity
        sb3.ensureCapacity(50);
        System.out.println("After ensureCapacity(50), capacity: " + sb3.capacity());

        // trimToSize() - trim capacity to match content length
        sb3.trimToSize();
        System.out.println("After trimToSize, capacity: " + sb3.capacity());
    }
}
