package past.test01.hh03;

import java.util.TreeSet;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 26 - 17:30
 */
public class Demo5 {
    public static void main(String[] args) {
        TreeSet<Person> persons= new TreeSet<>();
        Person p1=new Person("刘德华",56);
        Person p2=new Person("张学友",61);
        Person p3=new Person("周润发",36);
        Person p4=new Person("周润发",36);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p1); //重复，无法添加
        persons.add(p4);//重复，无法添加
        persons.add(new Person("周润发",36));//重复，无法添加
        System.out.println(persons.toString());




    }
}
