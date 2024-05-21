package JavaBeginners33.L29Type;

public class TestType {
    public static void main(String[] args) {
//        byte x = 123;
//        short y = 456;
//        int z = 789;
//        long a = 789L;
//        char b = 'a';
//        float f = 3.14f;
//        double d = 3.14;
//        boolean c = true;
        float f = 123.2f;

        int a = 123;
        long l = a; // неявное приведение типов
        int x = (int) l;
        System.out.println(x);// явное приведение типов


    }
}
