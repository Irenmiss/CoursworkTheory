public class Main {
    public static void main(String[] args) {

//        Билет №5
//        Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу.

        NumberBook contact1 = new NumberBook("Петров П.П.", "81234567891");
        try {
            BookService.addContact(contact1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}