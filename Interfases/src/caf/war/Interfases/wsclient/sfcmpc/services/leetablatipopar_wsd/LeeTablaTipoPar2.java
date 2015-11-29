package caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.leeTablaTipoPar.
 */
@ManagedBean(name = "LeeTablaTipoPar2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaTipoPar2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8913305023018346496L;
	
	/**
	 * Constructor
	 */
	public LeeTablaTipoPar2() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.class,  // port type proxy class
			"leeTablaTipoPar", // method to invoke
			new String[] { "leeTablaTipoPar", } // method parameter names
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

		private static final long serialVersionUID = 3661302068358704128L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE leeTablaTipoPar  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE getLeeTablaTipoPar() {
			return leeTablaTipoPar;
		}

		public void setLeeTablaTipoPar(caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE leeTablaTipoPar) {
			this.leeTablaTipoPar = leeTablaTipoPar;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParResponseE)result;
	}
	
	
}