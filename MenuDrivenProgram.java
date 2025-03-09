import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Displaying the menu
            System.out.println("\nMenu:");
            System.out.println("1. Greet User");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            // Handling user choice
            if (choice == 1) {
                System.out.println("Hello! Welcome!");
            } 
            else if (choice == 2) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " is an Even number.");
                } else {
                    System.out.println(num + " is an Odd number.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                break; // Exiting the loop
            } 
            else {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
        scanner.close();
    }
}
