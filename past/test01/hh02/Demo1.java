package past.test01.hh02;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 22 - 12:40
 */
public class Demo1 {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add("草莓");
        vector.add("芒果");
        vector.add("西瓜");
        System.out.println(vector.toString());
        //遍历
        Enumeration en= vector.elements();
        while(en.hasMoreElements()){
            Object o=(String)en.nextElement();
            System.out.println(o);
        }
        //判断
        Boolean b1=vector.contains("西瓜");
        System.out.println(vector.isEmpty());
    }
}
