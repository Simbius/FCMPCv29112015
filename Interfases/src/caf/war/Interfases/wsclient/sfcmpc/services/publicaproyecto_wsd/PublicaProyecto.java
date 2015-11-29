package caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.publicaProyecto.
 */
@ManagedBean(name = "PublicaProyecto")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class PublicaProyecto extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8085797315676392448L;
	
	/**
	 * Constructor
	 */
	public PublicaProyecto() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.class,  // port type proxy class
			"publicaProyecto", // method to invoke
			new String[] { "publicaProyecto", } // method parameter names
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

		private static final long serialVersionUID = 657876096636861440L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.PublicaProyectoE publicaProyecto  = new  caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.PublicaProyectoE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.PublicaProyectoE getPublicaProyecto() {
			return publicaProyecto;
		}

		public void setPublicaProyecto(caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.PublicaProyectoE publicaProyecto) {
			this.publicaProyecto = publicaProyecto;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.PublicaProyectoResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub.PublicaProyectoResponseE)result;
	}
	
	
}