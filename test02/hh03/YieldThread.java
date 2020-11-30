package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 15:55
 */
public class YieldThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"......"+i);
            Thread.yield();
        }
    }
}
