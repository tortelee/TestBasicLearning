package yangDay1;


import org.junit.Assert;
import org.junit.Test;

public class Mathtest{
    @Test
    public void testPow(){
        double actural = Math.pow(2,3);
        double expectec = 8.0;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow2(){
        double actural = Math.pow(2,-3);
        double expectec = 1/8.0;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow3(){
        double actural = Math.pow(2,0);
        double expectec = 1;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow4(){
        double actural = Math.pow(2,10000);
        double expectec = Double.POSITIVE_INFINITY;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow5(){
        double actural = Math.pow(0,10000);
        double expectec = 0;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow6(){
        double actural = Math.pow(0.1,2);
        double expectec = 0.01;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.001);
    }
    @Test
    public void testPow7(){
        double actural = Math.pow(1,3.14);
        double expectec = 1;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow8(){
        double actural = Math.pow(0,1);
        double expectec = 0;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow9(){
        double actural = Math.pow(-1,2);
        double expectec = 1;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow10(){
        double actural = Math.pow(-1,3);
        double expectec = -1;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow11(){
        double actural = Math.pow(1,Math.sqrt(2));
        double expectec = 1;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow12(){
        double actural = Math.pow(1,-Math.sqrt(2));
        double expectec = 1;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.0);
    }
    @Test
    public void testPow13(){
        double actural = Math.pow(Math.sqrt(2),2);
        double expectec = 2;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.001);
    }
    @Test
    public void testPow14(){
        double actural = Math.pow(Math.sqrt(2),-2);
        double expectec = 0.5;
        //验证期望结果与实际结果是否相等
        Assert.assertEquals(actural,expectec,0.001);
    }


}
