package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 18:17
 */
public class TestDeamon {
    public static void main(String[] args) {
        DeamonThread d1=new DeamonThread();
        // 设置为守护线程,要在运行之前设置
        d1.setDaemon(true);

        d1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"==="+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
