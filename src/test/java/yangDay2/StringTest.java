package yangDay2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTest {
    @DataProvider(name = "Name")
    public static Object[][] Name() {
        Object[][] h = {
                {"qwqwqwqe","q",0},
                {"qwqwqwqe","a",-1},
                {"1111111q","1q",6},
                {"abcdefg","abcdefg",0},
                {"","",0},
                {"wewefw","wewefwd",-1},
                {"qweqw@","@",5},
                {"abcdefg","",0}
        };
        return h;
    }

    @Test(dataProvider = "Name")
    public void f(String source,String str,int index){
        Assert.assertEquals(index,source.indexOf(str));
    }
    //异常测试
    @Test(expectedExceptions = ArithmeticException.class)
    public void f2(){
        System.out.println(1/0);
    }
    //超时测试
    @Test(timeOut = 4000)
    public void f3() throws Exception {
        Facciu.faa(43);
    }
}
