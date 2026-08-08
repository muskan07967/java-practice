// import java.io.File;

// public class filecreate {

//     public static void main(String[] args) {

//         File myFile = new File("student.txt");

//         System.out.println(myFile.getName());
//     }
// }
import java.io.File;

public class filecreate {

    public static void main(String[] args) {

        File myFile = new File("student.txt");

        System.out.println(myFile.exists());
    }
}