package TestNG2;

import org.testng.annotations.Test;

public class TestNG_DataProviders2 {

    @Test(dataProvider="inputs2", dataProviderClass=TestNG_Data.class)
    public void testMethod1(String input1, String input2) {
        System.out.println("Input 1: "+input1);
        System.out.println("Input 2: "+input2);
    }
}
