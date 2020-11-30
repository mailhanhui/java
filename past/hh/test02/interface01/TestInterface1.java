package past.hh.test02.interface01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 15 - 20:36
 */
public class TestInterface1 {
    public static void main(String[] args) {
        //用父类myInterface1创建一个Impl子类对象a，多态
        MyInterface1 a = new Impl() ;
        a.method1();
        System.out.println(MyInterface1.NAME);
    }
}
