package TestNG2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {

    @BeforeClass
    @Parameters({"browser", "platform"})
    public void setUp(String browser, String platform) {
        System.out.println("TestNG_TestParameters Before Class");
        System.out.println("1. Parameter value from xml file: "+browser);
        System.out.println("2. Parameter value from xml file: "+platform);
    }

    @Test
    @Parameters({"response"})
    public void testMethod1(String response) throws InterruptedException {
        System.out.println("TestNG_TestParameters Test Method 1");
        System.out.println("Response from xml file: "+response);
    }

}
