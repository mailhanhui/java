package past.hh.test.abs1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 13:00
 */
public class Bike extends Vehicle{
    public Bike() {
    }
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("坐着" + super.getBrand() + "牌自行车慢悠悠...");
    }
}
