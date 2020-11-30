package past.test01.hh05;

import java.util.Scanner;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 15:29
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= 0;
        try {
            System.out.println("请输入第1个数字");
            int num1= input.nextInt();
            System.out.println("请输入第2个数字");
            int num2=input.nextInt();
            n = num1/num2;
//        } catch (Exception e) {//捕获异常
        } finally {
            System.out.println("释放资源");
        }
        System.out.println("计算结果："+n);
        System.out.println("程序执行完毕...");
    }
}
