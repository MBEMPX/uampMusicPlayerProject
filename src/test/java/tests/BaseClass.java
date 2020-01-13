package tests;

import java.io.File;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	@Parameters({"deviceName","url"})
	public void setup(String deviceName, String url) {
		
		File f = new File("src");
		File fs = new File(f, "app-release.apk");
		
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			driver = new AndroidDriver<AndroidElement>(new URL(url),cap);
		
		} 
		catch(Exception e) {
			System.out.println("Casue of issue :" + e.getCause());
			System.out.println("Message is :" + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		
		  Thread.sleep(10000);
		  driver.closeApp();
		 
	}

}
