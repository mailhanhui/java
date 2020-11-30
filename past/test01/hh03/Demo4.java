package past.test01.hh03;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 26 - 17:15
 */
public class Demo4 {
    public static void main(String[] args) {
        //创建
        TreeSet<String> treeSet=new TreeSet<>();
        String s1="张三";
        String s3="李四";
        String s2="王五";
        // 添加
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s1); //不能添加
        System.out.println(treeSet.toString());
        treeSet.add(new String("张三")); //不能添加
        treeSet.add(new String("赵六"));
        System.out.println(treeSet.toString());
        // 删除
        // 遍历
        System.out.println("--------增强for---------");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println("-------------迭代器-------------");
        Iterator<String> it=treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        // 判断
        System.out.println(treeSet.contains("abc"));
    }
}
