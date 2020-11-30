package past.test01.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 24 - 14:06
 */
public class MyInterfaceImpl implements MyInterface<String>{ //需要输入泛型类型
    @Override
    public String server(String t) {
        System.out.println(t);
        return t;
    }
}
