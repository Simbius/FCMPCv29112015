package caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.procesaTablas.
 */
@ManagedBean(name = "ProcesaTablas")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class ProcesaTablas extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3238798083039388672L;
	
	/**
	 * Constructor
	 */
	public ProcesaTablas() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.class,  // port type proxy class
			"procesaTablas", // method to invoke
			new String[] { "procesaTablas", } // method parameter names
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

		private static final long serialVersionUID = 2609184203472132096L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.ProcesaTablasE procesaTablas  = new  caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.ProcesaTablasE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.ProcesaTablasE getProcesaTablas() {
			return procesaTablas;
		}

		public void setProcesaTablas(caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.ProcesaTablasE procesaTablas) {
			this.procesaTablas = procesaTablas;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.ProcesaTablasResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub.ProcesaTablasResponseE)result;
	}
	
	
}