##### pom.xml文件
- scope 框架的有效范围\<scope>\</scope>
  - default \<scope>compile\</scope> :编译时才会运行
  - test :测试时使用这个框架
  例如当你在main文件中使用@Test会报错
  - provided ：编译时可以使用，运行时不会使用
  - runtime   测试 运行时
  - system 
#### 测试重复
#### 数据参数化
public class Parameterized
extends Suite
The custom runner Parameterized implements parameterized tests. When running a parameterized test class, instances are created for the cross-product of the test methods and the test data elements. 
For example, to test a Fibonacci function, write: 
```java
 @RunWith(Parameterized.class)
 public class FibonacciTest {
        @Parameters
        public static List<Object[]> data() {
                return Arrays.asList(new Object[][] {
                        { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
                });
        }
 
        private int fInput;
 
        private int fExpected;
 
        public FibonacciTest(int input, int expected) {
                fInput= input;
                fExpected= expected;
        }
 
        @Test
        public void test() {
                assertEquals(fExpected, Fibonacci.compute(fInput));
        }
 }
 ```
 每次运行，会创建测试实例子，然后实例会按照序列顺序初始化参数。
 生成instance后，执行test函数。
 <font color=red>`在编译的过程中，先实例化函数，通过构造函数。所以，参数是被先加载的。`</font>