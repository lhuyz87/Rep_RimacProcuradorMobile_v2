package xPath;

public class XpathDetalleTipoAtencion {
	
	private static XpathDetalleTipoAtencion obj= null;
	
	private XpathDetalleTipoAtencion(){
		
	}

	public static XpathDetalleTipoAtencion getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathDetalleTipoAtencion();
		}
	}
	
	public final String lstTipoAtencion ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.view.ViewGroup";
	
	public final String lblSpeed ="//*[@text='Speed']";
	public final String btnDenunciaPolicial ="//*[@text='Denuncia Policial']";
	public final String btnConsDanos ="//*[@text='Constatación de daños']";
	public final String btnDesistimiento ="//*[@text='Desistimiento']";
	
	
	public final String chkChoque ="//*[@text='Choque']"; //speed , Denuncia Policial
	public final String chkRoboTotal ="//*[@text='Robo parcial']"; //Denuncia Policial
	public final String chkRoboPacial ="//*[@text='Robo total']";//Speed , Denuncia Policial
	public final String chkOtros ="//*[@text='Otros']";//speed, Denuncia Policial
	
	public final String btnFinalizarAtencion ="//*[@text='Finalizar atención']";
	public final String btnAceptar ="//*[@text='ACEPTAR']";
//	Thread.sleep(30000);


}
