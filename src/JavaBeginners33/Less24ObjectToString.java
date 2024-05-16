package JavaBeginners33;

public class Less24ObjectToString {
    public static void main(String[] args) {
        Sapiens h1 = new Sapiens("Doddd", 47);
        System.out.println(h1);
    }
}

class Sapiens {
    private String name;
    private int age;

    public Sapiens(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Sapiens [name=" + name + ", age=" + age + "]";
    }
}
