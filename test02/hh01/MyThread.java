package test02.hh01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 21:33
 */
//创建子类，继承thread类，并重写run方法
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 获取线程的ID和名称
            System.out.println("线程ID"+this.getId()+this.getName()+i);
        }
    }
}
