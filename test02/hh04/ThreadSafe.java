package test02.hh04;

import java.util.Arrays;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 30 - 23:40
 */
public class ThreadSafe {
    private static int index=0;
    public static void main(String[] args) throws InterruptedException {
        //创建数组
        String[] s=new String[5];
        //创建两个操作（Runnable子类）
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                //上同步锁
                synchronized (s){
                    s[index]="hello";
                    index ++;
                }
            }
        };
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                //上同步锁
                synchronized (s){
                    s[index]="world";
                    index ++;
                }
            }
        };
        //创建两个线程并运行
        Thread a=new Thread(runnable1,"A");
        Thread b=new Thread(runnable2,"B");
        a.start();
        b.start();
        //目的是保证A、B两个线程都执行完毕后，才进入后面主线程的打印；
        a.join();//加入主线程
        b.join();

        System.out.println(Arrays.toString(s));
    }
}
