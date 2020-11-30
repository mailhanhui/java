package test02.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 14:15
 */
public class SubMoney implements Runnable{
    private BankCard card;

    // 带参构造
    public SubMoney(BankCard bankCard) {
        this.card = bankCard;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (card.getMoney()>=1000){
                card.setMoney(card.getMoney()-1000);
                System.out.println(Thread.currentThread().getName()+"取了1000元，余额："+card.getMoney());
            }else {
                System.out.println("余额不足,存钱后继续尝试......");
                i--;
            }
        }
        System.out.println("取钱完成，卡里没钱了！！！");
    }
}
