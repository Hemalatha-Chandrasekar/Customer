import java.util.Scanner;
class Customer {
    String[] customerNames = new String[5];
    public void inputCustomerData() {
        Scanner input = new Scanner(System.in);

        String fullName;
        String firstName = "";
        String lastName = "";
        for (int i = 0; i < customerNames.length; i++) {

            System.out.println("Enter the first name: " + (i + 1) + "");
            firstName = input.nextLine();
            while (firstName.trim().isEmpty()){
                System.out.println("First name cannot be empty" + "\n");
                System.out.println("Enter the Frist name: " + (i + 1) + "");
                firstName = input.nextLine();
            }
            System.out.println("Enter the last name: " + (i + 1) + "");
            lastName = input.nextLine();
            while (lastName.trim().isEmpty()) {
                System.out.println("Last name cannot be empty" + "\n");
                System.out.println("Enter the last name: " + (i + 1) + "");
                lastName = input.nextLine();
            }
            customerNames[i] = firstName + " " + lastName;
        }
    }

    public void displayCustomerData () {
        for (String name : customerNames) {
            System.out.println(name);
        }
    }

}