package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 15:46
 */
public class TestSleep {
    public static void main(String[] args) {
        SleepThread s1=new SleepThread();
        SleepThread s2=new SleepThread();
//        Thread t1=new Thread(s1,"1号线程");
//        t1.start();
//        Thread t2=new Thread(s2,"2号线程");
//        t2.start();
        s1.start();
    }
}
