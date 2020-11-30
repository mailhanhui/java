package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 15:42
 */
public class SleepThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"......"+i);

            //捕获并处理异常
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
