package DMDEV.ArrayEx;
/*
Написать программу которая печатает массив сначала в обычном порядке, потоом в обратном.
 */

public class Ex1 {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8,9,10};
        printArray(values);
        printArrayForeach(values);
        printArrayReverse(values);

    }

    public  static void printArrayReverse (int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayForeach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
            
        }
        System.out.println();
    }
}
