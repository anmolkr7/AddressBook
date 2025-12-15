import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program on Master Branch");

        Scanner sc=new Scanner(System.in);
        AddressBook addressBook=new AddressBook();

        boolean isRunning=true;

        while(isRunning){
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. View Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice=Integer.parseInt(sc.nextLine());

            switch(choice) {

                case 1:
                    // UC5: Ability to add multiple contacts
                    boolean addMore=true;

                    while(addMore) {
                        // Taking input from console for UC2
                        System.out.println("\nEnter Contact Details:");

                        System.out.print("First Name: ");
                        String firstName = sc.nextLine();

                        System.out.print("Last Name: ");
                        String lastName = sc.nextLine();

                        System.out.print("Address: ");
                        String address = sc.nextLine();

                        System.out.print("City: ");
                        String city = sc.nextLine();

                        System.out.print("State: ");
                        String state = sc.nextLine();

                        System.out.print("Zip: ");
                        String zip = sc.nextLine();

                        System.out.print("Phone Number: ");
                        String phone = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        // Creating new Contact object
                        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);

                        // Adding to AddressBook
                        addressBook.addContact(contact);

                        //Asking whether to continue adding contacts or to exit
                        System.out.print("Do you want to add another contact? (yes/no): ");
                        String option=sc.nextLine();

                        if(!option.equalsIgnoreCase("yes")) {
                            addMore=false;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter first name of contact to edit: ");
                    String name=sc.nextLine();
                    addressBook.editContact(name);
                    break;

                case 3:
                    addressBook.showContacts();
                    break;

                case 4:
                    System.out.print("Enter first name of contact to delete: ");
                    String deleteName=sc.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 5:
                    isRunning=false;
                    break;

                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}
