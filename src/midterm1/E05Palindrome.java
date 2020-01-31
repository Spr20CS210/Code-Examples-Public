package midterm1;

public class E05Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("step on no pets"));
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("byebye"));

    }

    /*
     * This recursive method returns true if the passed in string
     * s is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

}
