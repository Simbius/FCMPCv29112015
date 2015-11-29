package caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.objetivos.
 */
@ManagedBean(name = "Objetivos")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class Objetivos extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3866970367606519808L;
	
	/**
	 * Constructor
	 */
	public Objetivos() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.class,  // port type proxy class
			"objetivos", // method to invoke
			new String[] { "objetivos", } // method parameter names
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

		private static final long serialVersionUID = 782428345145499648L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.ObjetivosE objetivos  = new  caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.ObjetivosE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.ObjetivosE getObjetivos() {
			return objetivos;
		}

		public void setObjetivos(caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.ObjetivosE objetivos) {
			this.objetivos = objetivos;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.ObjetivosResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.objetivos_wsd.SFCMPCServicesObjetivos_WSDStub.ObjetivosResponseE)result;
	}
	
	
}