package past.hh.test03.class01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 20:04
 */
public class TestOuter {
    public static void main(String[] args) {
        //创建内部类对象，需要先创建外部类对象
        Outer outer1 = new Outer();
        Outer.Inner inner1 = outer1.new Inner();
        //可以合二为一创建对象
        Outer.Inner inner2 = new Outer().new Inner();
        inner1.show();
    }
}
