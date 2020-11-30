package test02.hh01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 21:36
 */
// 启动新线程
public class TestMyThread {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        // ()方法，开启新线程（子线程）
        // 修改线程名称
        m1.setName("子线程m1------");
        m1.start();// 如果m1.run()，不会开始新线程，只是调用普通方法；

        MyThread m2=new MyThread("??????我是m2进程??????");
        m2.start();// 又启动一个新线程

        for (int i = 0; i < 50; i++) {
            System.out.println("主线程======"+i);
        }
    }
}
