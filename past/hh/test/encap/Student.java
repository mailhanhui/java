package past.hh.test.encap;

public class Student {
    private String name;
    private int age;
    private String sex;
    private double score;
    public void  sayHi(){
    System.out.println("大家好，我是:"+ name + "；年龄：" + age + "；性别：" + sex +"；成绩" + score);
    }

    public void setAge(int age){
        if(age > 0 && age < 120){
            this.age = age;
        }else{
            this.age = 0;
        }
    }
    public int getAge(){
        return this.age;
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
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
