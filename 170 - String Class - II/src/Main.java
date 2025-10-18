/*
 * String Class
 * In String class, equals() method is OVERRIDDEN for content comparison.
 * Hence, even though objects are different, if content is same, equals() returns true.
 *
 * In StringBuffer class, equals() method is NOT overridden for content comparison.
 * Hence, Object class equals() method will be executed, which performs REFERENCE comparison.
 * Due to this, if objects are different, equals() returns false even though content is same.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * String (Content Comparison)
         * ==       → Reference comparison
         * equals() → Content comparison
         */
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        System.out.println("String Reference Comparison (==): " + (string1 == string2)); // false
        System.out.println("String Content Comparison (equals): " + string1.equals(string2)); // true

        System.out.println("---------------------------------------------");

        /*
         * StringBuffer (Reference Comparison)
         * ==       → Reference comparison
         * equals() → Also reference comparison (not overridden)
         */
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        StringBuffer stringBuffer2 = new StringBuffer("Hello");

        System.out.println("StringBuffer Reference Comparison (==): " + (stringBuffer1 == stringBuffer2)); // false
        System.out.println("StringBuffer equals() Comparison: " + stringBuffer1.equals(stringBuffer2)); // false
    }
}
