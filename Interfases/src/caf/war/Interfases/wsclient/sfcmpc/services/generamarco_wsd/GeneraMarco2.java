package caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.generaMarco.
 */
@ManagedBean(name = "GeneraMarco2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GeneraMarco2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 7403633617262503936L;
	
	/**
	 * Constructor
	 */
	public GeneraMarco2() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.class,  // port type proxy class
			"generaMarco", // method to invoke
			new String[] { "generaMarco", } // method parameter names
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

		private static final long serialVersionUID = 8605283327524303872L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.GeneraMarcoE generaMarco  = new  caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.GeneraMarcoE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.GeneraMarcoE getGeneraMarco() {
			return generaMarco;
		}

		public void setGeneraMarco(caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.GeneraMarcoE generaMarco) {
			this.generaMarco = generaMarco;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.GeneraMarcoResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub.GeneraMarcoResponseE)result;
	}
	
	
}