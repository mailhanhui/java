package past.test01.hh4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 27 - 10:37
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        // 添加
        map.put("my","哈士奇");
        map.put("zhangsan","机器猫");
        map.put("lisi","小乌龟");
        map.put("wangwu","藏獒");
        map.put("my","卡尔狗");//键相同，会覆盖原值
        map.put("zhaoliu","机器猫");//键不同，可以添加

        // 删除 (使用key，唯一)
        map.remove("lisi");
        System.out.println(map.toString());

        // 遍历（重点）
        System.out.println("----------增强for遍历----------");
        Set<String> s1=map.keySet();
        for (Object o : s1) {
            System.out.println(o+"="+map.get(o));
        }

        System.out.println("----------EntrySet遍历----------");
//        Set<Map.Entry<String,String>> entry=map.entrySet(); //也可以遍历s2，替代下面内容
        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.toString());//两种方式均可
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        // 判断
        System.out.println(map.containsKey("my"));
        System.out.println(map.containsValue("哈士奇"));
    }
}
