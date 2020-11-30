package past.hh.test.inheritance1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 12 - 19:00
 */
public class Test01 {
    public static void main(String[] args) {
        Dog wangcai = new Dog();

        wangcai.age = 3;
        wangcai.breed = "哈士奇";
        wangcai.furColor = "白色";
        wangcai.sex = "female";

        wangcai.eat();
        wangcai.sleep();
        wangcai.run();
    }
}
