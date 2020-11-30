package past.hh.test.poly1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 13 - 23:35
 */
public class Master {
    String name;

    public void feed(Animal animal){
        System.out.println(this.name + "喂食");
        animal.eat();
    }

    public Animal buy(int type){
        Animal animal=null;
        if(type == 1){
            animal = new Dog();
        }else if(type == 2){
            animal = new Bird();
        }
        return animal;
    }
}
