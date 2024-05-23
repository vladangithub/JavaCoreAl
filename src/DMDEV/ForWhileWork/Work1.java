/* написать факториал введенного целого числа
 * */

package DMDEV.ForWhileWork;

public class Work1 {
    // 1*2*3*4*5 = 5!
    public static void main(String[] args) {
        int value = 5;
        int result = factorial(value);
        System.out.println(result);

        int res = factorialWhile(value);
        System.out.println(res);

    }

    public static  int factorialWhile(int value) {
        int res = 1;
        int i = 1;
        while (i <= value) {
            res *= i;
            i++;
        }
        return res;
    }

    public static int factorial(int value) {
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
