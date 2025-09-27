/*
 * Overloading
 * String and StringBuffer are siblings (both extend Object but do not extend each other).
 * Passing null makes both methods applicable, but neither is "more specific".
 * Hence: Compile-time error: reference to m1 is ambiguous.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.m1("hello");
        main.m1(new StringBuffer("Hello"));
        // main.m1(null); // CE: reference to m1 is ambiguous both method m1(java.lang.String) in Main and method m1(java.lang.StringBuffer) in Main match
    }

    public void m1(String string) {
        System.out.println("String method");
    }

    public void m1(StringBuffer stringBuffer) {
        System.out.println("StringBuffer method");
    }
}
