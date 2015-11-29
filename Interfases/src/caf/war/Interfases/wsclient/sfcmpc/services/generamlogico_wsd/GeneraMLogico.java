package caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.generaMLogico.
 */
@ManagedBean(name = "GeneraMLogico")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GeneraMLogico extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4049627079707087872L;
	
	/**
	 * Constructor
	 */
	public GeneraMLogico() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.class,  // port type proxy class
			"generaMLogico", // method to invoke
			new String[] { "generaMLogico", } // method parameter names
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

		private static final long serialVersionUID = 4595548280683170816L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.GeneraMLogicoE generaMLogico  = new  caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.GeneraMLogicoE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.GeneraMLogicoE getGeneraMLogico() {
			return generaMLogico;
		}

		public void setGeneraMLogico(caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.GeneraMLogicoE generaMLogico) {
			this.generaMLogico = generaMLogico;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.GeneraMLogicoResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub.GeneraMLogicoResponseE)result;
	}
	
	
}