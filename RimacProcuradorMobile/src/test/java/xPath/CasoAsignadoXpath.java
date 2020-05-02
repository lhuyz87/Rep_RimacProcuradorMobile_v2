package xPath;

public class CasoAsignadoXpath {
	
	private static CasoAsignadoXpath obj= null;
	
	private CasoAsignadoXpath(){
		
	}

	public static CasoAsignadoXpath getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new CasoAsignadoXpath();
		}
	}
	
	public final String btnVerMapa ="//*[@text='Ver mapa']";

	
//	Thread.sleep(30000);


}
