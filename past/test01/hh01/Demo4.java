package past.test01.hh01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 23 - 9:16
 */
public class Demo4 {
    public static void main(String[] args) {
        List list=new ArrayList();
        //添加数字（自动装箱）
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.toString());
//        list.remove(20); //删除数字，不能直接输入数字，默认输入角标
//        要强转为obj,或者用new Integer(i)
        list.remove((Object)20);
        System.out.println(list.toString());
        list.remove(new Integer(30));
        System.out.println(list.toString());
    }
}
