import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter a number
        System.out.print("Enter a number: ");
        //Reading the user's input and converting the string to an integer
        int number = Integer.valueOf(scanner.nextLine());

        //Printing the multiplication table for the entered number
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

