// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их

// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
import java.util.*;

public class Person {

    String name;
    String surname;
    int age;
    String sex;
    int id;
    String phoneNumbers;
    String profession;

    public Person(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Anna", "Denisova", 111);
        p1.age = 88;
        p1.sex = "female";
        p1.profession = "vet";
        p1.phoneNumbers = "15632, 85987";

        Person p2 = new Person("Marina", "Pavlova", 159);
        p2.age = 11;
        p2.sex = "female";
        p2.profession = "blogger";
        p2.phoneNumbers = "33333, 11588";

        Person p3 = new Person("Peter", "Vaskin", 335);
        p3.age = 15;
        p3.sex = "male";
        p3.profession = "singer";
        p3.phoneNumbers = "12555, 32666";

        Person p4 = new Person("Vanya", "Petrov", 771);
        p4.age = 26;
        p4.sex = "male";
        p4.profession = "photographer";
        p4.phoneNumbers = "56998";

        Person p5 = new Person("Anna", "Denisova", 111);
        p5.age = 88;
        p5.sex = "female";
        p5.profession = "actress";
        p5.phoneNumbers = "44444";

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(i + 1 + "." + " " + persons.get(i));
        }

        // System.out.println(persons);

        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.name + "'s hashcode is: " + p2.hashCode());
        System.out.println();
        doesWhat(p3);
        System.out.println();

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).age >= 20) {
                System.out.println(persons.get(i).name + " is 20 or older");
            } 
        }
    }

    public String toString() {
        return String.format("%s %s, %d", name, surname, age);
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }
        if (!(p instanceof Person)) {
            return false;
        }
        Person anotherPerson = (Person) p;
        return name.equals(anotherPerson.name) && surname.equals(anotherPerson.surname) && id == anotherPerson.id;
    }

    public static void doesWhat(Person who) {
        switch (who.profession) {
            case ("vet"):
                System.out.println(who.name + " cures animals");
                break;
            case ("blogger"):
                System.out.println(who.name + " publishes posts");
                break;
            case ("singer"):
                System.out.println(who.name + " sings songs");
                break;
            case ("photographer"):
                System.out.println(who.name + " takes pictures");
                break;
            case ("actress"):
                System.out.println(who.name + " plays in movies");
                break;
            default:
                System.out.println(who.name + " does who knows what");
                break;
        }
    }
}