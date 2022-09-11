package com.store.utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListenerClass implements ITestListener {

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("OnStart method  Invoked....");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish method...");
	}

	// whene the test case get faild,this method is called
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure method..." + result.getName());
		String path = System.getProperty("user.dir") + "//Screenshot//" + result.getName() + ".png";

		File screenShotFile = new File(path);

		if (screenShotFile.exists()) {
			System.out.println("capture screendhot below .." + result.getName());
		}
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTestStart method  ");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess method..." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped method..." + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
