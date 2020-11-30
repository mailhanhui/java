package past.hh.test03.Class06;

import java.util.Arrays;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 18 - 20:36
 */
public class Demo4 {
    public static void main(String[] args) {

        String contents="  THANKS我们-java-很-java-喜欢-小猪-pichi  ";
        System.out.println(contents);
        System.out.println(contents.trim());
        System.out.println(contents.toUpperCase());
        System.out.println(contents.toLowerCase());
        System.out.println(contents.endsWith("chi  "));
        System.out.println(contents.endsWith("chis"));
        System.out.println("-------------------");
        System.out.println(contents.replace("java","c++"));
        System.out.println(Arrays.toString(contents.split("-")));
        String[] arr=contents.split("-");
        System.out.println(arr.length);//输出数组长度
        System.out.println(arr);//字符串化的数组对象，包含哈希值
        System.out.println(Arrays.toString(arr));//数组转字符串后输出，逗号分隔
        for(String string:arr){
            System.out.println(string); //每行打印一个数组元素
        }

        System.out.println(contents.substring(6,12));
    }
}
