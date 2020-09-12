package se.lexicon.negar.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person  testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new Person("Test", "Testsson", LocalDate.parse("1987-10-20"));
    }


    @Test
    public void testObject_has_correct_fields() {
        assertEquals("Test", testObject.getFirstName());
        assertEquals("Testsson", testObject.getLastName());
        assertEquals(LocalDate.parse("1987-10-20"), testObject.getBirthDate());
        assertEquals(0, testObject.getOwnedPets().length);
    }

    @Test
    public void given_pet_addPet_should_successfully_add_pet() {
        Pet pet = new Pet("Fluffy", "Tiger");
        int expectedLength = 1;

        testObject.addPet(pet);

        assertEquals(expectedLength, testObject.getOwnedPets().length );
    }
}
