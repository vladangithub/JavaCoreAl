package DMDEV;

public class Less12While {
    public static void main(String[] args) {
//        whileExample();
        int value = 0;
        do {
            System.out.println(value);
            value = value + 1;
        }while (value < 10);
    }

    private static void whileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }
}
