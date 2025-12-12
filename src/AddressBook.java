import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

    //Edit existing contact
    public void editContact(String name) {
        Scanner sc=new Scanner(System.in);

        for(Contact c:contacts) {
            if(c.getFirstName().equalsIgnoreCase(name)) {

                System.out.println("Editing contact for: " + name);

                System.out.print("Enter new Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("Enter new City: ");
                c.setCity(sc.nextLine());

                System.out.print("Enter new State: ");
                c.setState(sc.nextLine());

                System.out.print("Enter new Zip: ");
                c.setZip(sc.nextLine());

                System.out.print("Enter new Phone Number: ");
                c.setPhoneNumber(sc.nextLine());

                System.out.print("Enter new Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("\nContact updated successfully!\n");
                return;
            }
        }
        System.out.println("Contact not found with given first name.\n");
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