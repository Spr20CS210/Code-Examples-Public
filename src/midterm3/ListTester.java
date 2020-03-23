package midterm3;

public class ListTester {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(67);
        list.add(42);
        list.remove(0);

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("CS210");
        linkedList.add("Social Distance");
        System.out.println(linkedList);

    }

}
