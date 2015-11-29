package caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.insertTablaIndicadores.
 */
@ManagedBean(name = "InsertTablaIndicadores")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class InsertTablaIndicadores extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 1492399444918762496L;
	
	/**
	 * Constructor
	 */
	public InsertTablaIndicadores() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.class,  // port type proxy class
			"insertTablaIndicadores", // method to invoke
			new String[] { "insertTablaIndicadores", } // method parameter names
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

		private static final long serialVersionUID = 2620873345928429568L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.InsertTablaIndicadoresE insertTablaIndicadores  = new  caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.InsertTablaIndicadoresE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.InsertTablaIndicadoresE getInsertTablaIndicadores() {
			return insertTablaIndicadores;
		}

		public void setInsertTablaIndicadores(caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.InsertTablaIndicadoresE insertTablaIndicadores) {
			this.insertTablaIndicadores = insertTablaIndicadores;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.InsertTablaIndicadoresResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.inserttablaindicadores_wsd.SFCMPCServicesInsertTablaIndicadores_WSDStub.InsertTablaIndicadoresResponseE)result;
	}
	
	
}