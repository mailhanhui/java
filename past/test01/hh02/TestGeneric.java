package past.test01.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 23 - 21:47
 */
public class TestGeneric {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric=new MyGeneric<>();
        myGeneric.t="aaabbb";
        myGeneric.show("加油");
        String s=myGeneric.getT();
        System.out.println(s);

        MyGeneric<Integer> ge1=new MyGeneric<Integer>();
        ge1.t=20;
        ge1.show(200);
        System.out.println(ge1.getT());



        //通过实现类，调用泛型接口。实现类确定泛型类型，针对不同类型创建不同实现类。
        MyInterfaceImpl impl=new MyInterfaceImpl();
        impl.server("aaaaaaaa");

        //通过“泛型实现类”，调用泛型接口
        //使用方法1：实例化"泛型实现类"时，指定泛型类型，如Integer；
        MyInterfaceImpl2<Integer> impl1=new MyInterfaceImpl2<>();
        impl1.server(1000);

        //使用方法2：实例化"泛型实现类"时，不指定泛型类型，引用方法时指定；
        MyInterfaceImpl2 impl2=new MyInterfaceImpl2();
        impl2.server("bbbbbb");
        impl2.server(32456);
        Boolean b=new Boolean(true);
        impl2.server(b);


        //调用泛型方法
        System.out.println("----------------调用泛型方法----------------");
        MyGenericMethod m=new MyGenericMethod();
        m.show("hahahahahah");
        m.show(123);
        m.show(b);


    }
}
