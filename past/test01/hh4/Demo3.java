package past.test01.hh4;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 27 - 14:04
 */
public class Demo3 {
    public static void main(String[] args) {
        //Student必须实现Comparable接口，并改写compareTo()，否则不能作为TreeMap的key
        TreeMap<Student,String> treeMap= new TreeMap<Student,String>();
        Student s1=new Student("张三",8901);
        Student s2=new Student("李四",8902);
        Student s3=new Student("王五",8903);
        treeMap.put(s1,"山东");
        treeMap.put(s2,"湖南");
        treeMap.put(s3,"安徽");
        //compareTo改写了，认为重复。不能添加，但改写了值为“江苏”
        treeMap.put(new Student("张三",8901),"江苏");
        System.out.println(treeMap.toString());

        // 删除
//        treeMap.remove(s1);
        // 用new也可以删除，因为修改了compareTo()方法
//        treeMap.remove(new Student("李四",8902));
        System.out.println(treeMap.toString());
        // 遍历
        System.out.println("--------增强for--------");
        for (Student student : treeMap.keySet()) {
            System.out.println(student+"---"+treeMap.get(student));
        }

        System.out.println("--------entrySet--------");
        for (Map.Entry<Student,String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }

        //判断
        System.out.println(treeMap.containsKey(s1));
        //修改了compareTo()方法，也会返回true
        System.out.println(treeMap.containsKey(new Student("李四",8902)));
    }
}
