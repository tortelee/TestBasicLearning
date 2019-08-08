package yangDay2;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class assertThatTest {
    @Test
    public void f(){
        String actual = "Welcome ,1233a,to here";
        String excepted ="1233";
        Assert.assertThat(actual, Matchers.containsString(excepted)); //
    }

    @Test
    public void f2(){
        String actual = "Welcome ,1233,to here";
        String excepted ="1233";
        Assert.assertTrue(actual.contains(excepted)); //区分大小写
    }
}
