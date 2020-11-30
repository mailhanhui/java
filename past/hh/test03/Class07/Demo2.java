package past.hh.test03.Class07;

import java.util.Calendar;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 21 - 17:13
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建对象
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);//返回长串数据
        System.out.println(calendar.toString());//返回长串数据
        System.out.println(calendar.getTime()); //返回：Sat Nov 21 19:53:42 CST 2020
        System.out.println(calendar.getTime().toLocaleString()); //返回：2020-11-21 19:53:42
        System.out.println(calendar.getTimeInMillis());//返回1970至今的毫秒值
        //获取时间信息
        int year=calendar.get(Calendar.YEAR);//注意括号内Calendar首字母大写
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);//最后部分也可以用"DATE"
        int hour=calendar.get(Calendar.HOUR_OF_DAY);//"HOUR"为12进制，"HOUR_OF_DAY"为24小时制
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
        //修改时间
        calendar.set(Calendar.DAY_OF_MONTH,26);//day设为26
        System.out.println(calendar.getTime().toLocaleString());
        //add方法，修改时间
        calendar.add(Calendar.DAY_OF_MONTH,-2);//day减少2（26-2=24）
        System.out.println(calendar.getTime().toLocaleString());
        //某字段范围
        int max=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//当前（Actual）月的day最大为多少（28-31）
        int min=calendar.getActualMinimum(Calendar.DAY_OF_MONTH);//当前月的day最小为多少（1）
        System.out.println(max+"+"+min);
        int max1=calendar.getMaximum(Calendar.DAY_OF_MONTH);//day字段最大值
        int min1=calendar.getMinimum(Calendar.DAY_OF_MONTH);//day字段最小值
        System.out.println(max1+"---"+min1);
    }
}
