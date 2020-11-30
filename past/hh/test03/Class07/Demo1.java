package past.hh.test03.Class07;

import java.util.Date;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 21 - 14:46
 */
public class Demo1 {
    public static void main(String[] args) {
        Date date1=new Date();
        System.out.println(date1);
        System.out.println(date1.toLocaleString());
        //getTime() 获取毫秒为单位的时间（1970.1.1至今）
        Date date2=new Date(date1.getTime()-(60*60*24*1000));//减掉1天
        System.out.println(date2.toLocaleString());
        //方法 after before
        boolean b1=date1.before(date2);
        boolean b2=date1.after(date2);
        System.out.println(b1);
        System.out.println(b2);
        //compareTO() 比较大小，大为1，小为-1
        int d=date1.compareTo(date2);
        int d2=date2.compareTo(date1);
        System.out.println(d);
        System.out.println(d2);
        //equals();比较是否想等，返回boolean
    }
}
