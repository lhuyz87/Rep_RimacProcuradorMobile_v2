package test.pages;
import framework.util.PageObjectUtil;
import java.net.URL;
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
    	pageObjectUtil.sleep(5);
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathAsignacionCaso.btnVerMapa);
    }
}
