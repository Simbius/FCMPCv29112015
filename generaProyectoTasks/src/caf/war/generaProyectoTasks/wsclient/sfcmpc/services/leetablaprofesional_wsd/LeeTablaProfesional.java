package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.leeTablaProfesional.
 */
@ManagedBean(name = "LeeTablaProfesional")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaProfesional extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3731305423345742848L;
	
	/**
	 * Constructor
	 */
	public LeeTablaProfesional() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.class,  // port type proxy class
			"leeTablaProfesional", // method to invoke
			new String[] { "leeTablaProfesional", } // method parameter names
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

		private static final long serialVersionUID = 4549339224195113984L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.LeeTablaProfesionalE leeTablaProfesional  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.LeeTablaProfesionalE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.LeeTablaProfesionalE getLeeTablaProfesional() {
			return leeTablaProfesional;
		}

		public void setLeeTablaProfesional(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.LeeTablaProfesionalE leeTablaProfesional) {
			this.leeTablaProfesional = leeTablaProfesional;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.LeeTablaProfesionalResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.SFCMPCServicesLeeTablaProfesional_WSDStub.LeeTablaProfesionalResponseE)result;
	}
	
	
}