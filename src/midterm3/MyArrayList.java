package midterm3;

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
        for (int i = 0; i < size; i++) {
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
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        // ERROR checking!
        return array[index];
    }

    public void remove(int index) {
        // ERROR checking!
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += " " + array[i] + " ";
        }
        result += "]";
        return result;
    }

    public boolean equals(Object o) {
        if (o instanceof MyArrayList) {
            MyArrayList other = (MyArrayList) o;
            if (this.size == other.size) {
                for (int i = 0; i < this.size; i++) {
                    if (array[i] != other.array[i]) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
