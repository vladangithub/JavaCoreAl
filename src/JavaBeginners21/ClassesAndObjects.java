package JavaBeginners21;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 49;
//        System.out.println("Менья завут - " + person1.name + ", " + "Мну - " + person1.age);
//        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "BOOOBBBBB Doe";
        person2.age = 63;
//        System.out.println("Менья завут - " + person2.name + ", " + "Мну - " + person2.age);
//        person2.speak();
        person2.speak();
    }
}

class Person {
    //    У класса могут быть-
//    1, Данные (поля)
//    2, Действия, которые он может совершать(методы)
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("I'm " + name + " and " + age + " years old.");
        }}
    void sayHello () {
    System.out.println("Hello");
        }

}
