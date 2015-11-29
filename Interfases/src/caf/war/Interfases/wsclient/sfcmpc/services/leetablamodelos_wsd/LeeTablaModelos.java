package caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.leeTablaModelos.
 */
@ManagedBean(name = "LeeTablaModelos")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaModelos extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 800367181895254016L;
	
	/**
	 * Constructor
	 */
	public LeeTablaModelos() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.class,  // port type proxy class
			"leeTablaModelos", // method to invoke
			new String[] { "leeTablaModelos", } // method parameter names
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

		private static final long serialVersionUID = 8110905119992443904L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.LeeTablaModelosE leeTablaModelos  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.LeeTablaModelosE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.LeeTablaModelosE getLeeTablaModelos() {
			return leeTablaModelos;
		}

		public void setLeeTablaModelos(caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.LeeTablaModelosE leeTablaModelos) {
			this.leeTablaModelos = leeTablaModelos;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.LeeTablaModelosResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.SFCMPCServicesLeeTablaModelos_WSDStub.LeeTablaModelosResponseE)result;
	}
	
	
}