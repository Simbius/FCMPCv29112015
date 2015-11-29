package caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.leeTablaObjetivo.
 */
@ManagedBean(name = "LeeTablaObjetivo2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaObjetivo2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3453147173659256832L;
	
	/**
	 * Constructor
	 */
	public LeeTablaObjetivo2() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.class,  // port type proxy class
			"leeTablaObjetivo", // method to invoke
			new String[] { "leeTablaObjetivo", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 8552722452096183296L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.LeeTablaObjetivoE leeTablaObjetivo  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.LeeTablaObjetivoE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.LeeTablaObjetivoE getLeeTablaObjetivo() {
			return leeTablaObjetivo;
		}

		public void setLeeTablaObjetivo(caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.LeeTablaObjetivoE leeTablaObjetivo) {
			this.leeTablaObjetivo = leeTablaObjetivo;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.LeeTablaObjetivoResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.SFCMPCServicesLeeTablaObjetivo_WSDStub.LeeTablaObjetivoResponseE)result;
	}
	
	
}