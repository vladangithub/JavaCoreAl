package JavaBeginners21;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = " ";
//        person1.age = -121;
//        System.out.println("Менья завут - " + person1.name + ", " + "Мну - " + person1.age);
        person1.setName("");
        person1.setAge(-6);
        System.out.println("Выводим значение в маин методе- " + person1.getName());
        System.out.println("Выводим значение в маин методе- " + person1.getAge());

        person1.speak();

        String s1 = "Bobbie";

        person1.setNameAndAge("Koka", 46);
        person1.sayHello();

        Person person2 = new Person();
//        person2.name = "BOOOBBBBB Doe";
        person2.setNameAndAge(s1, 47);
//        person2.age = 63;
        person1.speak();
//        System.out.println("Менья завут - " + person2.name + ", " + "Мну - " + person2.age);
//        person2.speak();
        person2.speak();
//        int year1 = person1.calcYearToPen();
//        int year2 = person2.calcYearToPen();
//        System.out.println("Первому челу до пенсии: " + year1);
//        System.out.println("Второму челу до пенсии: " + year2);
    }
}

class Person {
    //    У класса могут быть-
//    1, Данные (поля)
//    2, Действия, которые он может совершать(методы)
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("возраст должен быть больше 0");
        } else {
        age = userAge;}
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String userName, int userage) {
        name = userName;
        age = userage;
    }

    int calcYearToPen() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("I'm " + name + " and " + age + " years old.");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }

}
