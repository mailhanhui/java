package past.hh.test.poly1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 0:53
 */
public class TestConvert {
    public static void main(String[] args) {
        Animal a = new Bird();

        if(a instanceof Dog){
            Dog dog = (Dog)a;
            dog.eat();
        }else if(a instanceof Bird){
            Bird bird = (Bird)a;
            bird.eat();
        }
    }
}
