package midterm3;

public class MyLinkedList<E> implements MyList<E> {

    private ListNode<E> front;

    public MyLinkedList() {
        front = null;
    }

    public void add(E value) {
        if (front == null) {
            front = new ListNode<E>(value);
        } else {
            ListNode<E> current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode<E>(value);
        }
    }

    public void add(int index, E value) {
        if (index == 0) {
            front = new ListNode<E>(value, front);
        } else {
            ListNode<E> current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            ListNode<E> temp = new ListNode<E>(value, current.next);
            current.next = temp;
        }
    }

    public void set(int index, E value) {
        ListNode<E> current = goTo(index);
        current.data = value;
    }

    public int indexOf(E value) {
        int index = 0;
        ListNode<E> current = front;
        while (current != null) {
            if (current.data.equals(value)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public E get(int index) {
        ListNode<E> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode<E> current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    public int size() {
        ListNode<E> current = front;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode<E> current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    private ListNode<E> goTo(int index) {
        ListNode<E> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private class ListNode<E> {
        E data;
        ListNode<E> next;

        // Creates a terminal ListNode containing null as data.
        public ListNode() {
            this(null, null);
        }

        // Creates a terminal ListNode with the specified data.
        public ListNode(E data) {
            this(data, null);
        }

        // Creates a ListNode with the specified data and next node.
        public ListNode(E data, ListNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}

