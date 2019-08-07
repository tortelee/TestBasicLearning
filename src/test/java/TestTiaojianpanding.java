import org.testng.annotations.Test;

public class TestTiaojianpanding {
    @Test
    public void test2(){
        TiaojianPanding t  = new TiaojianPanding();
        t.test(2,5,1);
        t.test(2,4,1);
        t.test(6,5,18);
        t.test(6,5,6);
    }
}
