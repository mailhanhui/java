package past.hh.test03.Class03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 0:28
 */
public class Outer {
    private String name = "xiaoming";
    private int age = 18;
    public void show(){
        System.out.println("这是一个外部类方法...");
        String address="深圳";
        //局部内部类，不能加任何访问修饰符
        class Inner{
            private String phone="1254648789";
            private String email="aaa@bbb.com";
            private static final String aaaa="bbbbbb";//=======局部类不能包括静态成员，但final可以
            public void show2(){
                //访问外部类的属性
                System.out.println(Outer.this.name);
                System.out.println(Outer.this.age);
                //访问内部类的属性
                System.out.println(phone);
                System.out.println(email);
                //访问类外部的局部变量，变量自动默认为final常量
                System.out.println(address);
            }
        }
        //方法内部访问局部类属性及方法；
        Inner inner=new Inner();
        inner.show2();

    }
}
