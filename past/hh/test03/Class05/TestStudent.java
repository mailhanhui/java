package past.hh.test03.Class05;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 10:02
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student("aaa",20);
        Student s2=new Student("bbb",30);
        //判断s1 s2是不是同一类型
        Class class1=s1.getClass();
        Class class2=s2.getClass();
        if(class1==(class2)){
            System.out.println("类型一致...");
        }else{
            System.out.println("类型不一致...");
        }

        //hashCode方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Student s3=s2;
        System.out.println(s3.hashCode());

        //toString方法
        System.out.println("-----------------------");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        //判断两个对象是否想等
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        //判断对象内容是否相同
        Student s4=new Student("xiaoli",23);
        Student s5=new Student("xiaoli",23);
        System.out.println(s4.equals(s5));

    }
}
