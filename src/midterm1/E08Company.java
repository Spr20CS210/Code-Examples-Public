package midterm1;

public class E08Company {

    public static void main(String[] args) {
        Employee susan = new Employee("Susan", 60000);

        Salesperson daniel = new Salesperson("Daniel", 50000, 80000);

        /*
         * An example of polymorphism.
         * We use a declared (compile-time) type of 'Employee' which is the
         * superclass of the actual (run-time) type 'Salesperson'.
         */
        Employee arjun = new Salesperson("Arjun", 42000, 40000);

        Employee[] array = new Employee[3];
        array[0] = daniel;
        array[1] = susan;
        array[2] = arjun;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i].getSalary());
        }

        System.out.println(susan instanceof Employee);
        System.out.println(susan instanceof Salesperson);
        System.out.println(daniel instanceof Employee);
        System.out.println(daniel instanceof Salesperson);
        System.out.println(arjun instanceof Employee);
        System.out.println(arjun instanceof Salesperson);

        /*
         * The below gives an error since Salesperson is a subclass
         * of Employee.
         */
        // Salesperson tyler = new Employee("Tyler", 32000);

        System.out.println(susan.getSalary());
        System.out.println(daniel.getSalary());
        /*
         * Notice that the overriden method is called for 'arjun'.
         * The method that gets called at run-time depends on the
         * actual (run-time) type, NOT the declared type.
         */
        System.out.println(arjun.getSalary());

        /*
         * The below gives an error since 'getSalesPitch' is a
         * method ONLY declared in the Salesperson class.
         */
        // System.out.println(susan.getSalesPitch());

        System.out.println(daniel.getSalesPitch());

        /*
         * The below gives an error since 'getSalesPitch' is a
         * method ONLY declared in the Salesperson class and
         * 'arjun' has a declared (compile-time) type of Employee.
         */
        // System.out.println(arjun.getSalesPitch());
    }

}
