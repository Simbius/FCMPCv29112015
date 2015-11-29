package caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.leeTablaNivel.
 */
@ManagedBean(name = "LeeTablaNivel2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaNivel2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8595852409782944768L;
	
	/**
	 * Constructor
	 */
	public LeeTablaNivel2() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.class,  // port type proxy class
			"leeTablaNivel", // method to invoke
			new String[] { "leeTablaNivel", } // method parameter names
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

		private static final long serialVersionUID = 8734052727606511616L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.LeeTablaNivelE leeTablaNivel  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.LeeTablaNivelE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.LeeTablaNivelE getLeeTablaNivel() {
			return leeTablaNivel;
		}

		public void setLeeTablaNivel(caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.LeeTablaNivelE leeTablaNivel) {
			this.leeTablaNivel = leeTablaNivel;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.LeeTablaNivelResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.SFCMPCServicesLeeTablaNivel_WSDStub.LeeTablaNivelResponseE)result;
	}
	
	
}