/**
 * This class provides services to manage a collection of contacts.
 * Author: Duane Wegner
 * Date: November 13, 2024
 */

package Mod3Milestone; // Declares that this class belongs to the 'Mod3Milestone' package.

import java.util.HashMap; // Imports HashMap for storing contacts.
import java.util.Map; // Imports Map interface.

public class ContactService {
    private final Map<String, Contact> contacts; // A map to store contacts by their ID.

    // Constructor initializes the contacts map.
    public ContactService() {
        contacts = new HashMap<>();
    }

    // Adds a new contact to the service.
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) { // Check for duplicate contact ID.
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getContactID(), contact); // Add the contact to the map.
    }

    // Deletes a contact by ID.
    public void deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) { // Check if the contact ID exists.
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        contacts.remove(contactID); // Remove the contact from the map.
    }

    // Updates contact fields for a specific contact ID.
    public void updateContact(String contactID, String firstName, String lastName, String number, String address) {
        if (!contacts.containsKey(contactID)) { // Check if the contact ID exists.
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        Contact contact = contacts.get(contactID); // Retrieve the contact.
        contact.setFirstName(firstName); // Update first name.
        contact.setLastName(lastName); // Update last name.
        contact.setNumber(number); // Update number.
        contact.setAddress(address); // Update address.
    }

    // Retrieves a contact by ID.
    public Contact getContact(String contactID) {
        return contacts.get(contactID); // Return the contact object or null if not found.
    }
}
