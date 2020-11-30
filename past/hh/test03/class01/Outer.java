package past.hh.test03.class01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 19:58
 */
public class Outer {
    //实例变量
    private String name="tom";
    private int age=26;
    //内部类
    class Inner{
        private String address="bejing";
        private String phone="13555558888";
        public void show(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
            System.out.println(phone);

        }
    }
}
