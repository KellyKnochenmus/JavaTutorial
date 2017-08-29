package TestNG2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNG_ReportsAndLogs {

    @BeforeClass
    public void setUp() {
        System.out.println("TestNG_ReportsAndLogs -> This runs once before class system.out.println");
        Reporter.log("TestNG_ReportsAndLogs -> This runs once before class Reporter.log", true);
    }

    @AfterClass
    public void cleanUp() {
        Reporter.log("TestNG_ReportsAndLogs -> This runs once after class",true);
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("TestNG_ReportsAndLogs -> This runs once before every method",true);
    }

    @AfterMethod
    public void afterMethod() {
        Reporter.log("TestNG_ReportsAndLogs -> This runs once after every method",true);
    }

    @Test
    public void testMethod1() {
        Reporter.log("TestNG_ReportsAndLogs -> testMethod1,true");
    }

    @Test
    public void testMethod2() {
        //Will fail
        Reporter.log("TestNG_ReportsAndLogs -> testMethod2",true);
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"testMethod2"})
    //Will be skipped
    public void testMethod3() {
        Reporter.log("TestNG_ReportsAndLogs -> testMethod3",true);
    }
}
