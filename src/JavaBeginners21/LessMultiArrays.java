package JavaBeginners21;

public class LessMultiArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] matr = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {4, 5, 6, 7, 8, 9, 10},
                {0, 8, 9}
        };
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
