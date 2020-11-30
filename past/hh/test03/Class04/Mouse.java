package past.hh.test03.Class04;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 9:33
 */
public class Mouse implements Usb{
    @Override
    public void service() {
        System.out.println("鼠标连接成功，开始工作...");
    }
}
