package se.lexicon.negar.model;


import java.time.LocalDate;
import java.util.Arrays;


//Person class is the blueprint for Person objects
public class Person {
    private String firstName;       //Field
    private String lastName;        //Field
    private LocalDate birthDate;    //Field
    private Pet[] ownedPets;        //Field

    public Person(String firstName, String lastName, LocalDate birthDate, Pet[] ownedPets) {
        setFirstName(firstName);
      setLastName(lastName);
      setBirthDate(birthDate);
      setOwnedPets(ownedPets);
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
       this(firstName, lastName, birthDate, new Pet[0]);
    }

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

    public Pet[] getOwnedPets() {
        return ownedPets;
    }

    public void setOwnedPets(Pet[] ownedPets) {
        this.ownedPets = ownedPets;
    }


    public void addPet(Pet pet){
        Pet[] newArray = Arrays.copyOf(ownedPets, ownedPets.length+1);
        newArray[newArray.length-1] = pet;
        setOwnedPets(newArray);
    }

    /*
     Getters and Setters ends
     */


}
