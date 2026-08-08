public class genericmethod {
    public static <T> void printData(T data){
        System.out.println(data);
    }
    public static void main(String args[]){
        printData("muskan");
        printData(100);
        printData(true);

    }
    
}
