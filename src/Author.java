import java.util.Objects;

public class Author {
    private String firsName;
    private String lastName;

    public Author(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;

    }

    public String getFirsName() {
        return this.firsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return Objects.equals(firsName, author.firsName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName);
    }

    @Override
    public String toString() {
        return getFirsName() + " " + " " + getLastName();
    }
}
