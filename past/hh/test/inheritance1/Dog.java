package past.hh.test.inheritance1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 12 - 18:44
 */
public class Dog extends Animal{
    String furColor;

    @Override
    public void eat() {
        System.out.println("狗狗大口吃...");
    }

    public void run(){
        System.out.println("run...");
    }
}
