package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 16:25
 */
public class TestJoin {
    public static void main(String[] args) {
        JoinThread j1=new JoinThread();
        j1.start();
        try {
            j1.join();//加入当前线程（main），阻塞当前线程，直到j1执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"=========="+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
