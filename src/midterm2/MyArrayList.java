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

    }

    // Do this one first, and then use it for the top add
    public void add(int index, int value) {
        if (size >= capacity) {
            // We need to grow our array
        } else {
            // This is much easier
        }
    }

    public void clear() {

    }

    public boolean contains(int value) {
        return false;
    }

    public int get(int index) {
        return -1;
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
