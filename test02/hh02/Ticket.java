package test02.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 13:17
 */
public class Ticket implements Runnable{
    private int ticket=100;
    //创建锁的对象(ticket不是一个对象)
    private Object obj=new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(ticket<=0){
                    System.out.println("票已卖光,"+Thread.currentThread().getName()+"停止售票");
                    break;
                }
                ticket--;
                System.out.println(Thread.currentThread().getName()+"卖出1张,还剩"+ticket+"张");
            }
        }
    }
}
