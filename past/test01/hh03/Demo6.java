package past.test01.hh03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 26 - 23:41
 */
public class Demo6 {
    public static void main(String[] args) {
        //创建一个集合，并指定比较规则
        TreeSet<Person> persons=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1=o1.getAge()-o2.getAge();
                int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });



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
