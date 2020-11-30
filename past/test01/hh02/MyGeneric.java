package past.test01.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 23 - 21:40
 */
public class MyGeneric<T> {  //加“T”表示引用类型，可以写多个
    //使用泛型
    // 创建变量(不能实例化)
    T t;
    // 作为方法的参数
    public void show(T t){
        System.out.println(t);
    }
    //作为方法的返回值
    public T getT(){
        return t;
    }
}
