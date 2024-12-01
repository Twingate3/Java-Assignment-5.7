public class FutureTuitionCalculator {
    public static void main(String[] args) {
        // Initial tuition and annual increase rate
        double tuition = 10000; // Tuition this year
        double rate = 0.05;     // Annual increase rate (5%)
        double totalCost = 0;   // To store the total cost for 4 years after 10 years

        // Calculate tuition after 10 years
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate; // Increase tuition by 5% each year
        }

        // Store tuition after 10 years
        double tuitionInTenYears = tuition;

        // Calculate total cost for 4 years after the 10th year
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;       // Add tuition for the year to the total cost
            tuition += tuition * rate; // Increase tuition for the next year
        }

        // Display the results
        System.out.printf("Tuition in 10 years: $%.2f%n", tuitionInTenYears);
        System.out.printf("Total cost for 4 years after the 10th year: $%.2f%n", totalCost);
    }
}
