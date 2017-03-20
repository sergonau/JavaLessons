package Lesson016.Test01;

/**
 * Created by admin on 17.12.16.
 */
public class AgathaChristieBook extends Book {

    private String bookName;

    @Override
    public AgathaChristieBook getBook() {
        return this;
    }

    @Override
    public String getName() {
        return this.bookName;
    }

    public AgathaChristieBook(String bookName) {
        super("AgathaChristie");
        this.bookName = bookName;

    }
}