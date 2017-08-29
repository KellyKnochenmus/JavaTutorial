package listenerspackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.TestNGMethod;

public class CustomListener2 implements ITestListener {


    public void onTestStart(ITestResult result) {
        //Runs when any test method starts @Test
        System.out.println("onTestStart -> Test Name: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        //Runs when any test method is successful @Test
        System.out.println("onTestSuccess -> Test Name: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        //Runs when any test method fails @Test
        System.out.println("onTestFailure -> Test Name: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        //Runs when any test method is skipped @Test
     }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //Runs when any test method has failed, but the results fall within a tolerable range of error @Test
    }

    public void onStart(ITestContext context) {
        //Runs before each <test> tag in the xml file
        System.out.println("onStart -> Test Tag Name: " + context.getName());
        //print the names of all test methods
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("These methods will be executed in this test tag: ");
        for (ITestNGMethod method : methods) {
            System.out.println(method.getMethodName());
        }
    }

    public void onFinish(ITestContext context) {
        //Runs after each <test> tag in the xml file
        System.out.println("onFinish -> Test Tag Name: " + context.getName());
    }
}