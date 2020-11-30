package past.test01.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 24 - 14:59
 */
public class MyGenericMethod {
    //泛型方法
    public <T> T show(T t){
        System.out.println("泛型方法"+t);
        return t;
    }
}
