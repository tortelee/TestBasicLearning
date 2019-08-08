package yangDay2;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Otherzhujie {
    @BeforeClass
    public void f(){
        System.out.println("before class");
    }
    @AfterClass
    public void f2(){
        System.out.println("after class");
    }
    @Before
    public void f3(){
        System.out.println("before");
    }
    @After
    public void f4(){
        System.out.println("after");
    }

}
