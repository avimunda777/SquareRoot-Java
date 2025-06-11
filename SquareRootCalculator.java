                        // SquareRootCalculator.java
import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find the square root: ");
        double number = scanner.nextDouble();
        
        if (number < 0) {
            System.out.println("Square root of negative numbers is not real.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);
        }
        
        scanner.close();
    }
}

