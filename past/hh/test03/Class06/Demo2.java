package past.hh.test03.Class06;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 17:14
 */
public class Demo2 {
    public static void main(String[] args) {
        //值相同，但是都是新建对象，地址不同，所以false
        Integer integer1=new Integer(100);
        Integer integer2=new Integer(100);
        System.out.println(integer1==integer2);

        //-128~127之间的256个整数已经在整数缓冲区内创建对象，直接从缓冲区引用
        // 不用新建，返回值true
        Integer integer3=100;
        Integer integer4=100;
        System.out.println(integer3==integer4);

        //不在256个预先创建的对象之内，所以需要新建对象。返回值false
        Integer integer5=200;
        Integer integer6=200;
        System.out.println(integer5==integer6);
    }
}
