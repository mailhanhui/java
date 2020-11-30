package past.hh.test02.interface04;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 19:01
 */
public class Ufan implements Usb{
    @Override
    public void service() {
        System.out.println("风扇连接成功，开始工作...");
    }
}
