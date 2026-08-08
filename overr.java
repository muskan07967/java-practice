class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }
}
public class overr{
    public static void main(String args){
        Dog d1 = new Dog();

d1.sound();
    }
}
