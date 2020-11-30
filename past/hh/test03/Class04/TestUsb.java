package past.hh.test03.Class04;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 9:32
 */
public class TestUsb {
    public static void main(String[] args) {
        //使用实现类创建对象
//        Usb usb=new Mouse();
//        usb.service();
        //局部内部类
        class Fan implements Usb{
            @Override
            public void service() {
                System.out.println("风扇连接成功，开始转...");
            }
        }
        //使用局部内部类创建对象
//        Usb usb=new Fan();
//        usb.service();
        //匿名内部类(相当于创建了一个局部内部类对象)
        Usb usb =new Usb() {
            @Override
            public void service() {
                System.out.println("连接成功，开始工作了...");
            }
        };
        usb.service();
    }
}
