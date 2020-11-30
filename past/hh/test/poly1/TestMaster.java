package past.hh.test.poly1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 13 - 23:46
 */
public class TestMaster {
    public static void main(String[] args) {
        Master master1 = new Master();
        master1.name="小明";

        Animal d = new Dog();
        master1.feed(d);
        Animal b = new Bird();
        master1.feed(b);

    }
}
