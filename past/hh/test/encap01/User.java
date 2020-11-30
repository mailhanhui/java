package past.hh.test.encap01;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 10 - 19:31
 */
public class User {
    private String cardNo;
    private String identity;
    private String username;
    private String password;
    private String phone;
    private double balance;
//添加User构造方法
    public User() {

    }
    public User(String cardNo, String identity, String username, String password, String phone, double balance) {
        this.cardNo = cardNo;
        this.identity = identity;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
    }
//添加get/set方法
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
