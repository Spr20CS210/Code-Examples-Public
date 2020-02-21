package midterm1;

//           Subclass            Superclass
public class Salesperson extends Employee {

    private static final double COMMISSION = 0.10;

    private double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        // 'super' gives a reference to the super class.
        super(name, salary);

        /*
         * 'this' gives a reference to the instance of the class that you
         * are in
         */
        this.salesAmount = salesAmount;
    }

    public double getSalary() {
        return super.getSalary() + salesAmount * COMMISSION;
    }

    public String getSalesPitch() {
        return "Buy buy buy - NSync";
    }

    public boolean equals(Object o) {
        if (o instanceof Salesperson) {
            Salesperson other = (Salesperson) o;
            // name, salary, salesAmount
            return super.equals(other)
                    && this.salesAmount == other.salesAmount;
        } else {
            return false;
        }
    }

}
