package example;

import org.testng.annotations.Test;

public class Demo3_1_Multithreading {
    @Test
    public void test01() throws Exception {
        Thread.sleep(1000);
        System.out.println("test01");
    }

    @Test(threadPoolSize = 5,invocationCount = 5,timeOut = 60000)
    public void test02() throws Exception{
        Thread.sleep(1000);
        long id = Thread.currentThread().getId();
        System.out.println("执行线程id是："+ id + "，test02 ");
    }

    @Test
    public void test03() throws Exception{
        Thread.sleep(1000);
        System.out.print("test03 ");
    }
}
