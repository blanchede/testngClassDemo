package example;

import org.testng.annotations.Test;

public class Demo01 {

    @Test(groups = {"group01"})
    public void test01() {

        System.out.println("demo01 test");
    }

    @Test(groups = {"group01","group02"})
    public void test02() {

        System.out.println("demo02 test");
    }

    @Test(groups = {"group02"})
    public void test03() {

        System.out.println("demo03 test");
    }

}
