package midterm1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class E03HashMapHashSet {

    public static void main(String[] args) {
        // What type of map should we use?
        Map<String, Set<String>> friends = createFriendMap(
                "TestCases/friendList");

        System.out.println(friends);

        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first friend's name");
            String first = userInput.next();
            System.out.println("Enter second friend's name");
            String second = userInput.next();
            if (first.equals("") || second.equals("")) {
                break;
            }

            System.out.println(first + " and " + second
                    + " have the below friends in common:");
            Set<String> mutualFriends = friends.get(first);
            System.out.println(mutualFriends.retainAll(friends.get(second)));

        }
        userInput.close();
    }


    /*
     * Creates and returns a map from a person to the set of friends for that
     * person.
     */
    private static Map<String, Set<String>> createFriendMap(String filename) {
        Map<String, Set<String>> friendMap = new HashMap<String, Set<String>>();
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            String key;
            boolean insideSet = true;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.equals("")) {
                    insideSet = false;
                    continue;
                }
                if (insideSet) {
                    friendMap.get(key).add(line);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return friendMap;
    }

}
