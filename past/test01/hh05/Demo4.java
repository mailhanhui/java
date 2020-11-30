package past.test01.hh05;

import java.util.Scanner;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 16:54
 */
public class Demo4 {
    public static void main(String[] args) throws Exception{
        divide();
    }
    public static void divide() throws Exception{
        System.out.println("----divide----");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第1个数字");
        int num1= input.nextInt();
        System.out.println("请输入第2个数字");
        int num2=input.nextInt();
        int n = num1/num2;
        System.out.println("计算结果："+n);
        System.out.println("程序执行完毕...");
    }
}
