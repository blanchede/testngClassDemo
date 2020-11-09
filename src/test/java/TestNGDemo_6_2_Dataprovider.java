import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
/**
文件导入参数
 */

public class TestNGDemo_6_2_Dataprovider {

    SoftAssert assertion = new SoftAssert();
    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException {
        return FakerUtils.getTestData("/src/main/resources/data/divideparam.csv");
    }

    @Test(threadPoolSize = 1, invocationCount = 1, dataProvider = "testData")
    public void divTest(String x ,String y, String resultok) throws InterruptedException {
        int result = Calculator.divide(Integer.valueOf(x),Integer.valueOf(y));
        System.out.println(result);

        assertion.assertEquals(result,resultok);
    }
}