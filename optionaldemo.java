import java.util.*;
public class optionaldemo {
    public static void main(String args[]){
        Optional<String> name = Optional.of("muskan");
        System.out.println(name.get());
        //  Optional<String> name = Optional.empty();
        // System.out.println(name.isPresent());
        //  Optional<String> name = Optional.empty();
        // System.out.println(name.orElse("guest"));
    }
}
