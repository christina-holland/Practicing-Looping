import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Asking the user to enter a number
        System.out.print("Enter a number (Enter 5 to stop): ");
        //Reading the user's input and converting the string to an integer
        int number = Integer.valueOf(scanner.nextLine());

        //Creating a while loop to continue until the user enters 5
        while (number != 5) {
            System.out.print("Enter a number (Enter 5 to stop): ");
            number = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Exiting the program.");
    }
}

