package listenerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {


    public void onStart(ISuite iSuite) {
        //Runs when <suite> tag starts
        System.out.println("onStart: before suite starts");
    }

    public void onFinish(ISuite iSuite) {
        //Runs when <suite> tag ends
        System.out.println("onFinish: after suite completes");
    }
}
