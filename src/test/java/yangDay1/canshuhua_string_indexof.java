package yangDay1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
//参数化测试 string 的 indexof 方法
@RunWith(Parameterized.class)
public class canshuhua_string_indexof {
    private String source;
    private String str;
    private int excepted;

    public canshuhua_string_indexof(String target, String str, int excepted) {
        this.source = target;
        this.str = str;
        this.excepted = excepted;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
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
        return Arrays.asList(h);
    }
    @Test
    public void testStringIndexOf(){
        Assert.assertEquals(excepted,source.indexOf(str));
    }
}
