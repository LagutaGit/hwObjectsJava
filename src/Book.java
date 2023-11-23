import java.util.Objects;

public class Book {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return datePublish == book.datePublish && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, datePublish);
    }

    private String nameBook;
    private String authorBook;
    private int datePublish;

    public String getNameBook() {
        return nameBook;
    }


    public String getAuthorBook() {
        return authorBook;
    }


    public int getDatePublish() {
        return datePublish;
    }

    public int setDatePublish(int datePublish) {
        this.datePublish = datePublish;
        return datePublish;
    }


    public Book(String nameBook, String authorBook, int datePublish) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.datePublish = datePublish;
    }

    public String toString() {
        return "Название книги " + this.nameBook + " автор книги " + this.authorBook + " дата публикации " + datePublish;
    }

}
