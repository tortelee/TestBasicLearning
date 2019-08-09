#### testng 并发测试
\<suite name="All Test Suite" parallel="methods">

:airplane:表示方法并行测试

\<suite name="All Test Suite" parallel="methods" thread-count="6">

:car:增加线程个数
```diff
+ parallel 参数：
```
   - methods 所有的测试用例，测试方法;一个类中的方法
   - classes 所有执行测试集中的类
   - tests  所有的测试集，每个测试集一个线程

数据源并发执行
 
@DataProvider(parallel = true)
@Test(threadPoolSize = 5,invocationCount = 10)
- threadPoolSize  线程池大小
- invocationCount 累计执行次数
   