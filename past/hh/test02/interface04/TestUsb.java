package past.hh.test02.interface04;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 16 - 19:09
 */
public class TestUsb {
    public static void main(String[] args) {
        Computer ibm = new Computer();
        Usb mouse = new Umouse();
        Usb fan = new Ufan();
        Usb pan = new Upan();

        //把usb设备与电脑进行连接
        ibm.usb1=mouse;
        ibm.usb2=fan;
        ibm.usb3=pan;
        ibm.run();
    }
}
