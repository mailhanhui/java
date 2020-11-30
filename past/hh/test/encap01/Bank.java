package past.hh.test.encap01;
import java.util.Scanner;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 10 - 19:47
 */
public class Bank {
    //创建保存用户数据的数组，长度5
    private User[] users = new User[5];
    //保存的用户个数
    private int size;
    //默认创建方法
    public Bank(){
        initial();
    }
    //创建第1个功能（方法）---初始化用户
    public void initial(){
        //create user
        User user1 = new User();
        user1.setCardNo("62225800");
        user1.setUsername("xiaoming");
        user1.setPassword("1111111aa");
        user1.setBalance(1124.56);
        user1.setIdentity("3201111974");
        user1.setPhone("18610740005");

        User user2 = new User();
        user2.setCardNo("62225888");
        user2.setUsername("xiaohan");
        user2.setPassword("123456");
        user2.setBalance(867.56);
        user2.setIdentity("4301112010");
        user2.setPhone("18511334858");

        User user3 = new User("62228899","4301111974","xiaowu","111111","18888888888",17894.32);

        //把用户写入数组
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        size = 3;
        System.out.println("initial done!");
    }
    //实现第2个功能——用户登录
    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入卡号");
        String cardNo = input.next();
        System.out.println("请输入密码");
        String password = input.next();
        //遍历数组
        User u = null;//保存找到的用户
        for(int i = 0;i < size;i++){
            if(users[i].getCardNo().equals(cardNo) && users[i].getPassword().equals(password)){ //注意用".equals()"
                u = users[i];
                break;
            }
        }
        if(u != null){
            System.out.println("登陆成功");
            showMenu(u);
        }else{
            System.out.println("输入错误，请重新输入");
            login(); //重新调用登录
        }
    }
    //实现第3个功能——显示菜单
    public void showMenu(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("========welcome \"" + u.getUsername() + "\" enter the system===============");
        do {
            System.out.println("=====1.存款 2.取款 3.转账 4.查询余额 5.修改密码 0.退出=====");
            System.out.println("请输入选项并回车");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    save(u);
                    break;
                case 2:
                    withDraw(u);
                    break;
                case 3:
                    trans(u);
                    break;
                case 4:
                    query(u);
                    break;
                case 5:
                    modifyPassword(u);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }while (true) ;
    }


    //实现菜单功能1：存款
    public void save(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入存款金额");
        double m = input.nextDouble();
        if(m > 0){
            u.setBalance(u.getBalance() + m);
            System.out.println("存钱成功，当前余额为："+u.getBalance());
        }else {
            System.out.println("存钱失败，请重新输入...");
        }

    }
    //实现菜单功能2：取款
    public void withDraw(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入取款金额");
        double m = input.nextDouble();
        if(m > 0 && m <= u.getBalance()){
            u.setBalance(u.getBalance() - m);
            System.out.println("取款成功，当前余额为："+u.getBalance());
        }else {
            System.out.println("取款失败，请重新输入...");
        }
    }
    //实现菜单功能3：转账
    public void trans(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入对方卡号");
        String cardNo = input.next();
        System.out.println("请输入转账金额");
        double m = input.nextDouble();
        //判断卡号是否存在
        User toUser = null;
        for(int i = 0;i < size;i++){
            if(users[i].getCardNo().equals(cardNo)){
                toUser = users[i];
                break;
            }
        }
        //判断
        if(toUser != null){
            if (m <= u.getBalance()){
                u.setBalance(u.getBalance() - m);
                toUser.setBalance(toUser.getBalance() + m);
                System.out.println("转账成功...");
            }else{
                System.out.println("余额不足...");
            }
        }else{
            System.out.println("对方卡号不存在...");
        }

    }
    //实现菜单功能1：查询余额
    public void query(User u) {
        System.out.println("卡号："+u.getCardNo()+" 用户名：" + u.getUsername()+ " 账户余额：" + u.getBalance() + "元");
    }
    //实现菜单功能1：修改密码
    public void modifyPassword(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入原密码");
        String originalPassword = input.next();
        if (originalPassword.equals(u.getPassword())){
            System.out.println("请输入新密码");
            String newPassword1 = input.next();
            if (newPassword1.length() != 6){
                System.out.println("密码长度不符合要求，请重新操作");
            }else{
                System.out.println("请再次输入新密码");
                String newPassword2 = input.next();
                if (newPassword2.length() != 6) {
                    System.out.println("密码长度不符合要求，请重新操作");
                }else{
                    if(newPassword1.equals(newPassword2)){
                        u.setPassword(newPassword1);
                        System.out.println("密码修改成功！");
                    }else{
                        System.out.println("密码输入错误...");
                    }
                }
            }

        }else{
            System.out.println("密码错误...");
        }
    }

}
