package TestNG2;

import org.testng.annotations.*;

public class CommonBaseTestSuite {

    //Can add common things here and referenced in other tests
    @BeforeClass
    public void setUp() {
        System.out.println("\nBefore Class is Running before per TestSuite - TestNG.CommonBaseTestSuite");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("\nAfter Class is Running after per TestSuite - TestNG.CommonBaseTestSuite");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("\nBefore Suite is Running Once Before per Suite - TestNG.CommonBaseTestSuite");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("\nAfter Suite is Running Once After per Suite - TestNG.CommonBaseTestSuite");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\nBefore Test is Running Once Before Each Test Tag in Suite xml file - TestNG.CommonBaseTestSuite");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\nAfter Test is Running Once After Each Test Tag in Suite xml file - TestNG.CommonBaseTestSuite");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
