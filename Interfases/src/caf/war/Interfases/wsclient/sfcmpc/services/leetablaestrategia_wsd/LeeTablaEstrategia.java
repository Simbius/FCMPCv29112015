package caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.leeTablaEstrategia.
 */
@ManagedBean(name = "LeeTablaEstrategia")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaEstrategia extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4992277542206442496L;
	
	/**
	 * Constructor
	 */
	public LeeTablaEstrategia() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.class,  // port type proxy class
			"leeTablaEstrategia", // method to invoke
			new String[] { "leeTablaEstrategia", } // method parameter names
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

		private static final long serialVersionUID = 7081242240757093376L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.LeeTablaEstrategiaE leeTablaEstrategia  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.LeeTablaEstrategiaE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.LeeTablaEstrategiaE getLeeTablaEstrategia() {
			return leeTablaEstrategia;
		}

		public void setLeeTablaEstrategia(caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.LeeTablaEstrategiaE leeTablaEstrategia) {
			this.leeTablaEstrategia = leeTablaEstrategia;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.LeeTablaEstrategiaResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.SFCMPCServicesLeeTablaEstrategia_WSDStub.LeeTablaEstrategiaResponseE)result;
	}
	
	
}