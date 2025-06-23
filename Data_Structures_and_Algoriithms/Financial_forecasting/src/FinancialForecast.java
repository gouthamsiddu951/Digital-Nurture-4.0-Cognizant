package week1.Data_Structures_and_Algoriithms.Financial_forecasting.src;

public class FinancialForecast {

    // Recursive method
    public static double calculateFutureValueRecursive(int years, double currentValue, double growthRate) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValueRecursive(years - 1, currentValue, growthRate) * (1 + growthRate);
    }

    // Iterative method
    public static double calculateFutureValueIterative(int years, double currentValue, double growthRate) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        double initialValue = 10000; 
        double growthRate = 0.08;    
        int years = 5;

        // Recursive result
        double recursiveResult = calculateFutureValueRecursive(years, initialValue, growthRate);
        System.out.printf("Recursive : Future value after %d years: %.2f\n", years, recursiveResult);

        // Iterative result
        double iterativeResult = calculateFutureValueIterative(years, initialValue, growthRate);
        System.out.printf("Iterative : Future value after %d years: %.2f\n", years, iterativeResult);
    }
}
