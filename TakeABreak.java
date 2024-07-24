import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Asking the user if they want to take a break
        System.out.print("Do you want to take a break? (Enter yes or no): ");
        //Reading the user's input
        String input = scanner.nextLine();

        //Creating a while loop to continue until the user enters "yes"
        while (!input.equalsIgnoreCase("yes")) {
            System.out.print("Do you want to take a break? (Enter yes or no): ");
            input = scanner.nextLine();
        }

        System.out.println("Great! Take a break now.");
    }
}

