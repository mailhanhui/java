package past.hh.test.abs1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 13:06
 */
public class Master {
    private String name;

    public Master() {
    }

    public Master(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goHome(Vehicle vehicle){
        System.out.println(this.name + "下班回家了...");
        vehicle.run();
    }
}
