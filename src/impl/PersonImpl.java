package impl;

import classes.Person;
import enums.Food;
import enums.Status;
import servise.Personinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonImpl implements Personinterface {
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Food> foods = new ArrayList<>();

    public PersonImpl(ArrayList<Person> people, ArrayList<Food> foods) {
        this.people = people;
        this.foods = foods;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "PersonImpl{" +
                "people=" + people +
                ", foods=" + foods +
                '}';
    }

    @Override
    public String createPerson(List<Person> people) {
        List<Person> client = new ArrayList<>();
        List<Person> waiter = new ArrayList<>();
        List<Person> chef = new ArrayList<>();
        for (Person person:people) {
            if(person.getStatus().equals(Status.CLIENT)){
                client.add(person);
            }
            if(person.getStatus().equals(Status.WAITER)){
                waiter.add(person);
            }
            if(person.getStatus().equals(Status.HEAD_CHEF)){
                chef.add(person);
            }
            System.out.println("Client:"+ client);
            System.out.println("Waiter"+ waiter);
            System.out.println("Head- Chef"+ chef);

        }
        return " Successful";
    }

    @Override
    public List<Person> getAllPerson(List<Person> people) {
        for (Person person: people) {
            return people;

        }
        return null;
    }

    @Override
    public List<Food> getAllFood() {
        for (Food food: foods) {
            return foods;

        }
        return null;
    }

    @Override
    public String sortByPrice() {
        return null;
    }
    public static Comparator<Food> sortByPrice = new Comparator<Food>() {
        @Override
        public int compare(Food o1, Food o2) {
            return o1.getPrice() - o2.getPrice();
        }

    };

    @Override
    public void findByname(List<Person> people, String name) {
        for (Person person :people) {
            if(person.getName().equals(name)){
                System.out.println(person.getName());
            }

        }

    }

    @Override
    public String payForFood() {
        Person clientperson = null;
        for (Person person: people) {
            if( person.getStatus().equals(Status.CLIENT) )clientperson = person;

        }double summa = 0;
        for (Food food :foods) {
            summa += food.getPrice();

        }
        double bankAccount = clientperson.getBankAccount()-summa;
        clientperson.setBankAccount(bankAccount);
        return null;
    }


}
