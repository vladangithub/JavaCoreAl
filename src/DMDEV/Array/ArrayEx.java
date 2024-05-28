package DMDEV.Array;

public class ArrayEx {
    public static void main(String[] args) {
//        test();
        int[] values = new int[10];
//        System.out.println(values[4]);
        values[3] = 115;
        values[7] = 128;

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);

        }
    }

    private static void test() {
        int value = 10;
        int[] values = {1,5,6,8,9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
