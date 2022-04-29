import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        listExample();
    }

    public static void listExample() {
        List<String> people = new LinkedList<>();
        people.add("Arman");
        people.add("Bogdan");
        people.add("Arman");
        people.add("Semen");
        people.add("Kirill");
        people.add("Lesha");
        people.add("Semen");
        people.add("Dima");
        people.add("Artem");
        people.add("Lesha");
        people.add("Bogdan");
        people.add("Bogdan");
        people.removeAll(Arrays.asList("Bogdan", "Arman", "Semen", "Lesha"));
        System.out.println(people);

    }
     public class PhoneBook {

            public void main(String[] args) {
                PhoneBook phoneBook = new PhoneBook();

                phoneBook.add ("Barkenov", "87479102242");
                phoneBook.add("Korovkin", "87479225659");
                phoneBook.add("Petrov", "87552695846");
                phoneBook.add("Kim", "87770552635");
                phoneBook.add("Lee", "87075884958");
                phoneBook.add("Han", "87478523649");
                System.out.println(Arrays.toString(phoneBook.get("Petrov"")));
            }

        }
    }
