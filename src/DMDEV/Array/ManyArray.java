package DMDEV.Array;

public class ManyArray {
    public static void main(String[] args) {
//        extracted();
        int[][] values = new int[3][];
        values[0] = new int[5];
        values[1] = new int[2];
        values[2] = new int[1];
        printArray(values);
    }

    private static void extracted() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray(values2);
    }

    private static void printArray(int[][] values2) {
        for (int i = 0; i < values2.length; i++) {
            int[] ints = values2[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
