public class Employee implements Comparable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        if (this.id < employee.id) {
            return -1;
        } else if (this.id > employee.id) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
