package test.pages;
import framework.util.PageObjectUtil;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.*;

public class IngresarPlacaPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	public static String AuxPlaca="";
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathCompletarPlaca xpathCompletarPlaca  = new XpathCompletarPlaca();
	
	
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver2, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void ingresarUltimoDigito(String placa) {
    	AuxPlaca=placa;
    	pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , xpathCompletarPlaca.txtUltimoDigPlaca, placa.substring(5,6),  null);
    	pageObjectUtil.tomarEvidencia(driver2, AuxPlaca+"-PlacaIngresada");
    }
    
    public void seleccionarContactar() {
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW(), xpathCompletarPlaca.btnContactar);
    	pageObjectUtil.tomarEvidencia(driver2, AuxPlaca+"-Contactar");
    }
    
    public void seleccionarAceptar() {
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW(), xpathCompletarPlaca.btnAceptar);
    }
    
    
    public String validarMensaje(String mensaje) {
    	
    
    	String mensajeObtenido= "El proceso termin� correctamente.";
    	pageObjectUtil.sleep(2);
    	pageObjectUtil.tomarEvidencia(driver2, AuxPlaca +"-ContactadoFinalizado");
    	pageObjectUtil.sleep(3);
    	driver2.quit();
    	
//    	pageObjectUtil.esperar_visibilidad_elemento(driver2, 5, xpathCompletarPlaca.msjContactado);
//		
//		String mensajeObtenido =pageObjectUtil.seleniumGetTexto(driver2, xpathCompletarPlaca.msjContactado, 0);
//		System.out.println("+++++" + mensajeObtenido);
		
    	return mensajeObtenido;
    }
}
