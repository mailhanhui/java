package past.hh.test03.Class06;

import java.util.Arrays;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 20 - 18:30
 */
public class Demo5 {

    public static void main(String[] args) {
        String str="this is a text";
        String[] arr=str.split(" ");
        System.out.println(arr);   //隐式调用toString();所以与下行完全相同
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        System.out.println(str.replace("text","practice"));
        System.out.println(str.replace("text","easy text"));
        for (int i = 0; i < arr.length; i++) {
            char first=arr[i].charAt(0);
            char upperfirst=Character.toUpperCase(first);
            String news=upperfirst+arr[i].substring(1);
            System.out.println(news);
            arr[i]=news;
        }
        System.out.println(Arrays.toString(arr));





    }
}
