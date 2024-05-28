package DMDEV.ForWhileWork;

/*
Написать программу, определяющую, является ли введенное число простым,те
делится без остатка только на 1 и само себя
 */

public class StrangeNumber {
    public static void main(String[] args) {
        int value = 23;
        boolean result = isSimple(value);
        System.out.println(result);

    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }

        }

        return result;
    }
}
