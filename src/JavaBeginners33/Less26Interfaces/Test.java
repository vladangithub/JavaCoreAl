package JavaBeginners33.Less26Interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(1);
//        Person person1 = new Person("Dodddd");
//        animal1.showInfo();
//        person1.showInfo();
//        Info info1 = new Animal(1);
//        Info info2 = new Person("Bobbbbb");
//        info1.showInfo();
//        info2.showInfo();
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Zhuzhikkk");
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
