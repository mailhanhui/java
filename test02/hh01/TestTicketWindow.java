package test02.hh01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 22:39
 */
public class TestTicketWindow {
    public static void main(String[] args) {
        TicketWindow window1=new TicketWindow("1号窗口");
        TicketWindow window2=new TicketWindow("2号窗口");
        TicketWindow window3=new TicketWindow("3号窗口");
        TicketWindow window4=new TicketWindow("4号窗口");
        window1.start();
        window2.start();
        window3.start();
        window4.start();
    }
}
