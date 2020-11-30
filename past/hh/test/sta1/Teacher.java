package past.hh.test.sta1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 14:42
 */
public class Teacher {
    String name;
    int age;
    double salary;
    static int count=0;

    public void show(){
        System.out.println(name+"----"+age+"----"+salary);
    }

    public Teacher() {
        Teacher.count++;
    }
}
