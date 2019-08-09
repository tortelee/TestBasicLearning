package yangDay3;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MathTest2 {

    @DataProvider(name="data",parallel = true)
    public Object[][] data(){
        Object[][] h = {
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY},
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY},
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY},
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY},
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY}
        };

        return h;
    }
    @Test(dataProvider = "data",threadPoolSize = 10)
    public void f4(double x,double y,double z) throws Exception {
        System.out.println("测试数据");
        Thread.sleep(1000);
        Assert.assertEquals(z,Math.pow(x,y));
    }

}
