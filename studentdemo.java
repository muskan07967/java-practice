class Student{

    private String name;

    void setName(String n){
        name = n;
    }

    String getName(){
        return name;
    }
}
public class studentdemo{
    public static void main(String args[]){
        Student s1 = new Student();

       s1.setName("Muskan");

      System.out.println(s1.getName());    
    }
}