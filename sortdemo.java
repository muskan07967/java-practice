//comparable
import java.util.*;
public class sortdemo {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(30);
        Collections.sort(list);
        System.out.println(list);
    }
}
