package Listener_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

@Override
public void onFinish(ITestContext Result) { 
	
	
}

@Override
public void onStart(ITestContext Result) {
	
}

@Override
public void onTestFailure(ITestResult Result) {
	
	System.out.println("The name of th testcase failed is" + Result.getName());
	
}
@Override
public void onTestStart(ITestResult Result) {
	
	System.out.println("The name of th testcase started" + Result.getName());
	
}

@Override
public void onTestSuccess(ITestResult Result) {                        // whn test case get passed this method is called.
	
	System.out.println("The name of th testcase failed is" + Result.getName());
	
}
}
