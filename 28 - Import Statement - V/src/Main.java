import java.util.*;
import java.sql.*;

/*
 * Import Statement - V
 * Ambiguity with Import Statements:
 * When we import two classes with the same name from different packages (e.g., java.util.Date and java.sql.Date),
 * the compiler cannot decide which class to use. This results in a compile-time error:
 * reference to Date is ambiguous
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date(); // CE: reference to Date is ambiguous both class java.sql.Date in java.sql and class java.util.Date in java.util match
    }
}
