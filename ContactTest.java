package Mod3Milestone; // Declares the package.

import org.junit.jupiter.api.Test; // Import JUnit 5 Test annotation.
import static org.junit.jupiter.api.Assertions.*; // Import assertion methods.

public class ContactTest {

    @Test // Test creating a valid contact.
    public void testValidContactCreation() {
        Contact contact = new Contact("12345", "Duane", "Wegner", "1234567890", "123 Street Street");
        assertEquals("12345", contact.getContactID()); // Assert contact ID.
        assertEquals("Duane", contact.getFirstName()); // Assert first name.
        assertEquals("Wegner", contact.getLastName()); // Assert last name.
        assertEquals("1234567890", contact.getNumber()); // Assert number.
        assertEquals("123 Street Street", contact.getAddress()); // Assert address.
    }

    @Test // Test creating a contact with invalid ID.
    public void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> 
            new Contact(null, "Duane", "Wegner", "1234567890", "123 Street Street"));
    }

    @Test // Test creating a contact with invalid first name.
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> 
            new Contact("12345", "ThisIsAVeryLongFirstName", "Wegner", "1234567890", "123 Street Street"));
    }
}
