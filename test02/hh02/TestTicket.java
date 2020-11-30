package test02.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 13:24
 */
public class TestTicket {
    public static void main(String[] args) {
        //总共100张票，所以只创建一个Ticket对象
        Ticket ticket=new Ticket();
        //创建四个线程，使用同一个Ticket对象
        Thread th1=new Thread(ticket,"1号窗口");
        Thread th2=new Thread(ticket,"2号窗口");
        Thread th3=new Thread(ticket,"3号窗口");
        Thread th4=new Thread(ticket,"4号窗口");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
