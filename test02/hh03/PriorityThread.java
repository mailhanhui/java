package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 16:40
 */
public class PriorityThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"......"+i);
        }
    }
}
