package TestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {

    @BeforeClass(alwaysRun=true)
    public void beforeClass() { System.out.println("Before Class Method"); }

    @Test(groups = {"old"})
    public void testOldHonda() {  System.out.println("Old Honda");  }

    @Test(groups = {"new"})
    public void testNewMazda() { System.out.println("New Mazda");   }

    @Test(groups = {"old"})
    public void testOldToyota() { System.out.println("Old Toyota"); }
    @Test(groups = {"new", "luxury"})
    public void testNewLexus() {
        System.out.println("New Lexus");
    }

    @AfterClass(alwaysRun=true)
    public void afterClass() {
        System.out.println("After Class Method");
    }

}
