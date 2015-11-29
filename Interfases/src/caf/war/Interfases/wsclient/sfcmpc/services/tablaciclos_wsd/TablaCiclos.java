package caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.tablaCiclos.
 */
@ManagedBean(name = "TablaCiclos")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class TablaCiclos extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2297006680881705984L;
	
	/**
	 * Constructor
	 */
	public TablaCiclos() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.class,  // port type proxy class
			"tablaCiclos", // method to invoke
			new String[] { "tablaCiclos", } // method parameter names
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

		private static final long serialVersionUID = 709708049227481088L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.TablaCiclosE tablaCiclos  = new  caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.TablaCiclosE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.TablaCiclosE getTablaCiclos() {
			return tablaCiclos;
		}

		public void setTablaCiclos(caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.TablaCiclosE tablaCiclos) {
			this.tablaCiclos = tablaCiclos;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.TablaCiclosResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.tablaciclos_wsd.SFCMPCServicesTablaCiclos_WSDStub.TablaCiclosResponseE)result;
	}
	
	
}