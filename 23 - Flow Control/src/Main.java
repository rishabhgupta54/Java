/*
 * Flow Control
 * Flow Control describes the order in which the statement will be executed at the runtime
 * - Selection statement
 *      - if - else
 *      - switch
 * - Iterative Statements
 *      - while
 *      - do-while
 *      - for
 *      - for-each
 * - Transfer control
 *      - break
 *      - continue
 *      - return
 *      - try-catch-finally
 *      - assert
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Selection Statement
         */

        /*
         * if-else
         * syntax
         * if(condition) {
         *      Action if condition is true
         * } else {
         *      Action if condition is false
         * }
         * The argument to the if statement should be boolean type. By mistake if we are trying to provide any other type then we will get compile time error
         */

         /*int int1 = 0;
         if(int1) { // CE: incompatible types: int cannot be converted to boolean
             System.out.println("int1 if condition");
         } else {
             System.out.println("int1 else condition");
         }*/

         /*int int2 = 10;
         if(int2 = 20) { // CE: incompatible types: int cannot be converted to boolean
             System.out.println("int2 if condition");
         } else {
             System.out.println("int2 else condition");
         }*/

        int int3 = 10;
        if (int3 == 20) {
            System.out.println("int3 if condition");
        } else {
            System.out.println("int3 else condition");
        }

        boolean boolean1 = false;
        if (boolean1 = false) {
            System.out.println("boolean1 if condition");
        } else {
            System.out.println("boolean1 else condition");
        }

        boolean boolean2 = false;
        if (!boolean2) {
            System.out.println("boolean2 if condition");
        } else {
            System.out.println("boolean2 else condition");
        }

        /*
         * else part and curly braces are optional without curly braces only 1 statement is allowed which should not be declarative statement
         */
        if (true)
            System.out.println("You can take only 1 statement here");

        /*if(true)
            int int4 = 10; // CE: variable declaration not allowed here
        */

        if (true) {
            int int5 = 10;
        }

        /*
         * Switch
         * If several options are available then it is not recommended to use nested if-else because if reduces code readability. To handel this requirement we should go for switch statement
         * syntax(case) {
         *      case 1:
         *          action 1;
         *          brea;
         *      case 2:
         *          action 2
         *          break
         *      default:
         *          default action
         * }
         * The allowed arguments type for the switch statement are char, byte, short, int until v1.4
         * But from v1.5 onwards corrosponding wrapper (Characterm Byte, Short, Integer) and enum type is also allowed
         * From 1.7  version onwards String type is also allowed
         * Curly braces are mendatory except swith every where curly braces are optional
         * Both case and default are optional i.e. an empty switch sttatement is a valud java syntax
         * within the switch we can take default cast at most once
         * default case will be executed if and only if there is no case matched
         * within the switch we can write case anytwhere but it is recommended to write aa last case
         */
        int int6 = 10;
        switch (int6) {

        }

        /*
         * inside switch every statement should be under some case or default i.e. independent statement are not allowed insite swithc otherwise we will get compile time error
         */
        /*int int7 = 10;
        switch (int7) {
            System.out.println("Hello"); // CE:
        }*/

        /*
         * Every case label should be compile time constant
         */
        /*int int8 = 10;
        int int9 = 20;
        switch (int8) {
            case 10:
                System.out.println("Ten");
            case int9: // CE:
                System.out.println("Twenty");
        }*/

        /*
         * If we declare int9 as final then we won't get any compile time error
         */
        int int10 = 10;
        final int int9 = 20;
        switch (int10) {
            case 10:
                System.out.println("Ten");
            case int9:
                System.out.println("Twenty");
        }

        /*
         * Both switch argument and case label can be expression but case label should be constant expression
         */
        int int11 = 10;
        switch (int11 + 1) {
            case 10:
                System.out.println("Ten");
                break;
            case 10 + 20 + 30:
                System.out.println("Sixty");
                break;
        }

        /*
         * Every case label should be in the range of switch argument type otherwise we will get compile time error
         */
        /*byte byte1 = 10;
        switch (byte1) {
            case 10:
                System.out.println("Ten");
                break;
            case 100:
                System.out.println("One Hundred");
                break;
            case 1000: // CE: incompatible types: possible lossy conversion from int to byte
                System.out.println("One Thousand");
                break;
        }*/
        byte byte2 = 10;
        switch (byte2 + 1) { // because max(int, byte, int) = int and the return type of this expression is int. Thats why we are able to use case 1000
            case 10:
                System.out.println("Ten");
                break;
            case 100:
                System.out.println("One Hundred");
                break;
            case 1000:
                System.out.println("One Thousand");
                break;
        }

        /*
         * Duplicate case labels are not allowed otherwise we will get compile time error
         */
        /*int int12 = 10;
        switch (int12) {
            case 97:
                System.out.println("Ninety Seven");
                break;
            case 98:
                System.out.println("Ninety Eight");
                break;
            case 99:
                System.out.println("Ninety Nine");
                break;
            case 'a': // CE: duplicate case label
                System.out.println("Ninety Seven");
                break;
        }*/

        /*
         * Fall Through Inside Switch
         * Within the switch if any case is matched from that case onwards all the statements will be executed until break or end of the switch. This is called fall through inside switch
         * The main advantage of fall through inside a switch is that we can define common action for multiple cases(Code reuseability)
         */
        int int13 = 10;
        switch (int13) {
            case 1:
            case 2:
            case 3:
                System.out.println("Case 1 to Case 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Case 4 to Case 6");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Case 7 to Case 9");
                break;
            default:
                System.out.println("Case 10 to Case 12");
        }

        /*
         * Iterative Statements
         */
        /*
         * While
         * if we don't know the number of iteration in advanced then we should go for While loop
         * syntax
         * while(condition) {
         *      action
         * }
         * the condition argument should be of boolean type. If we are trying to provide any other type then we will get compile time error
         * curly braces are optional and without curly braces we can take only 1 statement under it which should not be a declarative statement
         */
        /*while (1) { // CE: incompatible types: int cannot be converted to boolean
            System.out.println("While Loop");
        }*/

        /*while(true) {
            System.out.println("Hello"); // CE: unreachable statement
        }*/

        /*int int14 = 10;
        int int15 = 20;
        while (int14 < int15) {
            System.out.println("Hello"); // infinite loop
        }*/

        /*
         * Every final variable will be replaced by the value at the compile time only. So the below if condition will always false
         */
        /*final int int16 = 10;
        final int int17 = 20;
        while(int16 > int17) { // => while (10 > 20)
            System.out.println("Hello"); // CE: unreachable statement
        }*/

        /*
         * If every argument is a final variable then that operation should be performed at compile time only
         */
        final int int18 = 10, int19 = 20;
        int int20 = 20;
        System.out.println(int18 + int19); // after compilation => System.out.println(30);
        System.out.println(int18 + int20); // after compilation => System.out.println(10 + int20);
        System.out.println(int18 < int19); // after compilation => System.out.println(true);
        System.out.println(int18 < int20); // after compilation => System.out.println(10 < int20);

        /*
         * do-while
         * If we want to execute a loop body at least once then we should go for do-while
         * syntax
         * do {
         *  action
         * } while(condition)
         * the condition argument should be of boolean type. If we are trying to provide any other type then we will get compile time error
         * curly braces are optional and without curl braces we can take only 1 statement between the do and while, which should not be declarative statement.
         */

        do
            System.out.println("Do While Loop will execute even if the condition is false because the condition is checked in the end that why it is said if you want to execute the loop at least once");
        while (false);

        /*
         * For
         * it is the most commonly used loop
         * if we know the number of iteration in advance then for loop is the best choice
         * syntax
         * for(initialization; condition; increment/decrement) {
         *      action
         * }
         * curly braaces are optional without curly braces we can take only 1 statement  which should not be declarative statement.
         * Initialization
         *  - This spot will be executed only once in the loop cycle
         *  - we can declare and initialize local variable for the loop
         *  - we can declare any number of variables but should be of same type. By mistake if we declare different type of variables then we will get compile time error
         *  - in the initialization section we can take any valid java statement including System.out.println
         * Conditional Check
         *  - We can take any valid express but should be of the type boolean
         *  - This spot is optional and if we are not taking anything, then compilar will always place true
         * Increment/Decrement
         *  - we can take any valid java statement including System.out.println
         * all three part of loop are independent of each other and optional
         */

        for (int int21 = 0; int21 < 10; int21++) {
            System.out.println("Hello int21");
        }
        /*for (; ; ) {
            System.out.println("Everything is optional. Internally this loop will be converted into while loop");
        }*/

        /*
         * for-each
         * Introduced in v1.5
         * It is specially designed to retrive elements of arrays and collections
         */

        int[] array1 = {10, 20, 30, 40, 50};
        for (int array : array1) {
            System.out.println("Array value: " + array);
        }

        /*
         * Transfer Control
         */
        /*
         * break
         * we can use break statement in the following places
         * - inside switch -  to stop fall through - which we have discussed above
         * - indide loop - to break loop execution based on some condition
         */

        for (int int21 = 0; int21 < 10; int21++) {
            if (int21 == 5) {
                break;
            }
            System.out.println("int21: " + int21);
        }

        /*
         * continue
         * we can use continue statement inside loop to skip current iteration and continue for the next iteration
         */
        for (int int22 = 0; int22 < 10; int22++) {
            if (int22 == 5) {
                continue;
            }
            System.out.println("int22: " + int22);
        }
    }
}
