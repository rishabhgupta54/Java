public class Student {
    private String name;
    private Address address; // Aggregation (can exist independently)

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Student: " + name + ", City: " + address.getCity());
    }
}
