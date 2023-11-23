import java.util.Objects;

public class Author {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(sunameAuthor, author.sunameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, sunameAuthor);
    }

    private String nameAuthor;
    private String sunameAuthor;

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSunameAuthor() {
        return sunameAuthor;
    }

    public Author(String nameAuthor, String sunameAuthor) {
        this.nameAuthor = nameAuthor;
        this.sunameAuthor = sunameAuthor;
    }

    public String toString() {
        return "Имя автора " + this.nameAuthor + " Фамилия " + this.sunameAuthor;
    }


}
