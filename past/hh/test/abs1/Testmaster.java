package past.hh.test.abs1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 13:15
 */
public class Testmaster {
    public static void main(String[] args) {
        Master xiaoming = new Master("小明");
        Master xiaoli = new Master("小丽");
        Vehicle car = new Car("宝马");
        Vehicle bike = new Bike("凤凰");
        xiaoli.goHome(car);
        xiaoming.goHome(bike);
    }
}
