package Testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test start");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("tets sucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("tets skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

}
