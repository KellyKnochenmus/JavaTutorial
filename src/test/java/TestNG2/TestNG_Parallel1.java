package TestNG2;

import org.testng.annotations.Test;

public class TestNG_Parallel1 {

    @Test
    public void testMethd1() throws InterruptedException {
        System.out.println("TestNG_TestParallel1 Test Method 1");
        Thread.sleep(6000);
        System.out.println("TestNG_TestParallel1 Test Method 1 - More Steps");
    }

    @Test
    public void testMethd2() throws InterruptedException {
        System.out.println("TestNG_TestParallel1 Test Method 2");
        Thread.sleep(6000);
        System.out.println("TestNG_TestParallel1 Test Method 2 - More Steps");
    }

}
