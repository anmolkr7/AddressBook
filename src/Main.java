import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program on Master Branch");

        Scanner sc=new Scanner(System.in);
        AddressBook addressBook=new AddressBook();

        // Taking input from console for UC2
        System.out.println("\nEnter Contact Details:");

        System.out.print("First Name: ");
        String firstName=sc.nextLine();

        System.out.print("Last Name: ");
        String lastName=sc.nextLine();

        System.out.print("Address: ");
        String address=sc.nextLine();

        System.out.print("City: ");
        String city=sc.nextLine();

        System.out.print("State: ");
        String state=sc.nextLine();

        System.out.print("Zip: ");
        String zip=sc.nextLine();

        System.out.print("Phone Number: ");
        String phone=sc.nextLine();

        System.out.print("Email: ");
        String email=sc.nextLine();

        // Creating new Contact object
        Contact contact=new Contact(firstName,lastName,address,city,state,zip,phone,email);

        // Adding to AddressBook
        addressBook.addContact(contact);

        System.out.println("Your Address Book:");
        addressBook.showContacts();
    }
}
