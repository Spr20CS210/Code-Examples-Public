package midterm2;

//           Subclass            Superclass
public class Salesperson extends Employee {

    public enum State {
        AZ, UT, TX, CO, CA, NM, FL
    }

    private static final double COMMISSION = 0.10;

    private double salesAmount;
    private State territory;

    public Salesperson(String name, double salary, double salesAmount) {
        // 'super' gives a reference to the super class.
        super(name, salary);

        /*
         * 'this' gives a reference to the instance of the class that you
         * are in
         */
        this.salesAmount = salesAmount;
        this.territory = State.AZ;
    }

    public Salesperson(String name, double salary, double salesAmount,
            State state) {
        // 'super' gives a reference to the super class.
        super(name, salary);

        /*
         * 'this' gives a reference to the instance of the class that you
         * are in
         */
        this.salesAmount = salesAmount;
        this.territory = state;
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
