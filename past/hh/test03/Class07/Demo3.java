package past.hh.test03.Class07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 21 - 20:54
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{ //throws Exception：暂时忽略解析报错
        //创建SimpleDateFormat对象，确定格式，以调用格式化与解析方法
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //创建date
        Date date=new Date();
        //格式化date，日期转成字符串
        String str=sdf.format(date);
        System.out.println(str);//返回：2020年11月22日 11:24:18
        //解析：字符串解析成日期
        Date date2=sdf.parse("1984年06月27日 23:57:45");
        System.out.println(date2);//返回：Wed Jun 27 23:57:45 CST 1984
    }
}
