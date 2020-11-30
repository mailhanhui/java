package past.test01.hh05;

import java.util.Scanner;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 15:03
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            operation();
        } catch (Exception e) {
            System.out.println("出现异常，main方法已经处理");
            e.printStackTrace();
        }
        System.out.println("调试结束...");
    }

    public static void operation(){
        System.out.println("-----operation-----");
        try {
            divide();
        } finally {
            System.out.println("上层方法释放资源");
        }
    }

    public static void divide(){
        System.out.println("----divide----");
        Scanner input=new Scanner(System.in);
        int n;
        try {
            System.out.println("请输入第1个数字");
            int num1= input.nextInt();
            System.out.println("请输入第2个数字");
            int num2=input.nextInt();
            n = num1/num2;
        } finally {
            System.out.println("方法释放资源");
        }
        System.out.println("计算结果："+n);
        System.out.println("程序执行完毕...");
    }

}
