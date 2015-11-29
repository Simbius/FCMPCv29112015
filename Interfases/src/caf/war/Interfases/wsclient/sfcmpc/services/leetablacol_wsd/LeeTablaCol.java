package caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.leeTablaCol.
 */
@ManagedBean(name = "LeeTablaCol")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaCol extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2550884283359943680L;
	
	/**
	 * Constructor
	 */
	public LeeTablaCol() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.class,  // port type proxy class
			"leeTablaCol", // method to invoke
			new String[] { "leeTablaColInput", } // method parameter names
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

		private static final long serialVersionUID = 3375598506149342208L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.LeeTablaColInputE leeTablaColInput  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.LeeTablaColInputE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.LeeTablaColInputE getLeeTablaColInput() {
			return leeTablaColInput;
		}

		public void setLeeTablaColInput(caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.LeeTablaColInputE leeTablaColInput) {
			this.leeTablaColInput = leeTablaColInput;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.LeeTablaColOutputE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.SFCMPCServicesLeeTablaCol_WSDStub.LeeTablaColOutputE)result;
	}
	
	
}