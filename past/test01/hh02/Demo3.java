package past.test01.hh02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 24 - 15:26
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建泛型ArrayList集合，指定类型为String
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbbb");
//        arrayList.add(12.3); //类型不对，无法添加
//        arrayList.add(Boolean.TRUE); //类型不对，无法添加
        for (String s : arrayList) { //不再是“Object o”，而是“String s”
            System.out.println(s);
        }

        //创建泛型ArrayList集合，指定类型为Student
        ArrayList<Student> arrayList2=new ArrayList<Student>();
        Student s1=new Student("aaa",18);
        Student s2=new Student("bbb",23);
        Student s3=new Student("ccc",29);
        arrayList2.add(s1);
        arrayList2.add(s2);
        arrayList2.add(s3);
//        arrayList2.add(12);  //提供的类型不对，不能添加

        //使用迭代器遍历
        Iterator<Student> it=arrayList2.iterator(); //迭代器也为泛型
        while (it.hasNext()){
            Student s=it.next(); //不需要再进行拆箱强转
            System.out.println(s.toString());
        }

//        arrayList2=arrayList; //不同类型不能相互赋值
    }
}
