package midterm1;

/*
 * An uncommented, unfinished version of the Book class.
 */
public class E07Book {

    private String ISBN;
    private String title;
    private String author;
    private static int numCopies;

    public E07Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        numCopies++;
    }

    public String getISBN() {
        return ISBN;
    }

}
