package Testng_listeners;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import zmq.ZError.IOException;

public class TestNG_Implementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("excution of script started!", true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("excution of script is successfull", true);	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime time = LocalDateTime.now();
		String error = time.toString().replaceAll(":", "-");
		Reporter.log("excution of script failed", true);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destiny=new File("./ScreenShot//TestNG_Snap1.png");
		
		try {
			FileHandler.copy(source, destiny);
	
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
