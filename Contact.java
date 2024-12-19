/**
 * This class represents a Contact object with fields for contact ID,
 * first name, last name, number, and address.
 * Author: Duane Wegner
 * Date: November 13, 2024
 */

package Mod3Milestone; // Declares that this class belongs to the 'Mod3Milestone' package.

public class Contact {
    private final String contactID; // Unique ID for the contact, cannot be changed once set.
    private String firstName; // First name of the contact, updatable.
    private String lastName; // Last name of the contact, updatable.
    private String number; // Number of the contact, updatable.
    private String address; // Address of the contact, updatable.

    /**
     * Constructor to initialize a Contact object.
     */
    public Contact(String contactID, String firstName, String lastName, String number, String address) {
        // Validate the contact ID: must not be null and max length 10 characters.
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        // Validate the first name: must not be null and max length 10 characters.
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        // Validate the last name: must not be null and max length 10 characters.
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        // Validate the number: must not be null, must have exactly 10 digits.
        if (number == null || number.length() != 10 || !number.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid number");
        }
        // Validate the address: must not be null and max length 30 characters.
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.contactID = contactID; // Set the contact ID (immutable).
        this.firstName = firstName; // Set the first name.
        this.lastName = lastName; // Set the last name.
        this.number = number; // Set the number.
        this.address = address; // Set the address.
    }

    // Getter for contactID (cannot be changed).
    public String getContactID() {
        return contactID;
    }

    // Getter and setter for firstName.
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    // Getter and setter for lastName.
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    // Getter and setter for number.
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        if (number == null || number.length() != 10 || !number.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid number");
        }
        this.number = number;
    }

    // Getter and setter for address.
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
