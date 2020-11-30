package past.hh.test02.interface04;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 19:03
 */
public class Umouse implements Usb{
    @Override
    public void service() {
        System.out.println("鼠标连接成功，开始工作");
    }
}
