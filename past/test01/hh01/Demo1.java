package past.test01.hh01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 22 - 12:40
 * collection接口的使用
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合(不能直接new实例化，通过子类实现实例化)
        Collection collection=new ArrayList();

//        1）添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数"+collection.size());
        System.out.println(collection);

//        2）删除元素
//        collection.remove("榴莲");
//        System.out.println(collection);
//        collection.clear();
//        System.out.println("元素个数"+collection.size());

//        3）遍历元素【重点】
//        3.1 增强for
        System.out.println("---------使用增强for遍历----------");
        for (Object o : collection) {
            System.out.println(o);
        }
//        3.2 使用迭代器（专门遍历集合的接口/类）-----Iterator接口有三个方法：
//            hasNext();有没有下一个元素
//            next();获取下一个元素
//            remove();删除当前元素
        System.out.println("---------使用迭代器遍历----------");
        Iterator it = collection.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
//            collection.remove(s); 迭代器使用过程中，不允许对集合进行修改
//            it.remove();//但可以使用这种迭代器自身方法进行删除
        }
        System.out.println("元素个数："+collection.size());
//        4）判断
        System.out.println(collection.contains("西瓜"));
        System.out.println(collection.isEmpty());
    }
}
