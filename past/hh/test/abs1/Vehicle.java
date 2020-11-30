package past.hh.test.abs1;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 14 - 12:49
 */
public abstract class Vehicle {
    private String brand;
    public Vehicle() {
    }
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public abstract void run();
}
