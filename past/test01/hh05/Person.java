package past.test01.hh05;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 17:13
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        if (sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else{
            throw new SexException("性别参数格式异常");
        }

        if (age>0&&age<=120){
            this.age = age;
        }else{
            throw new AgeException("年龄参数格式异常");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else{
            //抛出异常
            throw new SexException("输入性别异常");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<=120){
            this.age = age;
        }else{
            //抛出异常
            throw new AgeException("年龄不符合要求");
        }
    }

    @Override
    public String toString() {
        return "Person [name="+name+",sex="+sex+",age="+age+"]";
    }
}
