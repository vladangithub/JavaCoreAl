package JavaBeginners33;

public class Less25Nasledovanie {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.gaff();
        dog.showName();
    }
}


