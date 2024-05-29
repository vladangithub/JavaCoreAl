package DMDEV.ArrayEx;

/*
2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или 17, и печатающую его
 */

public class Ex2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        Ex1.printArray(values);

    }
    public static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
