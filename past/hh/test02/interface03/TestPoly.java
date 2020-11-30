package past.hh.test02.interface03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 16:54
 */
public class TestPoly {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        Animal a = mydog;
        Runnable r = mydog;
        Swimmable s = mydog;
    }
}
