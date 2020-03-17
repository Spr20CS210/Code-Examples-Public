package midterm2;

public class MyLinkedList {

    private Node front;
    private int size;

    public MyLinkedList() {
        front = null;
        size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value, null);
        if (front == null) {
            front = newNode;
        } else {
            Node curr = front;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size += 1;
    }

    public void add(int index, int value) {
        if (index == 0) {
            Node newNode = new Node(value, front);
            front = newNode;
        } else {
            int count = 0;
            Node curr = front;
            while (curr.next != null && count < index - 1) {
                curr = curr.next;
                count += 1;
            }
            Node newNode = new Node(value, curr.next);
            curr.next = newNode;
        }
        size += 1;
    }

    public void clear() {
        front = null;
        size = 0;
    }

    public boolean contains(int value) {
    }

    public int get(int index) {
    }

    public void remove(int index) {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

    }

    /*
     * This method is made harder because we have not implemented
     * get. Once get is implemented, the below can be made much
     * cleaner.
     */
    public boolean equals(Object o) {
        if (o instanceof MyLinkedList) {
            MyLinkedList other = (MyLinkedList) o;
            if (this.size != other.size) {
                return false;
            }
            Node thisCurr = front;
            Node otherCurr = other.front;
            while (thisCurr != null && otherCurr != null) {
                if (thisCurr.data != otherCurr.data) {
                    return false;
                }
                thisCurr = thisCurr.next;
                otherCurr = otherCurr.next;
            }
            return true;
        } else {
            return false;
        }
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
