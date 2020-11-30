package test02.hh01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 12:29
 */
public class TestRunnable {
    public static void main(String[] args) {
/*
        //MyRunnable不是Thread子类，实例化的对象不是线程对象。但可供线程执行（实现了Runnable接口）；
        MyRunnable runnable=new MyRunnable();
        //创建实现Runnable功能（接口）的线程对象(实现类对象作为实参，带参构建）
        Thread t1=new Thread(runnable,"一号线程");
        Thread t2=new Thread(runnable,"2号");
        //运行线程（子线程）
        t1.start();
        t2.start();
*/
        // 通过匿名内部类创建Runnable对象
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    //本类不是Thread子类，所以不能用this.getName()、this.getID()
                    System.out.println(Thread.currentThread().getName()+"---"+i);
                }
            }
        };

        // 创建线程对象
        Thread t3=new Thread(runnable,"线程123");

        // 运行线程
        t3.start();

        //主线程同步执行
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"================="+i);
        }
    }
}
