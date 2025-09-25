/*
 * Native Modifier
 *
 * - 'native' is applicable only for methods, not for classes or variables.
 * - A native method is implemented in non-Java languages (like C/C++).
 * - Such methods are also called "foreign methods."
 *
 * Main objectives of native methods:
 * 1. To improve system performance.
 * 2. To achieve machine-level or memory-level communication.
 * 3. To use already existing legacy or non-Java code.
 *
 * Note:
 * - Native methods are declared with 'native' keyword but have no body.
 * - They are usually linked using JNI (Java Native Interface).
 * - To run them, we need a supporting C/C++ implementation and 'System.loadLibrary'.
 */
public class Main {
    public static void main(String[] args) {
        Native anative = new Native();
    }
}