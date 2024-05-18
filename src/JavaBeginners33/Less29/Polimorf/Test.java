package JavaBeginners33.Less29.Polimorf;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//
//        animal.eat();
//        dog.eat();
//        Animal animal = new Dog();
//        animal.eat();
//        animal.gaf();
//
//        Dog dog = new Dog();
//        dog.eat();
//        dog.gaf();
    //        Animal animal = new Dog();
    //        animal.eat();

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        te(animal);
        te(dog);
        te(cat);
    }

    public static void te(Animal animal) {
        animal.eat();
    }
}
