package midterm1;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " earns a salary of " + salary;
    }

    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee other = (Employee) o;
            return this.name.equals(other.name) && this.salary == other.salary;
        } else {
            return false;
        }
    }
}
