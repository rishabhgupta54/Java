/*
 * Generics in Java
 * Generics were introduced in Java 5 to provide:
 * Type Safety - guarantee that only specific type of objects are stored.
 * Eliminate explicit Type Casting - avoid ClassCastException at runtime.
 *
 * Key points:
 * - Base type (e.g., ArrayList) defines the collection.
 * - Type parameter (e.g., <String>) defines the type of elements it can hold.
 * - Polymorphism applies only to the base type, not the parameter type.
 * - Primitives cannot be used as type parameters (use wrapper classes instead).
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Type Safety with Arrays (Compile-time check)
        String[] arr = new String[3];
        arr[0] = "Alex";
        arr[1] = "Kara";
        // arr[2] = 10; //Compile-time error: incompatible types

        // Arrays are inherently type-safe.

        // Collections without Generics (Not type-safe)
        ArrayList list = new ArrayList(); // Raw type
        list.add("Alex");
        list.add("Kara");
        list.add(10); // Not type-safe; allowed at compile-time

        // At retrieval, we must cast manually
        String name1 = (String) list.get(0);
        String name2 = (String) list.get(1);
        String name3 = list.get(2).toString(); // Will succeed here but may fail for other types

        // Collections without generics are not type-safe
        // Risk of runtime errors

        // Collections with Generics (Type-safe)
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Alex");
        list2.add("Kara");
        // list2.add(10); // Compile-time error: type mismatch

        // Retrieval without casting
        String n1 = list2.get(0);
        String n2 = list2.get(1);

        System.out.println("Elements in Generic ArrayList: " + list2);

        // Key Takeaways:
        // Generics provide type safety
        // Eliminates explicit type casting
        // Polymorphism applies only to base type
        // Cannot use primitives (use wrapper classes instead)
    }
}
