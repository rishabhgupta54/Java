/*
 * Stack
 *
 * - Stack is a child class of Vector.
 * - It is designed specifically to follow LIFO (Last In First Out) order.
 * - Internally, it uses a Vector to store elements.
 * - It is thread-safe because Vector methods are synchronized.
 *
 * Use Case:
 *   - When you need LIFO behavior, like undo operations, expression evaluation,
 *     recursive function simulation, etc.
 *
 * Constructors:
 *   Stack stack = new Stack();
 *
 * Common Methods:
 *   push(Object o)    : Adds an element to the top of the stack.
 *   pop()             : Removes and returns the top element.
 *   peek()            : Returns the top element without removing it.
 *   empty()           : Returns true if stack is empty, false otherwise.
 *   search(Object o)  : Returns 1-based position from the top if found, else -1.
 *
 *   Top of Stack
 *   +---------+
 *   |   "C"   |        offset = 1
 *   +---------+        index  = 2
 *   |   "B"   |        offset = 2
 *   +---------+        index  = 1
 *   |   "A"   |        offset = 3
 *   +---------+        index  = 0
 *   Bottom of Stack
 */

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        // Push elements onto stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Initial Stack: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop one element (LIFO removal)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Search elements
        System.out.println("Position of 'A' from top: " + stack.search("A"));
        System.out.println("Position of 'Z' from top: " + stack.search("Z"));

        // Check if empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}
