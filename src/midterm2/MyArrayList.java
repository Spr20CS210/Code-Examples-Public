package midterm2;

public class MyArrayList {

    private static final int INITIAL_CAPACITY = 10;

    private int size;
    private int capacity;
    private int[] array;

    public MyArrayList() {
        size = 0;
        capacity = INITIAL_CAPACITY;
        array = new int[capacity];
    }

    public MyArrayList(MyArrayList other) {
        this.size = other.size;
        this.capacity = other.capacity;
        array = new int[capacity];
        for (int i = 0; i < size; i++) {
            array[i] = other.array[i];
        }
    }

    private void growArray() {
        // Double the size of my array
        int[] newArray = new int[capacity * 2];
        capacity *= 2;
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void add(int value) {
        add(size, value);
    }

    // Do this one first, and then use it for the top add
    public void add(int index, int value) {
        // Error checking!
        if (size >= capacity) {
            this.growArray();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public void clear() {
        size = 0;
    }

    public boolean contains(int value) {
        int i = 0;
        boolean found = false;
        while (!found && i < size) {
            found = array[i] == value;
            i++;
        }
        return found;
    }

    public int get(int index) {
        // ERROR checking!
        return array[index];
    }

    public void remove(int index) {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return "";
    }

    public boolean equals(Object o) {
        return false;
    }

}
