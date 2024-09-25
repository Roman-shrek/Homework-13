import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int datePublication;

    public Book(String titleBook, Author author, int datePublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.datePublication = datePublication;

    }
    public Book(String titleBook, Author author) {
        this(titleBook, author, 0);
    }

    public String getTitleBook() {
        return this.titleBook;

    }

    public Author getAuthor() {
        return this.author;
    }

    public int getDatePublication() {
        return this.datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return datePublication == book.datePublication && Objects.equals(titleBook, book.titleBook)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, datePublication);
    }

    @Override
    public String toString() {
        if (datePublication != 0) {
            return "Книга: " + getTitleBook() + "." + " Автор: " + author + "." + " Опубликована в " +
                    +getDatePublication();
        } else {
            return "Книга: " + getTitleBook() + ". Автор: " + author;
        }
    }
}
