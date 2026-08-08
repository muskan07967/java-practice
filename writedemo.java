import java.io.FileWriter;
public class writedemo {
    public static void main(String args[])  {
      try {
          FileWriter fw = new FileWriter("student.txt");
        fw.write("muskan");
        fw.close();
      } catch (Exception e) {
      }  
    }
}
