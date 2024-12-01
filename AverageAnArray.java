import java.util.Scanner;

public class AverageAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter ten double values
        double[] doubleValues = new double[10];
        System.out.println("Enter ten double values:");
        for (int i = 0; i < 10; i++) {
            doubleValues[i] = input.nextDouble();
        }

        // Calculate and display the average
        double average = average(doubleValues);
        System.out.println("The average value is " + average);
    }

    // Method to calculate the average of an integer array
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
