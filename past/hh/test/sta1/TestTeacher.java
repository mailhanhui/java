package past.hh.test.sta1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 14:45
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="张老师";
        t1.age=35;
        t1.salary=8965.5;

        Teacher t2=new Teacher();
        t2.name="王老师";
        t2.age=55;
        t2.salary=10210;

        Teacher t3=new Teacher();
        t3.name="罗老师";
        t3.age=48;
        t3.salary=1965;

        System.out.println("对象创建次数："+Teacher.count);
    }
}
