package se.lexicon.negar;

import se.lexicon.negar.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setFirstName("Negar");
        person.setLastName("Madadi");
        person.setBirthDate(LocalDate.parse("1987-05-21"));

        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Birth date: " + person.getBirthDate());

    }
}
