import java.util.ArrayList;

/*
 * Import Statement - I
 * Import statements allow us to use classes from other packages
 */
public class Main {
    public static void main(String[] args) {
        // ArrayList arrayList = new ArrayList(); // CE: cannot find symbol (ArrayList)

        /*
         * we can solve this problem by using the fully qualified name
         */
        java.util.ArrayList arrayList = new ArrayList();
    }
}
