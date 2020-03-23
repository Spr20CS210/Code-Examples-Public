package midterm3;

public class GenericBox<E> {

    private E item;

    // Constructor
    public GenericBox() {
        item = null;
    }

    // Put method
    public void put(E item) {
        this.item = item;
    }

    // get method
    public E get() {
        return this.item;
    }

}
