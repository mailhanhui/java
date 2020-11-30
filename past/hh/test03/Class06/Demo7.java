package past.hh.test03.Class06;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 21 - 13:43
 */
public class Demo7 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();

//        //用字符串进行追加计算
//        String string="";
//        for (int i = 0; i < 99999; i++) {
//            string += i;
//        }
//        System.out.println(string);

        //用StringBuilder类型进行追加运算
//        StringBuilder string=new StringBuilder();
//        for (int i = 0; i < 99999; i++) {
//            string.append(i);
//        }
//        System.out.println(string);

        //用StringBuffer类型进行追加运算，比StringBuilder略慢但差异不大
        StringBuffer string=new StringBuffer();
        for (int i = 0; i < 99999; i++) {
            string.append(i);
        }
        System.out.println(string);


        long end=System.currentTimeMillis();
        System.out.println("用时："+(end-start));
    }
}
