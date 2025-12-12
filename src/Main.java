public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program on Master Branch");
        Contact contact=new Contact("Anmol", "Ojha", "MG Road",
                "SomeCity",
                "SomeState",
                "123456",
                "9876543210",
                "anmol@example.com"
        );
        System.out.println(contact);
    }
}
