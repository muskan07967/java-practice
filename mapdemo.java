import java.util.*;
public class mapdemo {
    public static void main(String args[]){
    Arrays.asList(5,10,15,20)
              .stream()
              .map(n -> n * n )
              .forEach(System.out::println);
           

    }
}

