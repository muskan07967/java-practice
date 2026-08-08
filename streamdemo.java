import java.util.*;
public class streamdemo {
    public static void main(String args[]){
    Arrays.asList(5,10,15,20)
              .stream()
              .filter(n -> n > 10)
              .forEach(System.out::println);
           

    }
}
