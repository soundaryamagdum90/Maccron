package com.maccron.generic.listners;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maccron.BaseClass.BaseClass;

public class ListenersImplementation implements ISuiteListener, ITestListener{
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String testCase=result.getMethod().getMethodName();
	
		test = report.createTest(testCase);//only provide this in onTestStart
		test.log(Status.INFO,""+testCase+"Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testCase=result.getMethod().getMethodName();

		test.log(Status.PASS,""+testCase+"Execution Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testCase=result.getMethod().getMethodName();

		test.log(Status.FAIL,""+testCase+"Execution Failed");
		
		
		
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;//take this from BaseClass
		String src=ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(src);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testCase=result.getMethod().getMethodName();
//		Reporter.log(""+testCase+"Execution Skipped",true);
		test.log(Status.SKIP,""+testCase+"Execution Skipped");
	}

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("Report Configurstion",true);
		Date d=new Date();
		String date =d.toString().replaceAll(" ", "").replaceAll(":", "");
		ExtentSparkReporter spar=new ExtentSparkReporter("./Advance/"+date+"ExecutionReport.html");
		spar.config().setDocumentTitle("MaccronsReport");
		spar.config().setReportName("MaccronReport");
		spar.config().setTheme(Theme.STANDARD);
		
		report = new ExtentReports();
		report.attachReporter(spar);
		report.setSystemInfo("System","HP");
		report.setSystemInfo("OS","Window11");
		report.setSystemInfo("browser","chrome");
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("Take the Backup",true);
		report.flush();
	}
}
