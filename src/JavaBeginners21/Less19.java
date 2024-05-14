package JavaBeginners21;

public class Less19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Booobbb";
        human1.age = 46;
        human1.getInfo();
        Human human2 = new Human();
        human2.name = "Doodd";
        human2.age = 54;
        human2.getInfo();
    }

}

class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " , " + age);
    }
}
