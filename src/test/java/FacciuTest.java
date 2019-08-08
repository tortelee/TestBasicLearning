

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* Facciu Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 8, 2019</pre> 
* @version 1.0 
*/

public class FacciuTest {


@Before
public void before() throws Exception {
    System.out.println("before");
} 

@After
public void after() throws Exception {
    System.out.println("after");
} 

/** 
* 
* Method: faa(int a) 
* 
*/ 
@Test(timeout = 5000)
public void testFaa() throws Exception { 
//TODO: Test goes here...
    int res = Facciu.faa(40);
    System.out.println(res);

} 


} 
