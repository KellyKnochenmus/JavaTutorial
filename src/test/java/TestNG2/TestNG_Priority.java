package TestNG2;

import org.testng.annotations.Test;

public class TestNG_Priority {


    @Test(priority=3)
    public void testMethod1() {
        System.out.println("\nRunning Test Method 1 in TestNG_Priority");
    }

    @Test(priority=2)
    public void testMethod2() {
        System.out.println("\nRunning Test Method 2 in TestNG_Priority");
    }

    @Test(priority=1)
    public void testMethod3() {
        System.out.println("\nRunning Test Method 3 in TestNG_Priority");
    }

}

