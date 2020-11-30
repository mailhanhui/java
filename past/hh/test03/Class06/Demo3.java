package past.hh.test03.Class06;

import java.util.Arrays;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 18 - 1:26
 */
public class Demo3 {
    public static void main(String[] args) {
        String name="hello"; //存储在字符串池
        //name和name2，指向同一个字符串池中的同一空间，实现共享
        name = "zhangsan"; //不改变hello，重新开辟空间存储zhangsan，重新指向
        String name2="zhangsan";
        String str=new String("java");//堆和字符串池中各创建一个对象，指向堆中对象
        String str2=new String("java");
        System.out.println(str==str2);//两个指向的是堆中的不同对象，地址不同，所以结果false
        System.out.println(str.equals(str2));//比较的是字面值，所以形同
        System.out.println("-------------------------------------");
        //length();返回字符串的长度
        //charAt(int index);返回某个位置的字符
        //contains(String str);判断是否包含某个字符串

        String content="java不是世界上最好的编程语言是不是";
        System.out.println(content.length());
        System.out.println(content.charAt(6));//角标从0开始
        System.out.println(content.contains("世界上"));
        System.out.println(content.contains("世界之上"));
        System.out.println("--------------------");
        //toCharArray();返回字符串对应的数组
        //indexOf();返回首个下标
        //lastIndexOf();返回最后一个下标
        System.out.println(content.toCharArray());
        System.out.println(Arrays.toString(content.toCharArray()));
        System.out.println("------------------------------");
        System.out.println(content.indexOf("世界"));
        System.out.println(content.indexOf("不是"));
        System.out.println(content.indexOf("不是",6));
        System.out.println(content.lastIndexOf("不是"));
        System.out.println("----------------------");
        System.out.println(content.indexOf("不是吗"));
        System.out.println(content.lastIndexOf("不是吗"));

    }
}
