package midterm2;

/*
 * A class used to test our E07Static class.
 * Play around with this and E07Static to see the behavior of
 * static variables.
 */
public class E07Tester {

    public static void main(String[] args) {
        // E07Dinosaur defaultDino = new E07Dinosaur();
        //
        // E07Dinosaur specialDino = new E07Dinosaur(31.4, true, "TrexyPoo",
        // "Hoomans");
        //
        // specialDino.setHeight(28.8);
        //
        // System.out.println(defaultDino);

        E07Static first = new E07Static(10);
        System.out.println(first);

        first.incrementInstanceInt();
        E07Static.incrementStaticInt();

        E07Static second = new E07Static(5);

        E07Static.incrementStaticInt();

        System.out.println(first);
        System.out.println(second);
    }

}
