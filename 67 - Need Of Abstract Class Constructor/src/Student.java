class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age); // Calls abstract class constructor
        System.out.println("Child class constructor executed...");
        this.rollNo = rollNo;
    }
}