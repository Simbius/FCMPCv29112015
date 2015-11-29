package caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.insertTablaEstrategia.
 */
@ManagedBean(name = "InsertTablaEstrategia")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class InsertTablaEstrategia extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 7995490834304774144L;
	
	/**
	 * Constructor
	 */
	public InsertTablaEstrategia() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.class,  // port type proxy class
			"insertTablaEstrategia", // method to invoke
			new String[] { "insertTablaEstrategia", } // method parameter names
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

		private static final long serialVersionUID = 3689970671246087168L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.InsertTablaEstrategiaE insertTablaEstrategia  = new  caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.InsertTablaEstrategiaE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.InsertTablaEstrategiaE getInsertTablaEstrategia() {
			return insertTablaEstrategia;
		}

		public void setInsertTablaEstrategia(caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.InsertTablaEstrategiaE insertTablaEstrategia) {
			this.insertTablaEstrategia = insertTablaEstrategia;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.InsertTablaEstrategiaResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.inserttablaestrategia_wsd.SFCMPCServicesInsertTablaEstrategia_WSDStub.InsertTablaEstrategiaResponseE)result;
	}
	
	
}