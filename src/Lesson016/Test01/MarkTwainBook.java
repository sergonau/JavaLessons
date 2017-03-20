package Lesson016.Test01;

/**
 * Created by admin on 17.12.16.
 */
public class MarkTwainBook extends Book {

    private String bookName;

    @Override
    public MarkTwainBook getBook() {
        return this;
    }

    @Override
    public String getName() {
        return this.bookName;
    }

    public MarkTwainBook(String bookName) {
        super("Mark Twain");
        this.bookName = bookName;
    }
}
