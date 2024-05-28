//  Есть число - посчитать сумму чисел данного числа

package DMDEV.ForWhileWork;

public class SumNumber {
    public static void main(String[] args) {
        int value = 12340;
        int result = sum(value);
        System.out.println(result);

        int result1 = sumFor(value);
        System.out.println(result);

    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }


        return result;
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }

}
