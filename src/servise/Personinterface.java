package servise;

import classes.Person;
import enums.Food;

import java.util.List;

public interface Personinterface {
    String createPerson();
    List<Person> getAllPerson();
    List<Food>getAllFood();
    String sortByPrice();
    Void findByname();
    String payForFood();
    double getSalary();
}
