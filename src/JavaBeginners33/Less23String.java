package JavaBeginners33;

public class Less23String {
    public static void main(String[] args) {
//        String x = "hello";
//        x = x.toUpperCase();
//        System.out.println(x);
//        String str1 = "Hello";
//        String str2 = " my";
//        String str3 = " friend";
//        String strAll = str1 + str2 + str3;
//
//        System.out.println(strAll);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
