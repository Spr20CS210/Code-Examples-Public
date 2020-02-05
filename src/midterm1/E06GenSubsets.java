package midterm1;

public class E06GenSubsets {

    public static void main(String[] args) {
        printSubsets("abc");
    }

    /*
     * Prints out all possible subsets of characters from the
     * passed in string.
     */
    public static void printSubsets(String chars) {
        subsetsHelper(chars, "");
    }

    private static void subsetsHelper(String chars, String soFar) {
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            // Include this element
            subsetsHelper(chars.substring(1), soFar + chars.charAt(0));

            // Don't include this element
            subsetsHelper(chars.substring(1), soFar);
        }
    }


}
