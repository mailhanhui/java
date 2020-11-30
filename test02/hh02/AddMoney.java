package test02.hh02;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 29 - 14:15
 */
public class AddMoney implements Runnable{
    private BankCard card;

    public AddMoney(BankCard bankCard) {
        this.card = bankCard;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            card.setMoney(card.getMoney()+1000);
            System.out.println(Thread.currentThread().getName()+"存了1000元，余额："+ card.getMoney());
        }
        System.out.println("存钱结束，总共存了10000元");
    }
}
