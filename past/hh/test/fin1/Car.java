package past.hh.test.fin1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 18:41
 */
public class Car {
    final String brand;
    String color;


    public Car() {
        brand = "宝马";
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public final void run(){
        System.out.println("car running");
    }
    public static void fly(){
        System.out.println("flying");
    }
}
