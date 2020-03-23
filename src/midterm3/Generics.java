package midterm3;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("CS210");
        list.add("Happy Monday");

        // 1. Annoying casting
        String test = (String) list.get(1);

        // 2. This is NOT type safe
        list.add(67);
        // String str = (String) list.get(2);

    }

}
