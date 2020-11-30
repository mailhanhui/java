package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 16:23
 */
public class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+"....."+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
