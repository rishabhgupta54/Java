// Low Cohesion: Handles both math and printing (bad practice)
public class Utility {
    public int multiply(int a, int b) {
        return a * b;
    }

    public void print(String message) {
        System.out.println("Utility Printing: " + message);
    }
}
