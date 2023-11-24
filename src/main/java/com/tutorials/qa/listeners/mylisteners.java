package com.tutorials.qa.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tutorials.qa.utilies.ExtentReport;
import com.tutorials.qa.utilies.screenshot;


public class mylisteners implements ITestListener {
	ExtentReports extentreports;
	ExtentTest extenttest;
	 String destination1;
	 String destination2;
	 String testname;

	@Override
	public void onStart(ITestContext context) {
	System.out.println(context.getName()+"execution of project teses started");
	 extentreports = ExtentReport.generateextendreport();
	}

	public void onTestStart(ITestResult result) {
	 testname=	result.getName();
	
	 extenttest = extentreports.createTest(testname);
	extenttest.log(Status.INFO,testname+  " started executing");
	 

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname = result.getName();
		extenttest.log(Status.INFO,testname+ " successfully  executed");
		WebDriver	driver=null;
try {
		driver =	(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String path =screenshot.screenshottaken(driver, testname);
	
	extenttest.addScreenCaptureFromPath(path);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		 testname = result.getName();
		 

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(testname+ " skipped  execution");
		System.out.println(result.getThrowable());
	}
	

	@Override
	public void onFinish(ITestContext context) {
		
		extentreports.flush();
		System.out.println(testname+ " sucessfully complete project  execution");
		String pathofoutput="test-output//ExtentReport//extentreport.html";
		File extentreportfile = new File(pathofoutput);
		try {
			Desktop.getDesktop().browse(extentreportfile.toURI());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
