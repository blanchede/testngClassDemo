
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * 1、编写基础脚本
 */
public class TestNGDemo_1_1_Base {
    @Test
    public void addTest() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();
        int result01 = Calculator.add(4,2);
        System.out.println(result01);
        assertion.assertEquals(result01,5);
        int result02 = Calculator.add(4,2);
        System.out.println(result02);
        assertion.assertEquals(result02,5);

        int result03 = Calculator.add(4,2);
        System.out.println(result03);
        assertion.assertEquals(result03,6);
        assertion.assertAll();


    }
    @Test
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        Assert.assertEquals(result,2);

    }
    @Test
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        Assert.assertEquals(result,8);

    }
    @Test
    public void divideTest() throws InterruptedException {
        int result = Calculator.divide(4,2);
        System.out.println(result);
        Assert.assertEquals(result,2);

    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        Assert.assertEquals(result,4);

    }

}