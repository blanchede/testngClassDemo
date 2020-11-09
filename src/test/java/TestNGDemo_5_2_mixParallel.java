
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
  testNG模拟多线程
 **/
public class TestNGDemo_5_2_mixParallel {
    @Test(threadPoolSize = 2, invocationCount = 5)
    public void addTest() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();
        int result = Calculator.add(4,2);
        System.out.println("完成加法计算，结果为："+result);
        Assert.assertEquals(result ,6);
    }
    @Test(threadPoolSize = 2, invocationCount = 5)
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println("完成减法计算，结果为："+result);
        Assert.assertEquals(result,2);
    }
}