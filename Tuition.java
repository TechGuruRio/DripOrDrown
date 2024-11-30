public class Tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double annualIncreaseRate = 0.05;

        // Calculate tuition in ten years
        for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + annualIncreaseRate);
        }
        
        System.out.printf("Tuition in ten years: $%.2f%n", tuition);

        // Calculate total cost of four years' worth of tuition after the tenth year
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition = tuition * (1 + annualIncreaseRate);
        }

        System.out.printf("Total cost for four years' worth of tuition after the tenth year: $%.2f%n", totalCost);
    }
}
