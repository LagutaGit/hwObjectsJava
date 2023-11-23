public class Book {

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

    public void setDatePublish(int datePublish) {
        this.datePublish = datePublish;
    }


    public Book(String nameBook, String authorBook, int datePublish) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.datePublish = datePublish;
    }
}
