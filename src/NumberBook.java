import java.util.Objects;

public class NumberBook {
    private String name;
    private final int id;
    private String number;
    private static int idGenerator = 0;

    public NumberBook(String name, String number) {
        idGenerator++;
        this.name = name;
        this.number = number;
        this.id = idGenerator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberBook that = (NumberBook) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return  "ФИО: " + name + ", номер: "  + number;
    }
}
