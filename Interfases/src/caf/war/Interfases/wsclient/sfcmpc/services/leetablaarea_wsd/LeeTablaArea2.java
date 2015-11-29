package caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.leeTablaArea.
 */
@ManagedBean(name = "LeeTablaArea2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaArea2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 5697008597073278976L;
	
	/**
	 * Constructor
	 */
	public LeeTablaArea2() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.class,  // port type proxy class
			"leeTablaArea", // method to invoke
			new String[] { "leeTablaArea", } // method parameter names
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

		private static final long serialVersionUID = 1926625035113570304L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE leeTablaArea  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE getLeeTablaArea() {
			return leeTablaArea;
		}

		public void setLeeTablaArea(caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE leeTablaArea) {
			this.leeTablaArea = leeTablaArea;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaResponseE)result;
	}
	
	
}