package se.lexicon.negar.model;


import java.time.LocalDate;


//Person class is the blueprint for Person objects
public class Person {
    private String firstName;       //Field
    private String lastName;        //Field
    private LocalDate birthDate;    //Field

/*
    // Constructors
    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }*/


    /*
      Getters and Setters starts
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    /*
     Getters and Setters ends
     */
}
