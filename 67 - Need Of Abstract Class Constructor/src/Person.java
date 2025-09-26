abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Abstract class constructor executed...");
        this.name = name;
        this.age = age;
    }
}