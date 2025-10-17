import java.lang.reflect.Method;

/*
 * getClass()
 * -----------
 * We can use getClass() method to get the runtime class definition of an object.
 *
 * Syntax:
 *     public final Class<?> getClass();
 *
 * By using the Class object (returned by getClass()), we can access:
 *  → Fully qualified name of the class
 *  → All method information (using getDeclaredMethods())
 *  → Constructor information
 *  → Field information
 *
 * This is a part of Java Reflection API — useful for frameworks and tools
 * that need to inspect classes dynamically (like Spring, Hibernate, etc.).
 */
public class Main {
    public static void main(String[] args) {
        Object object = new String("Hello");

        // Getting Class object representing runtime class of 'object'
        Class c = object.getClass();

        System.out.println("Fully Qualified Name of the Class: " + c.getName());
        System.out.println("Superclass: " + c.getSuperclass().getName());
        System.out.println("Is Interface: " + c.isInterface());
        System.out.println("Is Array: " + c.isArray());
        System.out.println("Is Primitive: " + c.isPrimitive());
        System.out.println("------------------------------------------");

        // Fetching all declared methods of the class
        Method[] methods = c.getDeclaredMethods();
        System.out.println("Methods of class " + c.getSimpleName() + ":");
        System.out.println("------------------------------------------");

        int count = 1;
        for (Method method : methods) {
            System.out.println("Method #" + count++);
            System.out.println("Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getSimpleName());

            // Printing parameter types
            Class[] paramTypes = method.getParameterTypes();
            if (paramTypes.length == 0) {
                System.out.println("Parameters: None");
            } else {
                System.out.print("Parameters: ");
                for (int i = 0; i < paramTypes.length; i++) {
                    System.out.print(paramTypes[i].getSimpleName());
                    if (i < paramTypes.length - 1)
                        System.out.print(", ");
                }
                System.out.println();
            }
            System.out.println("------------------------------------------");
        }
    }
}
