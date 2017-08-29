package TestNG2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_TestSuite2 extends CommonBaseTestSuite {

   @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nBefore Method is Running Once Before Each Method - TestNG_TestSuite2");
    }

    @Test
    public void testMethod1() {
        System.out.println("\nRunning Test Method 1 in TestNG_TestSuite2");
    }

    @Test
    public void testMethod2() {
        System.out.println("\nRunning Test Method 2 in TestNG_TestSuite2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nAfter Method is Running Once After Each Method - TestNG_TestSuite2");
        System.out.println("==========================");
    }


}
