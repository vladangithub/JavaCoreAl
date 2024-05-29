package DMDEV.ArrayEx;

/*
 * Определить сумму элементов целлочисленного массива, расположенных между минимальным и максимальным значением*/

public class Ex4 {
    public static void main(String[] args) {
        //              0  1  2  3  4  5  6   7
        int[] values = {0, 2, 5, 5, 6, 4, 10, 3};
        System.out.println("maxIndex: " + findMaxIndex(values));
        System.out.println("minIndex: " + findMinIndex(values));
        System.out.println("summ of element: " + calcSum(values));
    }

    public static int calcSum(int[] values) {
        int minIndex = findMinIndex(values);
        int maxIndex = findMaxIndex(values);

        if (minIndex>maxIndex){
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }


    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue = values[minIndex];

        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
