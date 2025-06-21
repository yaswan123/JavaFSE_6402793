package WEEK1.DataStructuresAndAlgorithms.Exercise7_FinancialForecasting.codes;
import java.util.Scanner;
public class Forecast {
    public static double FutureValueRecursive(double pri, double rate, int years) {
        if (years == 0) {
            return pri;
        }
        return FutureValueRecursive(pri * (1 + rate), rate, years - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial investment amount: ");
        double pri = sc.nextDouble();
        System.out.print("Enter annual growth rate (as decimal, from , 0.05 for 5%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        double futureValue = FutureValueRecursive(pri, rate, years);
        System.out.printf("Predicted future value after %d years: %.2f%n", years, futureValue);
        sc.close();
    }
}
