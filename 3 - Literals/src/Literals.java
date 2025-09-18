/*
 * Literals in Java
 *
 * Any constant value which can be assigned to a variable is called a literal.
 * Example:
 * int x = 10;
 * Here,
 * - int → data type / keyword
 * - x → variable name (identifier)
 * - 10 → constant value (literal)
 */
public class Literals {
    public static void main(String[] args) {
        /*
         * Integer Literals
         *
         * For integral data types (byte, short, int, long), we can specify literal values in:
         * 1. Decimal Form (Base 10)
         * 2. Octal Form (Base 8)
         * 3. Hexadecimal Form (Base 16)
         * 4. Binary Form (Base 2) → introduced in Java 7
         *
         * By default, every integer literal is of type int.
         * For long type, we can explicitly suffix it with L or l. For example:
         * long l1 = 10L; long l2 = 10l;
         *
         * There is no direct way to specify byte and short literals explicitly. But if the integer literal value is within the range of byte or short, the compiler automatically treats it as byte or short when assigned.
         */

        /*
         * Decimal Form (Base 10)
         * Allowed digits are 0–9
         */
        int intDecimalLiteral = 10;
        System.out.println("Decimal literal (10) = " + intDecimalLiteral);

        /*
         * Octal Form (Base 8)
         * Allowed digits are 0–7
         * Note: Octal literal should be prefixed with 0
         */
        int intOctalLiteral = 010; // represents 8 in decimal
        System.out.println("Octal literal (010) = " + intOctalLiteral);

        /*
         * Hexadecimal Form (Base 16)
         * Allowed digits are 0–9 and a–f (or A–F)
         * Note: Hexadecimal literal should be prefixed with 0x or 0X
         * Java is not case-sensitive for hex digits (a-f and A-F are same).
         */
        int intHexadecimal = 0x10; // represents 16 in decimal
        System.out.println("Hexadecimal literal (0x10) = " + intHexadecimal);

        /*
         * Binary Form (Base 2) → Introduced in Java 7
         * Allowed digits are 0 and 1
         * Note: Binary literal should be prefixed with 0b or 0B
         */
        int intBinaryLiteral = 0b1010; // represents 10 in decimal
        System.out.println("Binary literal (0b1010) = " + intBinaryLiteral);

        // Invalid
        // int x1 = 0786; // 8 is not allowed in octal
        // int x2 = 0xBeer; // 'r' is not a valid hex digit
        // int x3 = 0b102; // 2 is not allowed in binary


        /*
         * Floating-point Literals
         *
         * By default, every floating-point literal in Java is of type double.
         * Hence, we cannot directly assign a decimal value to a float variable.
         *
         * To make a literal float, we must suffix it with 'F' or 'f'.
         * To make a literal explicitly double, we may suffix it with 'D' or 'd'
         * (though this is optional since double is the default).
         */

        // float float1 = 123.456; // CE: incompatible types
        float float2 = 123.456F; // Valid: explicitly declared as float
        System.out.println("Float literal (123.456F) = " + float2);

        double double1 = 123.456; // Valid: default is double
        System.out.println("Double literal (123.456) = " + double1);

        double double2 = 123.456D; // Valid: explicitly declared as double
        System.out.println("Double literal (123.456D) = " + double2);

        // float float3 = 123.456D; // CE: incompatible types

        /*
         * Floating-point literals can be specified only in decimal form.
         * They CANNOT be specified in octal or hexadecimal form.
         */
        double double3 = 123.456; // Valid: decimal literal
        System.out.println("Double literal (123.456) = " + double3);

        double double4 = 0123.456; // Valid: treated as decimal (leading 0 ignored)
        System.out.println("Double literal (0123.456) = " + double4);

        // double double5 = 0123.456; // CE: malformed floating point literal

        /*
         * Integer literals can be directly assigned to floating-point variables.
         * Such integer literals may be written in decimal, octal, or hexadecimal forms.
         */
        // double double6 = 0786; // CE: invalid integer literal
        double double7 = 0xface; // hexadecimal integer literal promoted to double
        System.out.println("Double literal (0xface) = " + double7);

        double double8 = 0786.0; // treated as decimal floating-point (not octal, because of '.0')
        System.out.println("Double literal (0786.0) = " + double8);

        // double double9 = 0xface.0;  // CE: not allowed

        /*
         * Floating-point literals can also be specified in exponential (scientific) form.
         * Syntax: mantissa e|E exponent
         *
         * - mantissa → a decimal number
         * - exponent → an integer (positive or negative)
         */
        double double10 = 1.2e3; // 1200.0
        System.out.println("Exponential literal (1.2e3) = " + double10);

        double double11 = 1.2E-3; // 0.0012
        System.out.println("Exponential literal (1.2E-3) = " + double11);

        float float4 = 2.5e2F; // 250.0
        System.out.println("Exponential float literal (2.5e2F) = " + float4);

        /*
         * Boolean Literals
         *
         * The only allowed values for boolean literals are:
         * - true
         * - false
         *
         * They are case-sensitive (must be all lowercase).
         * We cannot use 0/1 or True/False as boolean literals in Java.
         */

        boolean boolean1 = true;
        System.out.println("Boolean literal (true) = " + boolean1);

        boolean boolean2 = false;
        System.out.println("Boolean literal (false) = " + boolean2);

        // boolean boolean3 = 0;     // CE: incompatible types - int cannot be converted to boolean
        // boolean boolean4 = 1;     // CE: incompatible types - int cannot be converted to boolean
        // boolean boolean5 = True;  // CE: cannot find symbol
        // boolean boolean6 = False; // CE: cannot find symbol

        /*
         * Char Literals
         *
         * A char literal represents:
         * 1. A single character in single quotes (e.g., 'a')
         * 2. An integer literal (decimal, octal, or hexadecimal) within range 0–65,535
         *    → represents the Unicode value of the character
         * 3. A Unicode escape sequence (e.g., '\u0061' for 'a')
         * 4. An escape sequence (e.g., '\n', '\t')
         *
         * Invalid forms:
         * - Multiple characters in single quotes ('ab')
         * - Without quotes (a)
         * - Using double quotes ("a")
         * - Out of range values (> 65,535)
         */

        // Valid
        char char1 = 'a';
        System.out.println("char1 = " + char1);

        char char2 = 97;
        System.out.println("char2 (97) = " + char2);

        char char3 = 0xFace;
        System.out.println("char3 (0xFace) = " + char3);

        char char4 = 0777;
        System.out.println("char4 (0777) = " + char4);

        char char5 = 65535;
        System.out.println("char5 (65535) = " + char5);

        char char6 = '\u0061';
        System.out.println("char6 (\\u0061) = " + char6);

        // Invalid
        // char invalid1 = a;        // CE: cannot find symbol (quotes missing)
        // char invalid2 = "a";      // CE: incompatible types - String cannot be converted to char
        // char invalid3 = 'ab';     // CE: too many characters in character literal
        // char invalid4 = 65536;    // CE: possible lossy conversion (out of range for char)

        // Escape characters
        char newLine = '\n';
        char tab = '\t';
        char backspace = '\b';
        char carriageReturn = '\r';
        char formFeed = '\f';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';

        System.out.println("Escape characters:");
        System.out.println("newLine = Hello" + newLine + "World");
        System.out.println("tab = Hello" + tab + "World");
        System.out.println("backspace = Hello" + backspace + "World");
        System.out.println("carriageReturn = Hello" + carriageReturn + "World");
        System.out.println("formFeed = Hello" + formFeed + "World");
        System.out.println("singleQuote = " + singleQuote);
        System.out.println("doubleQuote = " + doubleQuote);
        System.out.println("backslash = " + backslash);

        /*
         * String Literals
         *
         * - A sequence of characters within double quotes (" ") is treated as a String literal.
         * - Unlike char literals (which are single characters in single quotes),
         *   String literals can have zero or more characters.
         * - String is a non-primitive (reference) data type in Java.
         */

        // Normal string literal
        String string1 = "This is a string literal";
        System.out.println("string1 = " + string1);

        // Empty string literal
        String string2 = "";
        System.out.println("string2 (empty) = \"" + string2 + "\"");

        // String with escape characters
        String string3 = "Hello\nWorld\t2025\\Java\'s\"Power\"";
        System.out.println("string3 (with escape chars) = " + string3);

        // Concatenated string literal
        String string4 = "Hello " + "Java";
        System.out.println("string4 (concatenation) = " + string4);

        // Invalid cases
        // String string5 = 'Hello';   // CE: single quotes denote char, not String
        // String string6 = Hello;     // CE: Hello not enclosed in quotes

        /*
         * Binary Literal
         *
         * - For integral data types until Java v1.6, literals could only be in Decimal, Octal, or Hexadecimal forms.
         * - From Java v1.7 onwards, we can also specify literals in Binary form.
         *
         * Rules:
         * - Allowed digits are only 0 and 1
         * - Literal must be prefixed with 0b or 0B
         */

        int intBinary1 = 0b1010;
        int intBinary2 = 0B1111;

        System.out.println("Binary literal (0b1010) = " + intBinary1);
        System.out.println("Binary literal (0B1111) = " + intBinary2);

        // Invalid cases
        // int intBinary3 = 0b102; // CE: 2 is not a valid binary digit
        // int intBinary4 = 0B; // CE: incomplete binary literal

        /*
         * Use of underscore (_) symbol in numeric literals
         *
         * - From Java v1.7 onwards, we can use underscore symbol between digits of numeric literals.
         * - Advantage: Improves readability of large numbers.
         * - At compile-time, underscores are ignored by the compiler.
         *
         * Example: 12_34_56_789 is same as 123456789
         */

        int int1 = 12_34_56_789;  // Valid
        System.out.println("int1 = " + int1);

        double double12 = 12_34_56_789.12_34_56_789;  // Valid
        System.out.println("double1 = " + double12);

        // Invalid cases
        // int int2 = _1234; // CE: underscore cannot be at the beginning
        // int int3 = 1234_; // CE: underscore cannot be at the end
        // double double2 = 123_.45; // CE: underscore cannot be just before or after decimal point
        // double double3 = 123._45; // CE: underscore cannot be placed immediately after decimal point
        // int int4 = 0x_123; // CE: underscore not allowed right after 0x in hex
        // int int5 = 0b_1010; // CE: underscore not allowed right after 0b in binary


        /*
         * Data Type Conversion / Type Promotion in Java
         *
         * 1. Widening Conversion (Safe conversion)
         *    - Smaller data type → Larger data type
         *    - Done automatically by compiler (implicit casting)
         *
         *    byte → short → int → long → float → double
         *    char → int → long → float → double
         *
         *    Example:
         *      int i = 100;
         *      long l = i;   // int promoted to long
         *      float f = l;  // long promoted to float
         *
         *
         * 2. Narrowing Conversion (Risky conversion)
         *    - Larger data type → Smaller data type
         *    - Must be done explicitly using type-cast
         *    - Possible data loss
         *
         *    Example:
         *      int i = 130;
         *      byte b = (byte) i; // explicit cast, value overflow (result = -126)
         *
         *
         * Note:
         * - char, byte, short, int, long → Integral Data Types
         * - float, double → Floating-point Data Types
         *
         *
         * Special Case:
         * - long (8 bytes) → float (4 bytes) is allowed without explicit cast
         *   Because:
         *     - float has smaller size in memory (4 bytes)
         *     - BUT float has larger range than long (due to different internal representation)
         *   Hence compiler allows implicit conversion.
         *
         *   Example:
         *      long l = 10_00_00_00_000L; // 10 billion
         *      float f = l;  // valid
         */
    }
}
