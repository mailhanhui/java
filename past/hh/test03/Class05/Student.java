package past.hh.test03.Class05;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 17 - 10:02
 */
public class Student {
    private String name;
    private int age;
    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age &&
//                Objects.equals(name, student.name);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }s

    public boolean equals(Object o) {
        //判断是否同一对象
        if(this==o){
            return true;
        }
        //判断是否为空
        if(o==null){
            return false;
        }
        //判断两个引用是否同一类型
//        if(this.getClass()==o.getClass()){}
        if(o instanceof Student){
            //强制类型转换
            Student s=(Student) o;
            //比较属性
            return this.name.equals(s.name) && this.age == s.age;
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name+"被回收了");
    }
}