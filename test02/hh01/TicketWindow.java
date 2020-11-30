package test02.hh01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 22:25
 */
public class TicketWindow extends Thread{
    int ticketCount=100;
    public TicketWindow() {
    }

    public TicketWindow(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            if(ticketCount<=0){
                System.out.println(Thread.currentThread().getName()+"票已卖光.......");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"卖了1张票，还剩"+ticketCount+"张");
            ticketCount--;
        }
    }
}
