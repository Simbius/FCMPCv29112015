package caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.leeTablaComponente.
 */
@ManagedBean(name = "LeeTablaComponente")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaComponente extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2745620692177596416L;
	
	/**
	 * Constructor
	 */
	public LeeTablaComponente() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.class,  // port type proxy class
			"leeTablaComponente", // method to invoke
			new String[] { "leeTablaComponente", } // method parameter names
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

		private static final long serialVersionUID = 4617948423433919488L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE leeTablaComponente  = new  caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE getLeeTablaComponente() {
			return leeTablaComponente;
		}

		public void setLeeTablaComponente(caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE leeTablaComponente) {
			this.leeTablaComponente = leeTablaComponente;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteResponseE)result;
	}
	
	
}