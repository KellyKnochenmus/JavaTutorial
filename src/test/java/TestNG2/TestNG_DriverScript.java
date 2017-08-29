package TestNG2;//Test NG imports

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import Strings;

public class TestNG_DriverScript {

    //Define global variables
    String str1 = "Hello Kelly";
    String str2 = "  Hello Kelly Spaces  ";

    //create object for Strings POM Class
    public Strings objStringsPOM = new Strings();

    //create object for Soft Assert
    public SoftAssert objSoftAssert = new SoftAssert();

    @BeforeTest
    //provide variables and run the printVariableValues method from the Strings POM class
    //This will run before each @Test
    public void beforeTestMethod() {
        System.out.println("");
        System.out.println("\n#### Starting beforeTestMethod ####");
        objStringsPOM.printVariableValues(str1,str2);
    }

    @Test
    //provide variables and run the charAtAndIndexOf method from the Strings POM class
    public void ABCtestMethod2() {
        System.out.println("");
        System.out.println("#### Starting ABCtestMethod2 ####");
        objStringsPOM.charAtAndIndexOf(str1);
    }

    @Test
    //provide variables and run the remainingStrings method from the Strings POM class
    public void AAtestMethod1() {
        System.out.println("");
        objSoftAssert.assertTrue(str1.equals(""));
        //Assert.assertTrue(!str1.equals(""));
        System.out.println("#### Starting AAtestMethod1 ####");
        objStringsPOM.remainingStrings(str1,str2);
        //Assert.assertTrue(!str1.equals(""));
        objSoftAssert.assertTrue(str1.contains("Kelly"));
        objSoftAssert.assertAll();
    }


}
