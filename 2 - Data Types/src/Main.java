/*
 * Data Types in Java:
 * A data type defines the kind of values a variable can store and the type of operations that can be performed on it.
 *
 * In simple words:
 * - Data types specify what kind of data (numeric, text, true/false, etc.) can be stored in a variable.
 * - They also determine how much memory will be allocated for that variable.
 *
 * Example:
 * int x = 10; 'int' means variable 'x' can only store integer values
 * char c = 'A'; 'char' means variable 'c' can only store a single character
 *
 * In Java, every variable and every expression has a specific type.
 * Each data type is clearly defined.
 * Every assignment is checked by the compiler for type compatibility.
 *
 * Note: Java is not considered a "pure" object-oriented programming language
 * because it does not support some OOP features such as operator overloading
 * and multiple inheritance. Moreover, Java depends on primitive data types,
 * which are not objects.
 *
 * In Java, we have two categories of data types:
 * 1. Primitive Data Types
 * 2. Non-Primitive (Reference) Data Types
 *
 * Primitive Data Types are further divided into:
 * 1. Numeric data types
 * 2. Non-numeric data types
 *
 * Numeric data types are divided into:
 * 1. Integral data types → byte, short, int, long
 * 2. Floating-point data types → float, double
 *
 * Non-numeric data types are → char and boolean
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Primitive Data Types:
         * - byte
         * - short
         * - int
         * - long
         * - float
         * - double
         * - boolean
         * - char
         *
         * Except for boolean and char, all other primitive types are considered signed data types
         * because they can represent both positive and negative numbers.
         */

        /*
         * byte:
         * Size  - 1 byte (8 bits)
         * Range - -128 to 127
         * The best choice when handling data in terms of streams
         * (e.g., file streams or network streams).
         */
        byte byte1 = 10;
        byte byte2 = 127;
        // byte byte3 = 128; // CE: possible lossy conversion from int to byte because 128 is outside the valid range.
        // byte byte4 = true; // CE: incompatible types - boolean cannot be converted to byte because boolean values are not numeric.

        /*
         * short:
         * Size  - 2 bytes (16 bits)
         * Range - -32,768 to 32,767
         * Rarely used in modern Java.
         * Historically useful for 16-bit processors (e.g., 8085), but those are outdated now.
         */
        short short1 = 10;
        short short2 = 32767;
        // short short3 = 32768; // CE: possible lossy conversion from int to short because 32768 is outside the valid range.

        /*
         * int:
         * Size  - 4 bytes (32 bits)
         * Range - -2,147,483,648 to 2,147,483,647
         * The most commonly used data type in Java.
         * It is the default integral data type.
         */
        int int1 = 2147483647;
        // int int2 = 2147483648; // CE: integer number too large (exceeds int range).

        /*
         * long:
         * Size  - 8 bytes (64 bits)
         * Range - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * Used when int is not sufficient for very large values.
         * Example: The number of characters in a file can exceed int range,
         * so the return type of length() in the File class is long.
         *
         * By default, integer literals are treated as int,
         * so we must add suffix L (or l) to specify a long literal.
         */
        long long1 = 9223372036854775807L;
        // long long2 = 9223372036854775808L; // CE: integer number too large.

        /*
         * All the above types (byte, short, int, long) are used for integral values.
         * If we want to represent decimal/floating-point values, then we should use floating-point data types (float, double).
         */

        /*
         * float:
         * Size  - 4 bytes (32 bits)
         * Range - approx. ±3.4e38
         * Precision - up to 7 decimal digits
         *
         * By default, decimal numbers in Java are treated as double.
         * Hence, for float literals, we must add suffix 'f' or 'F'.
         *
         * float is the best suitable when we want to save memory in large arrays of floating-point numbers.
         */
        float float1 = 3.14f;
        float float2 = 12345.678f;
        // float float3 = 3.14; // CE: possible lossy conversion from double to float
        // float float4 = true; // CE: incompatible types - boolean cannot be converted to float

        /*
         * double:
         * Size  - 8 bytes (64 bits)
         * Range - approx. ±1.7e308
         * Precision - up to 15–16 decimal digits
         *
         * double is the default data type for floating-point numbers in Java.
         * It is the most commonly used floating-point type
         * because of its higher precision.
         */
        double double1 = 3.14159265359;
        double double2 = 1.7e308;
        // double double3 = "3.14"; // CE: incompatible types - String cannot be converted to double
        // double double4 = 1.7e309; // CE: floating point number too large

        /*
         * char:
         * Size  - 2 bytes (16 bits)
         * Range - 0 to 65,535 (represents Unicode characters)
         *
         * char is used to store a single character.
         * In Java, char uses Unicode (not ASCII), so it can represent any world language character.
         */
        char char1 = 'A';
        char char2 = '9';
        // char char3 = "A"; // CE: incompatible types - String cannot be converted to char
        // char char4 = -1; // CE: incompatible types - possible lossy conversion from int to char (negative values not allowed)

        /*
         * boolean:
         * Size  - not precisely defined (JVM dependent, often 1 byte)
         * Values - only true or false
         *
         * boolean is used for logical values and conditions.
         * It cannot be assigned numeric values.
         */
        boolean bool1 = true;
        boolean bool2 = false;
        // boolean bool3 = 1; // CE: incompatible types - int cannot be converted to boolean
        // boolean bool4 = "true"; // CE: incompatible types - String cannot be converted to boolean
    }
}
