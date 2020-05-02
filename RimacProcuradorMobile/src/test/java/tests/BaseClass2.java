package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass2 {
//	AppiumDriver<MobileElement> driver;
	WebDriver driver;
	@BeforeTest
	public void setup()  {
		
		try {
			System.out.println("entra al before");
		DesiredCapabilities caps = new DesiredCapabilities();
		String prefix = "appium";
		

	
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("deviceName", "Galaxy Nexus");
		caps.setCapability("UDID", "192.168.63.101:5555");
		caps.setCapability("lt", 60000);
		caps.setCapability("newCommandTimeout", 7200);
		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
		
////		caps.setCapability(MobileCapabilityType.APP, "");
////		caps.setCapability("", "Chrome");
		
		System.out.println(" URL");
		
		URL url = new URL("https://www.google.com/");
		
		System.out.println(" Carga Driver 2");
		driver = new RemoteWebDriver(url, caps);
//		driver=	new RemoteWebDriver(url, caps);

		

		System.out.println(" Carga Driver 2");

		}catch (Exception e) {
			System.out.println("Cause is: "  + e.getCause());
			System.out.println("Cause is: "  + e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	@Test
	public void sampleTest() {
		System.out.println("Empieza la prueba");
	}
	@AfterTest
	public void teardown() {
		
	}
}
