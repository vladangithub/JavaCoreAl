/*
 *В 1626 индейцы продали Манхеттен за 24$.
 * Написать программу, которая высчитывает сумму, получившуюся бы
 * в текущем году, если бы они положили деньги в банк под 5 процентов годовых.
 */


package DMDEV.ForWhileWork;

public class SaleManh {
    public static void main(String[] args) {
        double sourceSum = 24;
        double result = sum(sourceSum);
        System.out.println(result);

    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2024; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
}
