package tests;

import java.io.File;
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
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import xPath.XpathLogin;
import util.PageObjectUtil;
import org.openqa.selenium.By;

public class BaseClassGenimotion {
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
		
		File appDir = new File("src/test/resources/apps/app-release.apk");
		File app = new File(appDir, "app-release.apk");
	
		caps.setCapability("usePrebuiltWDA", true);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S10");
//		caps.setCapability(MobileCapabilityType.UDID, "192.168.63.101:5555");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 7200);
		caps.setCapability(MobileCapabilityType.NO_RESET, false);
		caps.setCapability(MobileCapabilityType.FULL_RESET, true);
//		caps.setCapability(MobileCapabilityType., false);
//		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\LRETAMOZO\\Downloads\\app-release.apk");
		caps.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
		caps.setCapability("appPackage","pe.com.rimac.geo.procurador");
		caps.setCapability("appActivity","pe.com.rimac.geo.procurador.Action.LoginActivity");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
//		-12.1110620, -77.0315913	ABA170	PROCURADOR AUTO2
//		-12.0965159, -77.0278309	ABA167	PROCURADOR AUTO5

		
		System.out.println(" URL");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		System.out.println(" INICIA DRIVER");
//		driver = new AppiumDriver<MobileElement>(url, caps);
		driver2= new AndroidDriver(url, caps);
		double longitud=-12.0965159;
		double latitud=-77.0278309;
		Location loc = new Location(longitud, latitud, 0);
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
		
		String Ultimodigitoplaca="7";
		String usuario="procuradorautoapp5@gmail.com";

		
		
//		Thread.sleep(30000);
//		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='ALLOW']");
		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , "//*[@text='Usuario']",usuario,null);
		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , "//*[@text='Contraseña']","Test2020#",null);
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Ingresar']");
		
//		Thread.sleep(25000);
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Ver mapa']");
		
//		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Llegada al lugar']");
		
		Thread.sleep(5000);
		System.out.println("Espera el ingreo de dígito de placa");
		//Ingresar ultimo digito de placa
		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , "//*[@resource-id='pe.com.rimac.geo.procurador:id/placa6']",Ultimodigitoplaca,null);
				
		
		//xpath del mensaje al seleccionar ultimo dígito de placa
		//*[@text='El proceso terminó correctamente.']
		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Contactar']");
		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='ACEPTAR']");
		
		
		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Confirmar tipo de atención']");
		//lo mismo que confirmar atención pero por id
		//resource-id pe.com.rimac.geo.procurador:id/btnVerMapa
		Thread.sleep(2000);
		By cboTipoAtencion = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.view.ViewGroup");
		driver2.findElement(cboTipoAtencion).click();
		
//		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@elementId='267bac0a-1dc8-4d2f-bb16-a1537d74e773']");

		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Speed']");
		
//otras opciones: 	 Denuncia Policial Constatación de daños Desistimiento

		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Choque']");
		//otras opciones del chekbox, Robo parcial, Robo total, Otros
		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='Finalizar atención']");
		
		
		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='ACEPTAR']");
		
//		No confirmar atención
//		pageObjectUtil.seleniumClickUntil(driver2, getWDW() , "//*[@text='CANCELAR']");
		Thread.sleep(50000);
		
		//resource-id: pe.com.rimac.geo.procurador:id/lblmensajecaso
		
		
		
	
	}
	@AfterTest
	public void teardown() {
		
	}
}
