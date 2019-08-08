package yangDay1;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

// 匹配器
public class MathTest2 {
    @Test
    public void f(){
        //验证数字在5到10之间
        //Assert.assertTrue(x>=5&&x<=10)
        double actual = (Math.random()*5+5);
        Assert.assertThat(actual,allOf(greaterThanOrEqualTo(5.0),lessThanOrEqualTo(10.0)));
        Assert.assertThat("qweqweq",containsString("we"));
    }
}
