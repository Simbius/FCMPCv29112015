package caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.leeTablaTipAct.
 */
@ManagedBean(name = "LeeTablaTipAct")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaTipAct extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 7934489789803325440L;
	
	/**
	 * Constructor
	 */
	public LeeTablaTipAct() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.class,  // port type proxy class
			"leeTablaTipAct", // method to invoke
			new String[] { "leeTablaTipAct", } // method parameter names
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

		private static final long serialVersionUID = 2891977717884573696L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.LeeTablaTipActE leeTablaTipAct  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.LeeTablaTipActE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.LeeTablaTipActE getLeeTablaTipAct() {
			return leeTablaTipAct;
		}

		public void setLeeTablaTipAct(caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.LeeTablaTipActE leeTablaTipAct) {
			this.leeTablaTipAct = leeTablaTipAct;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.LeeTablaTipActResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.SFCMPCServicesLeeTablaTipAct_WSDStub.LeeTablaTipActResponseE)result;
	}
	
	
}