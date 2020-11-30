package test02.hh03;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 15:58
 */
public class TestYield {
    public static void main(String[] args) {
        YieldThread y1=new YieldThread();
        YieldThread y2=new YieldThread();
        y1.start();
        y2.start();
    }
}
