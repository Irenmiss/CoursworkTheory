import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BookService {
    private static final Map<Integer, NumberBook> numberBookMap = new HashMap<>();

    public static void addContact(NumberBook numberBook) throws IllegalArgumentException {
        if (Objects.nonNull(numberBook.getName()) && Objects.nonNull(numberBook.getNumber()) && !numberBook.getName().isEmpty() && !numberBook.getNumber().isEmpty()) {
            numberBookMap.put(numberBook.getId(), numberBook);
            System.out.println("Добавлен контакт:\n" + numberBook);
        } else {
            throw new IllegalArgumentException("Заполнены не все данные");
        }
    }

    public static void contactList() {
        System.out.println("Список контактов: ");
        for (Map.Entry<Integer, NumberBook> numberBookMap : numberBookMap.entrySet()) {
            System.out.println(numberBookMap.getKey() + " " + numberBookMap.getValue());
        }
    }
}
