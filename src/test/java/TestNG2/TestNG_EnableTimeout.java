package TestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeout {

    @BeforeClass
    public void beforeClass() { System.out.println("Before Class Method"); }

    @Test(enabled=false)
    public void testMethod1() {  System.out.println("TestNG.TestNG_EnableTimeout Test Method 1");  }

    @Test(timeOut=100)
    public void testMethod2() {
        System.out.println("TestNG.TestNG_EnableTimeout Test Method 2");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class Method");
    }



}
