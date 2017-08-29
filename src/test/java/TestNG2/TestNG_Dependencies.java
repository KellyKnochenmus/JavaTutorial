package TestNG2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Dependencies {

    SomeClassToTest obj;

       @BeforeClass
        public void beforeClass() {
           obj = new SomeClassToTest();
           System.out.println("Before Class Method");
       }

        @Test(dependsOnMethods={"testMethod2"}, alwaysRun=true)
        public void testMethod1() { System.out.println("TestNG.TestNG_Dependencies Test Method 1"); }

        @Test
        public void testMethod2() {
           System.out.println("TestNG.TestNG_Dependencies Test Method 2");
           int result = obj.sumNumbers(1, 2);
           Assert.assertEquals(result, 4);
       }

        @Test(dependsOnMethods={"testMethod1"})
        public void testMethod3() { System.out.println("TestNG.TestNG_Dependencies Test Method 3"); }

        @Test
        public void testMethod4() { System.out.println("TestNG.TestNG_Dependencies Test Method 4");  }

        @AfterClass
        public void afterClass() {
            System.out.println("After Class Method");
        }
}





