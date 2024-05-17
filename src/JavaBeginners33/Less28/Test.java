package JavaBeginners33.Less28;

import JavaBeginners33.Less28.Pack1.Person;

public class Test {
    protected int id;

    public static void main(String[] args) {
        // public, private, default( все что default доступно в пределах этого пакета), protected
//        Person person1 = new Person();
//        person1.name = "John Doe";
//        System.out.println( Person.CONSTANT);
        Person p2 = new Person();
        System.out.println(p2.name);
    }
//    private void technicalMethod(){}

}
