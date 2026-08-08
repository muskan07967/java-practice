import java.io.*;
public class readdemo {
    public static void main(String[] args) {
        try {
          FileReader fr = new FileReader("student.txt");
          int ch;
          while((ch = fr.read()) != -1){
             System.out.println((char) ch);
          }
        
        fr.close();
      } catch (Exception e) {
      }  
    }
}
