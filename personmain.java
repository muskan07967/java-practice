class Person {

    void display() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {
}
public class personmain{
    public static void main(String[] args) {
        Student s1 = new Student();

         s1.display();
    }
}