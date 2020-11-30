package past.hh.test02.interface04;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 18:59
 */
public class Upan implements Usb{
    @Override
    public void service() {
        System.out.println("u盘连接电脑成功，开始工作...");
    }
}
