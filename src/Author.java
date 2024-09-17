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
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Author name = (Author) object;
        return firsName.equals(name.firsName) || lastName.equals(name.firsName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firsName);
    }

    @Override
    public String toString() {
        return getFirsName() + " " + " " + getLastName();
    }
}
