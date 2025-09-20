/*
 * String Concatenation Operator
 * The only overloaded operator in java is + operator. Sometimes it acts as arithmatic operator and sometimes it acts as String contactination operator
 */
public class Main {
    public static void main(String[] args) {
        /*
         * It atleast 1 argument is String type then + operator acts as concetination operator and if both arguments are of number type then + operator acts as arithmetic addition operator
         */
        String a = "Hello";
        int b = 10, c = 20, d = 30;

        System.out.print("a + b + c + d = ");
        System.out.println(a + b + c + d);
        System.out.print("b + c + d + a = ");
        System.out.println(b + c + d + a);
        System.out.print("b + c + a + d = ");
        System.out.println(b + c + a + d);
        System.out.print("b + a + c + d = ");
        System.out.println(b + a + c + d);
    }
}
