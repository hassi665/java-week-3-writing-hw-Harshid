import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:"); //Scanner declaration for reading input form console

        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);

        scanner.close();                                // closing the scanner object
    }

    public static void isItOddOrEvenNumber(int number) {            // Checking the number is even or odd
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";      //ternary operator is used
        System.out.println("The "+ number + " is " + evenOrOdd + " number");
    }
}
