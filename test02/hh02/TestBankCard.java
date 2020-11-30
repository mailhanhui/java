package test02.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 14:38
 */
public class TestBankCard {
    public static void main(String[] args) {
        //实例化银行卡
        BankCard card=new BankCard();

        //通过runnable实现类创建对象
//        //创建Runnable实现对象--用同一个银行卡
//        AddMoney addMoney=new AddMoney(bankCard);
//        SubMoney subMoney=new SubMoney(bankCard);

        // 用匿名内部类实现runnable功能，不用新建实现类
        // 存钱
        Runnable addMoney=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //加同步锁
                    synchronized (card){
                        card.setMoney(card.getMoney()+1000);
                        System.out.println(Thread.currentThread().getName()+"存了1000元，余额："+ card.getMoney());
                    }
                }
                System.out.println("存钱结束，总共存了10000元");
            }
        };

        // 取钱
        Runnable subMoney=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //加同步锁
                    synchronized (card){
                        if (card.getMoney()>=1000){
                            card.setMoney(card.getMoney()-1000);
                            System.out.println(Thread.currentThread().getName()+"取了1000元，余额："+card.getMoney());
                        }else {
                            System.out.println("余额不足,存钱后继续尝试......");
                            i--;
                        }
                    }
                }
                System.out.println("取钱完成，卡里没钱了！！！");
            }
        };

        //创建线程--用runnable对象实参构建
        new Thread(addMoney,"我").start();
        new Thread(subMoney,"我女朋友").start();
    }
}
