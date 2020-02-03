package midterm1;

public class E06IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("computer", "core"));
        System.out.println(isSubsequence("computer", "cope"));
        System.out.println(isSubsequence("computer", "computer"));
    }

    /*
     * Returns whether or not s2 is a subsequence of s1.
     */
    public static boolean isSubsequence(String s1, String s2) {
        // Base Case
        if (s2.isEmpty()) {
            return true;
        } else if (s1.isEmpty()) {
            return false;
        }
        // Recursive Case
        if (s1.charAt(0) == s2.charAt(0)) {
            return isSubsequence(s1.substring(1), s2.substring(1));
        } else {
            return isSubsequence(s1.substring(1), s2);
        }
    }

}
