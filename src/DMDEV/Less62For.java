package DMDEV;

public class Less62For {
    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {

            if (value == 7) {
                continue;
//                break;
            }
            System.out.println(value);
        }
    }

    private static void forExample() {
        int i = 0;
        for (; ; ) {
            System.out.println(i);

        }
    }
}
