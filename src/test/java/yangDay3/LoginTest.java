package yangDay3;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "Name",threadPoolSize = 5,invocationCount = 10)
    public void f(String user,String password) throws InterruptedException {
        System.out.println("打开登录");
        Thread.sleep(1000);
        System.out.println("输入账号"+user);
        Thread.sleep(1000);
        System.out.println("输入密码"+password);
        Thread.sleep(1000);
        System.out.println("点击登录");

    }

    @DataProvider(name = "Name")  //数据源并发
    public static Object[][] Name() {
        Object[][] arr = {
                {"admin","123456"},
                {"admin","123"}
        };
        return arr;
    }

}
