package Mod3Milestone; // Declares the package.

import org.junit.jupiter.api.Test; // Import JUnit 5 Test annotation.
import static org.junit.jupiter.api.Assertions.*; // Import assertion methods.

public class ContactServiceTest {

    @Test // Test adding a contact.
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Duane", "Wegner", "1234567890", "123 Street Street");
        service.addContact(contact); // Add the contact.
        assertEquals(contact, service.getContact("12345")); // Assert the contact was added.
    }

    @Test // Test deleting a contact.
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Duane", "Wegner", "1234567890", "123 Street Street");
        service.addContact(contact); // Add the contact.
        service.deleteContact("12345"); // Delete the contact.
        assertNull(service.getContact("12345")); // Assert the contact was deleted.
    }

    @Test // Test updating a contact.
    public void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Duane", "Wegner", "1234567890", "123 Street Street");
        service.addContact(contact); // Add the contact.
        service.updateContact("12345", "Diane", "Wegner", "0987654321", "456 Street Avenue"); // Update the contact.
        Contact updatedContact = service.getContact("12345"); // Retrieve updated contact.
        assertEquals("Diane", updatedContact.getFirstName()); // Assert updated first name.
        assertEquals("0987654321", updatedContact.getNumber()); // Assert updated number.
    }
}
