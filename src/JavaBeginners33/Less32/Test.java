package JavaBeginners33.Less32;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();

//        Dog dog = new Dog();
//        // Upcasting - Восходящее преобразование
//        Animal animal = dog;
//
//
//        // Downcasting - Нисходящее преобразование
//        Dog dog2 = (Dog) animal;
//        dog2.gafff();
        Animal a = new Animal();
        Dog dog = (Dog)a;
        dog.gafff();


    }
}
