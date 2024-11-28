import java.util.Scanner;
class Customer {
    String[] customers = new String[5];
    public void inputCustomerData() {
        Scanner input = new Scanner(System.in);

        String fullName;
        String firstName = "";
        String lastName = "";
        for (int i = 0; i < customers.length; i++) {

            System.out.println("Enter first name of the Customer: " + (i + 1) + "");
            firstName = input.nextLine();
            while (firstName.trim().isEmpty()){
                System.out.println("First name cannot be empty, Please try again." + "\n");
                System.out.println("Enter first name of the Customer: " + (i + 1) + "");
                firstName = input.nextLine();
            }
            System.out.println("Enter the last name of the Customer: " + (i + 1) + "");
            lastName = input.nextLine();
            while (lastName.trim().isEmpty()) {
                System.out.println("Last name cannot be empty,Please try again" + "\n");
                System.out.println("Enter the last name: " + (i + 1) + "");
                lastName = input.nextLine();
            }
            customers[i] = firstName + " " + lastName;
        }
    }

    public void displayCustomerData () {
        System.out.println("Customer List:"); // Added heading
        for (String name : customers) {
            System.out.println(name);
        }
    }

}