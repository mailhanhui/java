package past.test01.hh01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * @author GeekerHan
 * @create 2020 - 11 - 22 - 23:29
 */
public class Demo3 {
    public static void main(String[] args) {
        List list=new ArrayList();
        //添加元素
        list.add("小米");
        list.add("苹果");
        list.add("华为");
        System.out.println("元素个数："+list.size());
        System.out.println(list.toString());
        //删除元素
//        list.remove("苹果");
//        list.remove(0);
//        System.out.println(list.toString());
        //遍历（重点）
//        支持：增强for、迭代器iterator，因为有角标可以fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //不能像数组，用list[i]        
        }
        //增强for
        for (Object o : list) {
            System.out.println(o.toString());
        }
        //使用Collection迭代器
//        System.out.println("-------collection迭代器-----");
//        Iterator it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        //使用列表迭代器ListIterator（可逆向、方法更多）
        System.out.println("-------list迭代器-------");
        ListIterator lit=list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.nextIndex()+":"+lit.next());
        }
        System.out.println("-------list迭代器--逆向-----");
        while (lit.hasPrevious()){
            System.out.println(lit.previousIndex()+":"+lit.previous());
        }

    }
}
