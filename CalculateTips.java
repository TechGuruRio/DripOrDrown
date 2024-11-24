import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();
        
        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = scanner.nextDouble();
        
        double gratuity = subtotal * (gratuityRate / 100);
        
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity);
        System.out.println("The total is $" + total);
        
        scanner.close();
    }
}
