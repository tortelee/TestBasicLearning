package yangDay1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
//参数化测试 string 的 indexof 方法
@RunWith(Parameterized.class)
public class StringTest2 {
    private String source;
    private String str;


    public StringTest2(String target, String str) {
        this.source = target;
        this.str = str;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] h = {
                {"qwqwqwqe",null},
                {null,"a"}
        };
        return Arrays.asList(h);
    }
    @Test(expected = NullPointerException.class)
    public void testStringIndexOf(){
        source.indexOf(str);
    }
}
