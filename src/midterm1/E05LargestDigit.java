package midterm1;

public class E05LargestDigit {

    public static void main(String[] args) {
        System.out.println(largestDigit(8342116));
        System.out.println(largestDigit(40109));
        System.out.println(largestDigit(-163505));
        System.out.println(largestDigit(0));

    }

    /*
     * This function takes in an integer n and returns
     * the largest single digit from n.
     */
    public static int largestDigit(int n) {
        if (n < 0) {
            return largestDigit(-n);
        } else if (n < 10) {
            return n;
        } else {
            return Math.max(n % 10, largestDigit(n / 10));
        }
    }

}
