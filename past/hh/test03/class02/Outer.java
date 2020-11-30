package past.hh.test03.class02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 0:03
 */
public class Outer {
    private String name = "xiaoming";
    private int age = 18;
    private static int aa=12;
    //静态内部类，和外部类级别相同
    static class Inner{
        private String address="上海";
        private String phone="110";
        //静态成员
        private  static int count=1000;
        public void show(){
            //调用外部类的实例属性和方法，需实例化外部类对象；
            Outer outer=new Outer();
            System.out.println(outer.name);
            System.out.println(outer.age);
            //可直接调用静态内部类的属性和方法；
            System.out.println(address);
            System.out.println(count);
            //可直接调用外部类的静态属性
            System.out.println(aa);
        }
    }
}
