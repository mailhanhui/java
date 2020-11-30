package past.test01.hh4;

import java.util.Objects;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 27 - 11:46
 */
//Student必须实现Comparable接口，并改写compareTo，否则不能作为TreeMap的key
public class Student implements Comparable<Student>{
    private String name;
    private int stuNo;

    public Student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ",stuNo=" + stuNo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return stuNo == student.stuNo &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuNo);
    }

    @Override
    public int compareTo(Student o) {
        int n2=this.stuNo-o.getStuNo();
        int n1=this.name.compareTo(o.name);
        return n1==0?n2:n1;
    }
}
