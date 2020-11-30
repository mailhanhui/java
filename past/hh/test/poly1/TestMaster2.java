package past.hh.test.poly1;

import java.util.Scanner;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 0:14
 */
public class TestMaster2 {
    public static void main(String[] args) {
        System.out.println("-----------welcome----------");
        System.out.println("---------1.狗狗 2.鸟--------");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        Master master = new Master();
        master.name = "小明";
        Animal animal = master.buy(i);
        if(animal != null){
            System.out.println("购买成功");
            if(animal instanceof Dog){
                Dog dog = (Dog)animal;
                dog.eat();
            }else if(animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.eat();
            }
        }else{
            System.out.println("输入错误...");
        }

    }
}
