package JavaBeginners21;

public class Leson20 {
    public static void main(String[] args) {
//        Student h1 = new Student("GooGG", 141);
//        h1.setName("Tooomm");
        Student h1 = new Student("Cash", 54);
        Student h2 = new Student("CLash", 47);
        h1.printNumOfStudents();
        h2.printNumOfStudents();
        Student h3 = new Student("Bobbbbb", 55);
        h1.printNumOfStudents();
        h2.printNumOfStudents();
        h3.printNumOfStudents();
//        Student.description = "Nice";
//        h1.getAllFields();
//        h2.getAllFields();
//        Student.description = "Bad";
//        h1.getAllFields();
//        h2.getAllFields();

        // использование static
//        System.out.println(Math.pow(2, 4));
//        System.out.println(Math.PI);
    }
}

class Student {
    private String name;
    private int age;
    private static int countStudents;

//    public static String description;
    // использование static
//    public static final double PI = 3.141592653589793;
//    construct

    //    public Student() {
////        System.out.println("Hello in first constructor ");
//        this.name = "any Name";
//        this.age = 0;
//    }
//    public Student(String name) {
//        System.out.println("Hello in second constructor ");
//        this.name = name;
//    }
    public Student(String name, int age) {
//        System.out.println("Hello in third constructor ");
        this.name = name;
        this.age = age;
        countStudents++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public static void getDescription() {
//        System.out.println(description);
//    }

    //    выводим все поля
//    public void getAllFields() {
////        System.out.println(name + ", " + age + ", " + description);
//        System.out.println(name + " " + age);
//    }

//    public static void printAllFields(){
//        System.out.println(name );
//    }
    public void printNumOfStudents() {
        System.out.println("Number of students: " + countStudents);
    }

}
