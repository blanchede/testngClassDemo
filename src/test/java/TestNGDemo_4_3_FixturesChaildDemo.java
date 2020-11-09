import org.testng.annotations.*;
/**
 *继承
 */


public class TestNGDemo_4_3_FixturesChaildDemo extends TestNGDemo_4_2_FixturesDemo {
    
    @BeforeSuite
    public void chaildBeforeSuite() {
        System.out.println("chaild beforeSuite");
    }

    @AfterSuite
    public void chaildAfterSuite() {
        System.out.println("chaild afterSuite");
    }

    @BeforeTest
    public void chaildBeforeTest() {
        System.out.println("chaild beforeTest");
    }

    @AfterTest
    public void chaildAfterTest() {
        System.out.println("chaild afterTest");
    }

    @BeforeClass
    public void chaildBeforeClass() {
        System.out.println("chaild beforeClass");
    }

    @AfterClass
    public void chaildAfterClass() {
        System.out.println("chaild afterClass");
    }

    @BeforeMethod
    public void chaildBeofreMethod() {
        System.out.println("chaild beforeMethod");
    }

    @AfterMethod
    public void chaildAfterMethod() {
        System.out.println("chaild afterMethod");
    }

    @Test
    public void chaildTest1() {
        System.out.println("chaild method1");
    }

    @Test
    public void chaildTest2() {
        System.out.println("chaild methods2");
    }
}