package past.hh.test.fin1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 18:50
 */
public class TestCar {
    public static void main(String[] args) {
        SmallCar smallCar = new SmallCar();
        smallCar.run();
        Car c2 = new Car("宝马");
        System.out.println(smallCar.brand);
        System.out.println(c2.brand);
    }
}
