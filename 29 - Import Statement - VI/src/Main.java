import java.util.Date;
import java.util.*;

/*
 * Import Statement - VI
 *
 * When the compiler resolves a class name, it follows this precedence order:
 * 1. Explicit class imports (e.g., import java.util.Date;)
 * 2. Classes present in the current package
 * 3. Implicit class imports (e.g., import java.util.*;)
 *
 * This ensures that the most specific import is chosen first.
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
    }
}
