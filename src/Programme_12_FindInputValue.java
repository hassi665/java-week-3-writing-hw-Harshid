/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           //Scanner declaration for reading input form console
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();           //Object creation
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);

        scanner.close();
    }

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {      // Find the input value is ALPHABET, DIGIT and SYMBOL
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}