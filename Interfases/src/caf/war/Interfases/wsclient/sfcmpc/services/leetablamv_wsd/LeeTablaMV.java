package caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.leeTablaMV.
 */
@ManagedBean(name = "LeeTablaMV")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaMV extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4066444832469249024L;
	
	/**
	 * Constructor
	 */
	public LeeTablaMV() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.class,  // port type proxy class
			"leeTablaMV", // method to invoke
			new String[] { "leeTablaMV", } // method parameter names
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

		private static final long serialVersionUID = 3072509651210804224L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.LeeTablaMVE leeTablaMV  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.LeeTablaMVE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.LeeTablaMVE getLeeTablaMV() {
			return leeTablaMV;
		}

		public void setLeeTablaMV(caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.LeeTablaMVE leeTablaMV) {
			this.leeTablaMV = leeTablaMV;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.LeeTablaMVResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.SFCMPCServicesLeeTablaMV_WSDStub.LeeTablaMVResponseE)result;
	}
	
	
}