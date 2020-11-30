package past.hh.test03.Class06;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 13:17
 */
public class Demo1 {
    public static void main(String[] args) {
        int num=10;
        //装箱：基本类型转为引用类型
        int num1=18;
        //创建一个integer对象
        Integer integer1=new Integer(num1);
        Integer integer2=Integer.valueOf(num1);
        //拆箱:引用类型转为基本类型
        Integer integer3=new Integer(100);
        int num2=integer3.intValue();

        //java1.8以后，提供自动装箱与拆箱
        int age=30;
        Integer integer4=age;
        Integer integer5=40;
        int age2=integer5;

        //基本类型转为字符串
        int n1=100;
        String s1=n1+"";
        String s2=Integer.toString(n1);
        String s3=Integer.toString(n1,16);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("-----------------------------------");


        //字符串转为基本类型
        String str="150";
        int n2=Integer.parseInt(str);
        System.out.println(n2);

        //字符串转为boolean基本类型


    }
}
