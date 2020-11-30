package past.hh.test.abs1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 12:55
 */
public class Car extends Vehicle{
    public Car() {
    }
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void run() {
        System.out.println("坐着" + super.getBrand()+"牌小汽车飞驰而去...");
    }
}
