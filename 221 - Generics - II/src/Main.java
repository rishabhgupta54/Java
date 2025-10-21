/*
 * Generics
 *
 * Before Java 1.5 (v1.4 and earlier):
 * class ArrayList {
 *     void add(Object o);
 *     Object get(int index);
 * }
 *
 * - add(Object o): any type of object could be added → **no type safety**.
 * - get(int index): returned Object → **explicit type casting required**.
 *
 * After Java 1.5 (Generics introduced):
 * class ArrayList<T> {
 *     void add(T t);
 *     T get(int index);
 * }
 *
 * - T is a **type parameter** (can be any reference type).
 * - add(T t): ensures only objects of type T can be added → **type-safe**.
 * - get(int index): returns T → **no type casting required**.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Generic ArrayList (Type-safe)
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Alex");
        // arrayList.add(10); // Compile-time error (type mismatch)

        // No type casting required during retrieval
        String name = arrayList.get(0);

        System.out.println("Element at index 0: " + name);
    }
}
