package midterm4;

import java.util.ArrayList;
import java.util.List;

public class E24DiceSum {

    public static void main(String[] args) {
        diceSum(3, 7);
    }

    private static void diceSum(int numDie, int desiredSum) {
        diceSumHelper(numDie, desiredSum, new ArrayList<Integer>());
    }

    private static void diceSumHelper(int numDie, int sum,
            List<Integer> chosen) {
        // Base Case
        if (numDie == 0) {
            if (sum == 0) {
                System.out.println(chosen);
            }
        } else { // Recursive Case
            // For all possible decisions
            for (int i = 1; i <= 6; i++) {
                // Choose
                chosen.add(i);

                // Explore
                diceSumHelper(numDie - 1, sum - i, chosen);

                // Unchoose
                // Try removing the below line and see what happens.
                // Can you understand why?
                chosen.remove(chosen.size() - 1);
            }
        }
    }

}
