package finalExam;

import java.util.ArrayList;
import java.util.List;

public class E25Permutations {

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<Character>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printPermutations(chars);
    }

    private static void printPermutations(List<Character> chars) {
        printHelper(chars, "");
    }

    private static void printHelper(List<Character> chars, String soFar) {
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            for (int i = 0; i < chars.size(); i++) {
                char choice = chars.get(i);
                soFar += choice;
                chars.remove(i);
                printHelper(chars, soFar);
                soFar = soFar.substring(0, soFar.length() - 1);
                chars.add(i, choice);
            }
        }
    }

}
