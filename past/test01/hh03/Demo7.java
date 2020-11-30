package past.test01.hh03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 27 - 0:08
 */
public class Demo7 {
    public static void main(String[] args) {
        //创建集合并指定比较规则
        TreeSet<String> treeSet=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();  //如果这样写，长度相同被认为是重复元素
                int n1=o1.length()-o2.length();
                int n2=o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });
        String s1="sinanld";
        String s2="adiekdhhls";
        String s3="enxsojiosdjd";
        String s4="isnng";
        String s5="safer";
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add("osngs");//也可以这样添加元素
        System.out.println(treeSet.toString());
    }
}
