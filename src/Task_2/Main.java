package Task_2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addEntry("Jack", "375 29 123-45-67");
        phoneBook.addEntry("Jack", "375 29 123-54-76");
        phoneBook.addEntry("Jane", "375 29 987-65-43");
        phoneBook.addEntry("Tom", "375 25 111-22-33");
        phoneBook.addEntry("Alice", "375 33 444-55-66");
        phoneBook.addEntry("Bob", "375 44 777-88-99");

        var numberPhones = phoneBook.getNumberPhone("Jack");
        System.out.println(numberPhones);

    }
}
