package past.test01.hh05;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 19:01
 * 1。继承异常类
 * 2. 添加构造方法
 */
public class AgeException extends RuntimeException{
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }

    public AgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeException(Throwable cause) {
        super(cause);
    }

    public AgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
