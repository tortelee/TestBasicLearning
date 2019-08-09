package yangDay3;

import org.testng.annotations.Test;
import yangDay2.Facciu;
public class TimeOutTest {
    @Test(timeOut = 4000)
    public void f( ) throws Exception{
        Facciu.faa(44);
    }
    @Test(timeOut = 4000)
    public void f2( ) throws Exception{
        Facciu.faa(44);
    }
}
