package JavaBeginners10;

import java.util.Scanner;

public class DoWhileLess8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int value;
    do {
        System.out.println("Enter a number 5 ");
        value = scanner.nextInt();

    } while (value != 5);
    System.out.println("OK - you wright number 5 ");
    }
}
























/**
 * Scanner scanner = new Scanner(System.in);
 *         System.out.println("Введи 5 ");
 *         int value = scanner.nextInt();
 *         while (value != 5) {
 *             System.out.println("Введи 5");
 *             value = scanner.nextInt();
 *         }
 *         System.out.println("Вы ввели 5");
 *     }
 *   Scanner scanner = new Scanner(System.in);
 *         int value;
 *         do {
 *             System.out.println("Введи 5");
 *             value = scanner.nextInt();
 *         } while (value!=5);
 *         System.out.println("Вы ввели 5");
 *     }
 */