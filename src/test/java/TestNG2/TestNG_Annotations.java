package TestNG2;

import org.testng.annotations.*;

public class TestNG_Annotations {

    @BeforeClass
    public void setUp() {
        System.out.println("Before Class is Running before any other methods");
        System.out.println("***************");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method is Running Once Before Each Method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Running Test Method 1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test Method 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method is Running Once After Each Method");
        System.out.println("==========================");
        System.out.println("");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("After Class is Running after any other methods");
        System.out.println("***************");
    }
}
