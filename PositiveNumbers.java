import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Setting the initial value of the number as 1
        int number = 1;

        //Creating a while loop to continue until the user enters 0
        while (number != 0) {
            System.out.print("Enter a number (Enter 0 to stop): ");
            number = Integer.valueOf(scanner.nextLine());

            //Checking if the number is positive or negative
            if (number < 0) {
                System.out.println("Your number must be positive.");
            } else if (number > 0) {
                System.out.println("You entered: " + number);
            }
        }

        System.out.println("Exiting the program.");
    }
}

