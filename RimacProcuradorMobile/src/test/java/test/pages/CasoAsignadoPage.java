package test.pages;

import framework.base.BasePage;
import framework.base.DriverContext;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import framework.util.PageObjectUtil;


import java.net.URL;

//import framework.utilities.CommonUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.XpathAsignacionCaso;

public class CasoAsignadoPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathAsignacionCaso xpathAsignacionCaso  = new XpathAsignacionCaso();

	
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver2, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void seleccionarVerMapa() {
    	pageObjectUtil.sleep(10);
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathAsignacionCaso.btnVerMapa);
    }
}
