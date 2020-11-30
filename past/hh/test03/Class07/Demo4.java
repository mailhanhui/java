package past.hh.test03.Class07;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 22 - 11:42
 */
public class Demo4 {
    public static void main(String[] args) {
        //arraycopy:数组的复制;包含5个参数
        //src:源数组;srcPos:开始复制的位置;dest:目标数组;destPos:目标数组的位置;length:复制长度;
        int[] arr={20,18,12,45,3,56,19,89};
        int[] de1=new int[8];
        System.arraycopy(arr,0,de1,0,8);
        for (int i = 0; i <de1.length; i++) {
            System.out.println(de1[i]);
        }
        //退出jvm
        System.exit(0);
    }
}
