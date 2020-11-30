package past.test01.hh03;

import java.util.HashSet;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 26 - 0:52
 */
public class Demo3 {
    public static void main(String[] args) {
        HashSet<Person> persons=new HashSet<>();
        //添加数据
        Person p1=new Person("刘德华",56);
        Person p2=new Person("周润发",61);
        Person p3=new Person("张学友",36);
        Person p4=new Person("周润发",61);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        //如何实现不能加进属性相同的对象？
        //可以通过重写hashcode()和equals()方法来实现。(在person类重写)：

        persons.add(new Person("刘德华",56));

        System.out.println(persons.toString());
        //删除
//        persons.remove(p1);
        //重写hashcode()和equals()方法后，下面的方式也可以删除对象
//        persons.remove(new Person("张学友",36));

        //遍历
        System.out.println("---------增强for遍历---------");
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        //判断
    }
}
