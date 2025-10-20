import java.io.Serializable;

class A implements Serializable {
    int i = 10; // normal instance variable
    final int j = 20; // final → serialized
    static int k = 30; // static → not serialized
    transient String password = "mypassword"; // transient → not serialized
}
