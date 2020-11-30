package past.test01.hh03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 26 - 0:20
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        //添加数据
        set.add("小米");
        set.add("苹果");
        set.add("华为");

        System.out.println(set.size());
        System.out.println(set.toString());//打印出来的，和添加顺序不一致
        //删除数据
//        set.remove("小米");
//        set.clear();

        //遍历操作【重点】
        // 3.1增强for
        for (String s : set) {
            System.out.println(s);
        }
        // 3.2迭代器
        Iterator<String> it = set.iterator();
        System.out.println("----------迭代器----------");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //判断
        System.out.println(set.contains("华为"));
        System.out.println(set.isEmpty());
    }
}
