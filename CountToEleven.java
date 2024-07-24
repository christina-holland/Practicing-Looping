import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Asking the user to enter a number less than 11
        System.out.print("Enter a number less than 11: ");
        //Reading the user's input and converting the string to an integer
        int number = Integer.valueOf(scanner.nextLine());

        //Validating the input to ensure the number entered is less than 11
        while (number >= 11) {
            System.out.print("Invalid input. Enter a number less than 11: ");
            number = Integer.valueOf(scanner.nextLine());
        }

        //Printing numbers from the user input up to 11
        while (number <= 11) {
            System.out.println(number);
            number++;
        }
    }
}

