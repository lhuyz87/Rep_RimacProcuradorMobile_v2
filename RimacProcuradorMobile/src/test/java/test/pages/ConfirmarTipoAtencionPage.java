package test.pages;
import framework.util.PageObjectUtil;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.XpathDetalleTipoAtencion;
import test.xpath.XpathResumenCaso;;

public class ConfirmarTipoAtencionPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathDetalleTipoAtencion xpathDetalleTipoAtencion  = new XpathDetalleTipoAtencion();
	XpathResumenCaso xpathResumenCaso = new XpathResumenCaso();
	
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver2, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void selTipoAtencion(String tipoAtencion, String tipoSiniestro) {
    	
    	System.out.println("tipoAtencion  " +tipoAtencion + "tipoSiniestro   " +tipoSiniestro );
    	pageObjectUtil.sleep(4);
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathResumenCaso.btnConfirmarAtencion);
    	pageObjectUtil.sleep(2);
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.lstTipoAtencion);
    	pageObjectUtil.sleep(2);

    	
    	if(tipoAtencion.compareTo("Speed")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.opcSpeed);
    	if(tipoAtencion.compareTo("Denuncia Policial")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.opcDenunciaPolicial);
    	if(tipoAtencion.compareTo("Constatación de daños")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.opcConsDanos);
    	if(tipoAtencion.compareTo("Desistimiento")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.opcDesistimiento);
    	pageObjectUtil.sleep(2);
    	
    	
    	if(tipoSiniestro.compareTo("Choque")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.chkChoque);
    	if(tipoSiniestro.compareTo("Robo parcial")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.chkRoboPacial);
    	if(tipoSiniestro.compareTo("Robo total")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.chkRoboTotal);
    	if(tipoSiniestro.compareTo("Otros")==0)
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.chkOtros);
    	pageObjectUtil.sleep(2);

    	
   	
    }
    
    public void seleConfirmarAtencion() {
    	
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.btnFinalizarAtencion);
       	pageObjectUtil.sleep(2);
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathDetalleTipoAtencion.btnAceptar);
    	
    	
    
    }

    public void validarFinalizarCaso() {
    	
    	
    	System.out.println("CASO TERMINADO");
    	pageObjectUtil.sleep(5);
    	driver2.quit();
    }

}



