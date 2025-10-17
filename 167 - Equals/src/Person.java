public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals() for content comparison
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (!(obj instanceof Person)) return false; // different type check

        Person person = (Person) obj;
        return this.age == person.age && this.name.equals(person.name);
    }
}
