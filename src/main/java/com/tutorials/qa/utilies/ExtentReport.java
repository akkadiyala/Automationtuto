
package com.tutorials.qa.utilies;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	public static  ExtentReports generateextendreport() {
		ExtentReports extentreport = new ExtentReports(); 
		File extentreportfile = new File(".//test-output//ExtentReport//extentreport.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(extentreportfile);
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("tutorilasninjareport");
		spark.config().setDocumentTitle("TN Automation Report");
		spark.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		extentreport.attachReporter(spark);
		extentreport.setSystemInfo("App url", "https://tutorialsninja.com/demo/");
		return extentreport;
	}

}
//path correct way : 	String pathofoutput="test-output//ExtentReport//extentreport.html";