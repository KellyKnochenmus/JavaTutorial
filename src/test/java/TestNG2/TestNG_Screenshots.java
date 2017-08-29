package TestNG2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TestNG_Screenshots {
    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        fileName = fileName+".jpg";
        String directory = "//Users//kknochenmus//Desktop//";
        //The screenshot is saved in sourceFile
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The next line copies the screenshot to the desired directory
        FileUtils.copyFile(sourceFile, new File(directory + fileName));
    }
}
