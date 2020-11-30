package test02.hh01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 12:25
 */
// 创建Runnable接口实现类，并改写run()方法
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            //本类不是Thread子类，所以不能用this.getName()、this.getID()
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
