// java program to handle different types of exceptions
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // ArithmeticException (Divide by zero)
            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();

            
            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();
            int result = num / denom; // May throw ArithmeticException
            System.out.println("Result: " + result);

            
            System.out.print("Enter a number as a string: ");
            String str = scanner.next();
            int parsedNum = Integer.parseInt(str); // May throw NumberFormatException
            System.out.println("Parsed Number: " + parsedNum);

            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            System.out.println("Array Element: " + arr[index]); // May throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

