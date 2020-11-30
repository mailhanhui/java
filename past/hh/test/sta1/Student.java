package past.hh.test.sta1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 14:24
 */
public class Student {
    String name;
    int age;
    static int count;

    public void show(){
        System.out.println(name +"----"+age);
    }

    public static void method1(){
        System.out.println("第1个静态方法");
        method2();
    }
    public static void method2(){

        System.out.println("第2个静态方法");
    }

}
