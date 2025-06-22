public class FinancialForecast {

    public static double forecastValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static double forecastValueIterative(double presentValue, double rate, int years) {
        double result = presentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; 
        double rate = 0.1; 
        int years = 5;

        double futureValueRecursive = forecastValue(presentValue, rate, years);
        double futureValueIterative = forecastValueIterative(presentValue, rate, years);

        System.out.printf("Recursive prediction after %d years: %.2f%n", years, futureValueRecursive);
        System.out.printf("Iterative prediction after %d years: %.2f%n", years, futureValueIterative);
    }
}
