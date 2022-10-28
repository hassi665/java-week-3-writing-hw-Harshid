/**
 * Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;
public class Programme_6_OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);      //Scanner declaration for reading input form console
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven = new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        scanner.close();
    }


    public String isItEvenOrOddNumber(int number)       //Checking the odd or even
    {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}