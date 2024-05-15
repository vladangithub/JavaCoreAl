package JavaBeginners21;

public class Leson20 {
    public static void main(String[] args) {
        Student student1 = new Student();

    }
}

class Student {
    private String name;
    private int age;
//    construct

    public Student() {
//        System.out.println("Hello in first constructor ");
        this.name = "any Name";
        this.age = 0;
    }
    public Student(String name) {
        System.out.println("Hello in second constructor ");
        this.name = name;
    }
    public Student(String name, int age) {
        System.out.println("Hello in third constructor ");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
