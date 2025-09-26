public class Student extends Person {
    int rollNumber;
    int marks;

    public Student(String name, int age, int rollNumber, int marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}
