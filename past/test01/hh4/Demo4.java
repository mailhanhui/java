package past.test01.hh4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 27 - 23:25
 */
public class Demo4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(12);
        list.add(30);
        list.add(6);
        //sort排序
        System.out.println("排序前"+list.toString());
        Collections.sort(list);
        System.out.println("排序后"+list.toString());

        //binarySearch：二分查找
        int i1=Collections.binarySearch(list,13);
        System.out.println(i1);

        //copy 复制
        List<Integer> dest=new ArrayList<>();
        //list和dest的size不同，不能copy，需要先在目标集合中添加元素。再拷贝覆盖。
        for (int i=0;i<list.size();i++){
            dest.add(0);
        }
        Collections.copy(dest,list);
        System.out.println(dest.toString());

        //reverse 翻转顺序
        Collections.reverse(dest);
        System.out.println(dest.toString());

        //shuffle 随机乱序
        Collections.shuffle(list);
        System.out.println(list.toString());

        //补充:list转成数组
//        Integer[] arr=new Integer[list.size()];
//        list.toArray(arr);
//        上面两行可以合并为下面一行
        Integer[] arr=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        //数组转成集合
        String[] names= {"张三","李四","王五","赵六","孙二"};
        //生成的list2是一个受限集合，不能添加或删除元素
        List<String> list2=Arrays.asList(names);
        System.out.println(list2.toString());

//        int[] nums={100,200,300,400,500};
//        基本类型数组转集合时，需要修改为包装类
        Integer[] nums={100,200,300,400,500};
        List<Integer> list3=Arrays.asList(nums);
        System.out.println(list3);

    }
}
