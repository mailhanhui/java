package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 16:41
 */
public class TestPriority {
    public static void main(String[] args) {
        PriorityThread p1=new PriorityThread();
        p1.setName("p1");
        PriorityThread p2=new PriorityThread();
        p2.setName("p2");
        PriorityThread p3=new PriorityThread();
        p3.setName("p3");
        p1.setPriority(1);
        p3.setPriority(10);
        p1.start();
        p2.start();
        p3.start();
    }
}
