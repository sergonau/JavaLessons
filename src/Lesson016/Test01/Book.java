package Lesson016.Test01;

/**
 * Created by admin on 17.12.16.
 */
public abstract class Book {

    private String author;

    public abstract Book getBook();

    public abstract String getName();

    String getOutputByBookType() {
        String agathaChristieOutput = this.author + ", " + getBook().getName() + " is a detective";
        String markTwainOutput = getBook().getName() + " book was written by " + this.author;

        if(this instanceof MarkTwainBook){
            return markTwainOutput;
        } else return agathaChristieOutput;
    }

    public Book(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getOutputByBookType();
    }
}
