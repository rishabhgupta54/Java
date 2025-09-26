public class Student extends Person implements Identifiable {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age); // Calls abstract class constructor
        System.out.println("Child class constructor executed...");
        this.rollNo = rollNo;
    }

    @Override
    public void showId() {
        System.out.println("Interface ID: " + ID);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        showId();
    }
}
