package DMDEV;

/* написать факториал введенного целого числа
 * */

public class Recursion {
    public static void main(String[] args) {
//          1 * 2 * 3 * 4 * 5 * 6 = 6!
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
