package past.hh.test03.Class06;

import java.math.BigDecimal;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 21 - 14:02
 */
public class Demo8 {
    public static void main(String[] args) {
        //double存储的都是近似值，计算结果不精确
        double d1=1.0;
        double d2=0.9;
        System.out.println(d1-d2);
        double result=(1.4-0.5)/0.9;
        System.out.println(result);
        System.out.println("---------------------------------------");

        //使用BigDecimal进行精确计算
        BigDecimal bd1=new BigDecimal("1.0");
        BigDecimal bd2=new BigDecimal("0.9");
        System.out.println(bd1.add(bd2));//加法
        System.out.println(bd1.subtract(bd2));//减法
        System.out.println(bd1.multiply(bd2));//乘法
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));//除法，保留小数点后3位，四舍五入方式
            //可连续运算
        BigDecimal r4=new BigDecimal("1.4")
                .subtract(new BigDecimal("0.5"))
                .divide(new BigDecimal("0.9"),6, BigDecimal.ROUND_HALF_UP);//保留小数点后6位，四舍五入
        System.out.println(r4);

    }
}
