public class sumDigits {
    public static void main(String[] args) {
        // Test cases to verify the sumDigits method
        System.out.println("Sum of digits in 23: " + sumDigits(23)); // Expected output: 5
        System.out.println("Sum of digits in 69: " + sumDigits(69)); // Expected output: 15
        System.out.println("Sum of digits in 0: " + sumDigits(0)); // Expected output: 0
        System.out.println("Sum of digits in -69: " + sumDigits(-69)); // Expected output: 15
    }

    // Method to compute sum of digits in an integer
    public static int sumDigits(long n) {
        int sum = 0; // Initialize sum to 0
        n = Math.abs(n); 

        while (n != 0) {
            int digit = (int)(n % 10);
            sum += digit; // Add the digit to the sum
            n /= 10; 
        }

        return sum; // Return the computed sum of digits
    }
}
