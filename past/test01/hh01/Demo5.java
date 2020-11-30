package past.test01.hh01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 23 - 9:48
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        //添加元素
        Student s1=new Student("aaa",23);
        Student s2=new Student("bbb",18);
        Student s3=new Student("ccc",38);
        Student s4=new Student("ddd",29);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s1);
        System.out.println("元素个数："+arrayList.size());
        System.out.println(arrayList.toString());
        // 删除元素
        arrayList.remove(s4);
        //下面的方式，比较的是地址，不能删除。
        // 通过重写Student类的equals方法，改变比较属性，可以实现删除
        arrayList.remove(new Student("aaa",23));
        // 遍历
        System.out.println("-------------简单迭代器-------------");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Student s=(Student) iterator.next();//有时获取的对象需要强转类型后使用
            System.out.println(s.toString());
        }
        System.out.println("-------------列表迭代器-------------");
        ListIterator lit=arrayList.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.nextIndex()+":"+lit.next());
        }
        System.out.println("-------------列表迭代器--逆向-----------");
        while (lit.hasPrevious()){
            System.out.println(lit.previousIndex()+":"+ lit.previous());
        }
        // 判断
        System.out.println(arrayList.contains(s1));
        System.out.println(arrayList.isEmpty());
        // 查找
        System.out.println(arrayList.indexOf(s1));
        System.out.println(arrayList.lastIndexOf(s1));
    }
}
