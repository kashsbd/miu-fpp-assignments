import java.util.Objects;

public class Key {
    private String firstName;
    private String lastName;

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (ob.getClass() != this.getClass()) return false;
        Key k = (Key) ob;
        return k.firstName.equals(firstName) && k.lastName.equals(lastName);
    }

    @Override
    public String toString() {
        return "Key{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
