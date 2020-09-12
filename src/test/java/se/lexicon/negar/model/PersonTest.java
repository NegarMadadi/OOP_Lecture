package se.lexicon.negar.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person  testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new Person();
        testObject.setFirstName("Test");
        testObject.setLastName("Testsson");
        testObject.setBirthDate(LocalDate.parse("1987-10-20"));
    }


    @Test
    public void testObject_has_correct_fields() {
        assertEquals("Test", testObject.getFirstName());
        assertEquals("Testsson", testObject.getLastName());
        assertEquals(LocalDate.parse("1987-10-20"), testObject.getBirthDate());
    }
}
