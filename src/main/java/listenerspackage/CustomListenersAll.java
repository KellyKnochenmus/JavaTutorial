package listenerspackage;

import org.testng.*;
import org.testng.IInvokedMethodListener;

public class CustomListenersAll implements IInvokedMethodListener, ITestListener, ISuiteListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //Before every method in the Test Class
        //print the class name with the method exists and then name of the method
        System.out.println("before invocation: " + testResult.getTestClass().getName() + " => " + method.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        //After every method in the Test Class
        System.out.println("after invocation: " + testResult.getTestClass().getName() + " => " + method.getTestMethod().getMethodName());
    }

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

    public void onStart(ISuite iSuite) {
        //Runs when <suite> tag starts
        System.out.println("onStart: before suite starts");
    }

    public void onFinish(ISuite iSuite) {
        //Runs when <suite> tag ends
        System.out.println("onFinish: after suite completes");
    }

}
