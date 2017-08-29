package TestNG2;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResult_Demo {

    @Test
    public void testMethod1() {
        System.out.println("Running Test Method 1");
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test Method 2");
        Assert.assertTrue(true);
    }

    @AfterMethod    //will run after each method
    public void afterMethod(ITestResult testResult) {
        if(testResult.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("FAILED: " + testResult.getMethod().getMethodName());
        }
        if(testResult.getStatus() == ITestResult.SUCCESS)
        {
           // System.out.println("SUCCESS: " + testResult.getMethod().getMethodName());
            System.out.println("SUCCESS: " + testResult.getName());
        }
    }
}
