package JavaBeginners10;

import java.util.Scanner;

public class SwitchLess10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст ");
        String age = scanner.nextLine();
        switch (age) {
            case "ноль":
                System.out.println("ты родился");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("кто ты чудовище?");
        }
    }
}
