import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        contacts=new ArrayList<>();
    }

    // Add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!\n");
    }

    // Display all contacts
    public void showContacts() {
        if(contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for(Contact c:contacts){
            System.out.println(c);
        }
    }
}