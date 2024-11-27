import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of the hexagon
        System.out.print("Enter the side length of the hexagon: ");
        double side = input.nextDouble();

        // Calculate the area of the hexagon
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        // Display the area
        System.out.printf("The area of the hexagon is: %.2f\n", area);

        input.close();
    }
}
