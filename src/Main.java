import classes.Person;
import enums.Country;
import enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;

import static enums.Status.CLIENT;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Saltanat", LocalDate.of(2002,6,28), CLIENT,1, Country.POLAND );
        Person person2 = new Person("Aygerim", LocalDate.of(2003,5, 23), Status.HEAD_CHEF,2,Country.FRANCE);
        Person person3 = new Person("Alibek", LocalDate.of(2004, 8, 12),Status.PASTRY,3, Country.GERMANI);
        Person person4 = new Person("Elisa", LocalDate.of(2003, 9 ,10),Status.SOUS_CHEF,4,Country.FRANCE);
        Person person5 = new Person("jiydegul eje", LocalDate.of(1984, 3, 15),Status.KITCHEN_MANAGER,5,Country.KOREA);
        Person person6 = new Person("Ilim", LocalDate.of(1985, 7, 16),Status.WAITRESS,6, Country.JAPAN);
        Person person7 = new Person("Davran", LocalDate.of(2004, 4, 12),Status.WAITER, 7, Country.JAPAN);

        ArrayList<Person> people = new ArrayList<>();
        for (Person person: people) {
            person.

        }
        System.out.println(people);
    }
}