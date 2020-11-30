package past.test01.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 24 - 14:22
 */
public class MyInterfaceImpl2<T> implements MyInterface<T>{
    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}
