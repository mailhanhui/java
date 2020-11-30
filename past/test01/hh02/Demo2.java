package past.test01.hh02;

import past.test01.hh01.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 23 - 19:44
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建
        LinkedList linkedList=new LinkedList();
        // 添加
        Student s1=new Student("aaa",23);
        Student s2=new Student("bbb",18);
        Student s3=new Student("ccc",38);
        Student s4=new Student("ddd",29);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        linkedList.add(s4);
        System.out.println(linkedList.toString());

        // 删除
//        linkedList.remove(3);
//        linkedList.remove(s3);
//        linkedList.clear();
        // 遍历
        System.out.println("--------for遍历--------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("--------增强for遍历--------");
        for (Object o : linkedList) {
            Student s=(Student)o;
            System.out.println(s.toString());
        }

        System.out.println("--------迭代器遍历--------");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            Student s=(Student)iterator.next();
            System.out.println(s.toString());
        }

        System.out.println("--------list迭代器遍历--------");
        ListIterator lit=linkedList.listIterator();
        while (lit.hasNext()){
            Student s=(Student)lit.next();
            System.out.println(s.toString());
        }
        // 判断
        System.out.println(linkedList.contains(s1));
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.indexOf(s2));
    }
}
