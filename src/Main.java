import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program on Master Branch");

        Scanner sc=new Scanner(System.in);

        //Defining HashTable to store multiple Address Books
        Hashtable<String,AddressBook> addressBookTable=new Hashtable<>();

        boolean isRunning=true;

        while(isRunning){
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. View Contacts");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice=Integer.parseInt(sc.nextLine());

            switch(choice) {

                case 1:
                    System.out.println("Enter Address Book Name:");
                    String bookName=sc.nextLine();

                    if(addressBookTable.containsKey(bookName)){
                        System.out.println("Address Book already exists");
                    }
                    else{
                        addressBookTable.put(bookName,new AddressBook());
                    }
                    break;

                case 2:
                    System.out.print("Enter Address Book Name: ");
                    bookName=sc.nextLine();

                    if(addressBookTable.containsKey(bookName)) {

                        AddressBook addressBook=addressBookTable.get(bookName);

                        // UC5: Ability to add multiple contacts to a selected AddressBook
                        boolean addMore=true;

                        while(addMore) {
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

                            // Adding to selected AddressBook
                            addressBook.addContact(contact);

                            System.out.print("Do you want to add another contact? (yes/no): ");
                            String option=sc.nextLine();

                            if(!option.equalsIgnoreCase("yes")) {
                                addMore=false;
                            }
                        }

                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the Address Book Name");
                    bookName= sc.nextLine();

                    if(addressBookTable.containsKey(bookName)){
                        System.out.println("Enter the first name of contact to edit");
                        String name=sc.nextLine();
                        addressBookTable.get(bookName).editContact(name);
                    }
                    else {
                        System.out.println("Address Book not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Address Book Name");
                    bookName=sc.nextLine();

                    if(addressBookTable.containsKey(bookName)){
                        addressBookTable.get(bookName).showContacts();
                    }
                    else{
                        System.out.println("Address Book not found");
                    }
                    break;

                case 5:
                    System.out.println("Enter the Address Book Name");
                    bookName=sc.nextLine();

                    if(addressBookTable.containsKey(bookName)){
                        System.out.println("Enter the first name of contact to delete");
                        String deleteName=sc.nextLine();
                        addressBookTable.get(bookName).deleteContact(deleteName);
                    }
                    else {
                        System.out.println("Address Book not found");
                    }
                    break;

                case 6:
                    isRunning=false;
                    break;

                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}
