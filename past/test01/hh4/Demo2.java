package past.test01.hh4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 27 - 11:44
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建集合
        HashMap<Student,String> students=new HashMap<Student,String>();
        // 添加元素
        Student s1=new Student("张三",8901);
        Student s2=new Student("李四",8902);
        Student s3=new Student("王五",8903);
        Student s4=new Student("王五",8903);
        students.put(s1,"上海");
        students.put(s2,"南京");
        students.put(s3,"北京");
        students.put(s4,"北京");//可以重写hashcode和equals方法，避免重复（s4和s3是同一个学生）
        students.put(s1,"深圳");//键相同，覆盖原值
        System.out.println(students.toString());

        // 删除
        // 遍历
        System.out.println("-----------keySet遍历---------");
        for (Student key : students.keySet()) {
            System.out.println(key.toString()+"----"+students.get(key));
        }

        System.out.println("-----------entrySet遍历---------");
        for (Map.Entry<Student,String> entry : students.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        System.out.println("----------迭代器遍历--------");
        Set<Student> st1=students.keySet();
        Iterator<Student> it2=st1.iterator();
        while (it2.hasNext()){
            Student s0=it2.next();
            System.out.println(s0.toString()+"---"+students.get(s0).toString());
        }

        // 判断
        System.out.println(students.containsKey(s1));
        System.out.println(students.containsKey(new Student("王五",8903))); //重写过equals方法，所以返回true
        System.out.println(students.isEmpty());
    }
}
