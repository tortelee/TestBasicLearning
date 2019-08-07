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
 - 每次运行，通过构造函数,会创建测试实例子,生成instance后，执行test函数。
 
 #### 异常测试
 对抛出的异常进行测试
 - 不能跟正常的在一个脚本，新建一个脚本
 ```java
@Test(expected = NullPointerException.class)

public void testStringIndexOf(){
    source.indexOf(str); // 抛异常
    }
```

#### 套件测试
junit 测试 格式为：
```java
@RunWith(Suite.class)
@Suite.SuiteClasses({StringTest2.class,canshuhua_string_indexof.class})
public class suiteTest1 {
}
```