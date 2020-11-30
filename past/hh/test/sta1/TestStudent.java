package past.hh.test.sta1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 14:27
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="张三";
        s1.age=18;
        Student s2 =new Student();
        s2.name="李四";
        s2.age=22;

        s1.show();
        s2.show();
        Student.count=2;
        System.out.println("以上共有"+Student.count+"名学生");
        System.out.println("======================================");
        Student.method1();
    }
}
