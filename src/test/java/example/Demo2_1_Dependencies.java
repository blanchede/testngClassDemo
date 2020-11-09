package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2_1_Dependencies{
    //@Test
    //public void test01(){
        //System.out.println("test01 ");
        //Assert.fail("测试发生错误");
    //}

    @Test(dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("test02 ");
    }

    @Test(dependsOnMethods = {"test02"})
    public void test03(){
        System.out.println("test03 ");
    }
}
