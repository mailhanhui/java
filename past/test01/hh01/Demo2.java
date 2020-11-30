package past.test01.hh01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 22 - 18:12
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        Student s1=new Student("小明",22);
        Student s2=new Student("张三",18);
        Student s3=new Student("王五",31);
        //添加数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s3);
        System.out.println(collection.size());
        System.out.println(collection.toString());
        //删除数据
//        collection.remove(s1);
        collection.remove(s3);
        System.out.println(collection.size());
        System.out.println(collection.toString());
        //清空数据
//        collection.clear(); //只是清空了集合，集合中存的是地址
//        System.out.println(s2.toString()); //对象本身还存在
        //增强for遍历
        for (Object o : collection) {
            Student s=(Student)o;
            System.out.println(s.toString());
        }
        //迭代器遍历
        Iterator it =collection.iterator();
        while (it.hasNext()){
            Student s=(Student)it.next();
            System.out.println(s.toString());
        }
        //判断
        System.out.println(collection.contains(new Student("张三",18)));
        System.out.println(collection.contains(s3));
        System.out.println(collection.isEmpty());
    }
}
