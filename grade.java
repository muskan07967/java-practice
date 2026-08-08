import java.util.*;
public class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=90){
            System.out.println("grade A");
        }
        else if(n>=75&&n<90){
            System.out.println("grade b");
        }
        else if(n>=50 && n<75){
            System.out.println("grade c");
        }
            else{
                 System.out.println("fail");
            }

        }
    } 
    

