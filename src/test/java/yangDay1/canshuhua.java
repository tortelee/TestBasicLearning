package yangDay1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
@RunWith(Parameterized.class)
public class canshuhua {

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] h = {
                {1,1,1},{2,-2,0.25},{2,100000,Double.POSITIVE_INFINITY},{2,-100000,0},{1,3.12,1},
                {1,-3.12,1}, {-1,2,1},{-1,3,-1},{0.5,2,0.25},{-0.5,2,0.25},
                {-2,10000,Double.POSITIVE_INFINITY},{-2,10001,Double.NEGATIVE_INFINITY},{-2,-10000,0}, {-1,10000,1},{-1,10001,-1},{0,1,0},
                {0,0,1},{100000,10000,Double.POSITIVE_INFINITY}
        };
        return Arrays.asList(h);
    }

    private double zhishu;
    private double mishu;
    private double except;

    public canshuhua(double zhishu, double mishu, double except) {
        this.zhishu = zhishu;
        this.mishu = mishu;
        this.except = except;
    }

    @Test
    public void haveTest(){
        System.out.println("测试....");
        Assert.assertEquals(except,Math.pow(zhishu,mishu),0.001);
    }
}
