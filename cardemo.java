//  class car{
//     String name;
//     int price;
//  }
//  public class cardemo{
//     public static void main(String args[]){
//         car c1 = new car();
//         c1.name = "bmw";
//         c1.price = 5000000;
//         System.out.println(c1.name);
//         System.out.println(c1.price);

//     }
//  }
class Car {

    Car() {
        System.out.println("Car Created");
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car c1 = new Car();

    }
}