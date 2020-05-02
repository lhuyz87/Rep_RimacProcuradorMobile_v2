package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
//import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import xPath.XpathLogin;
import util.PageObjectUtil;

public class BaseClassGalaxyNexus {
	AppiumDriver<MobileElement> driver;
	AndroidDriver driver2;
	protected XpathLogin xpath = XpathLogin.getInstancia();
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;

//	WebDriver driver;
	@BeforeTest
	public void setup()  {
		
		try {
			System.out.println("entra al before");
		DesiredCapabilities caps = new DesiredCapabilities();
		String prefix = "appium";
		
	
		caps.setCapability("usePrebuiltWDA", true);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Nexus API 29");
//		caps.setCapability(MobileCapabilityType.UDID, "192.168.63.101:5555");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 7200);
		caps.setCapability(MobileCapabilityType.NO_RESET, false);
		caps.setCapability(MobileCapabilityType.FULL_RESET, true);
//		caps.setCapability(MobileCapabilityType., false);
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\LRETAMOZO\\Downloads\\app-release.apk");
		caps.setCapability("appPackage","pe.com.rimac.geo.procurador");
		caps.setCapability("appActivity","pe.com.rimac.geo.procurador.Action.LoginActivity");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		
		System.out.println(" URL");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		System.out.println(" INICIA DRIVER");
//		driver = new AppiumDriver<MobileElement>(url, caps);
		driver2= new AndroidDriver(url, caps);
		Location loc = new Location(-12.0965159, -77.0278309, 0);
		driver2.setLocation(loc);
//		driver.resetApp();
//		System.out.println("******************   " + driver.location().toString());

		}catch (Exception e) {
			System.out.println("Cause is: "  + e.getCause());
			System.out.println("Cause is: "  + e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver2, wdwTimeOut, 1L);
		}

		return wdw;
	}

	
	@Test
	public void sampleTest() throws InterruptedException {
		
//		Thread.sleep(30000);
//		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='ALLOW']");
		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , "//*[@text='Usuario']","procuradorautoapp5@gmail.com",null);
		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , "//*[@text='Contraseña']","Test2020#",null);
//		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Ingresar']");
		Thread.sleep(100000);
		
		
		
	
	}
	@AfterTest
	public void teardown() {
		
	}
}
