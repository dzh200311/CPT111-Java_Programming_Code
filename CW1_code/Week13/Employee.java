package Week13;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int s) {
        super(name);
        salary = s;
    }

    @Override
    public String toString() {
        return "Employee name: " + super.toString() + ", salary: " + salary;
    }
}
