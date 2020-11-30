package past.test01.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 26 - 0:53
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int n1=this.getName().compareTo(o.getName());
        int n2=this.getAge()-o.getAge();
        return n1==0?n2:n1; //如果n1=0返回n2，否则返回n1。
        // 返回值如果是0，会当做是同一个元素
    }
}