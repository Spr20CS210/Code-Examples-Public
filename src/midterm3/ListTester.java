package midterm3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ListTester {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(67);
        list.add(42);
        list.remove(0);
        MyArrayList anotherReference = list;

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("CS210");
        linkedList.add("Social Distance");
        System.out.println(linkedList);

        // Nothing to sweep up

        someFunction();

        // Garbage collector can sweep up the below hashMap and TreeSet
    }

    public static void someFunction() {
        Map<String, String> map = new HashMap<>();
        Set<String> set = new TreeSet<>();
    }

}
