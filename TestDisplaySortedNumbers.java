import java.util.Scanner;

public class TestDisplaySortedNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        // Invoke the method to display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);
    }

    // Method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // Sort the numbers using a simple sorting algorithm
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display the sorted numbers
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
