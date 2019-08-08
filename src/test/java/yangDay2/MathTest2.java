package yangDay2;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MathTest2 {
    @Test
    public void f(){
        Assert.assertTrue(5>=5);
        Assert.assertTrue("wsws".startsWith("w")&&"wsws".endsWith("s"));
    }
    @Test(timeOut = 5000)
    public void f2(){
        double actual = Math.pow(2,3);
        Assert.assertEquals(actual,8.0);
    }
    @Test
    @Parameters({"a","b","z"})
    public void f3(int x,int y,double z){
        Assert.assertEquals(z,Math.pow(x,y));
    }

    @DataProvider(name="data")
    public Object[][] data(){
        Object[][] h = {
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY}
        };
        return h;
    }
    @Test(expectedExceptions = Exception.class)
    public void f4() throws Exception {
        throw new Exception();
    }

}
