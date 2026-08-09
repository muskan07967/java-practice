public class Student{
    String name;
    int age;
    int rollno;

    Student(String name, int age,int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    void displayStudent(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Rollno :" + rollno);
    }
}