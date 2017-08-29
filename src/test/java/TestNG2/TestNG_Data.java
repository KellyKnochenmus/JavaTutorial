package TestNG2;

import org.testng.annotations.DataProvider;

public class TestNG_Data {

    @DataProvider(name="inputs2")
    public Object[][] getData() {
        return new Object[][]{
                {"nissan","altima"},
                {"acura","tlx"},
                {"honda","civic"}
        };
    }
}
