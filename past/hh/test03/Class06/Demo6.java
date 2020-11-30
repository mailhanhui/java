package past.hh.test03.Class06;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 21 - 12:41
 */
public class Demo6 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        //append()方法
        sb.append("java世界第一");
        System.out.println(sb);
        System.out.println(sb.toString());
        sb.append("java真好");
        System.out.println(sb.toString());
        //insert()方法
        sb.insert(4,1);
        System.out.println(sb);
        sb.insert(4,"不是");
        System.out.println(sb);
        //replace()方法
        sb.replace(0,4,"hello"); //4位置不替换
        System.out.println(sb.toString());
        //delete()方法
        sb.delete(0,4);//4位置不删除
        System.out.println(sb.toString());
        sb.delete(0,sb.length());//清空所有位置
        System.out.println(sb.length());

    }
}
