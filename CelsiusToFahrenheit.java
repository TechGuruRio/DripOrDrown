import java.util.Scanner;
 public class CelsiusToFahrenheit {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
          System.out.print("Enter a temperature in Celsius: ");
           double celsius = scanner.nextDouble();
           
           double fahrenheit = (9.0 / 5) * celsius + 32; 
           
           System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit."); 
           
           scanner.close(); 
        }
    }
