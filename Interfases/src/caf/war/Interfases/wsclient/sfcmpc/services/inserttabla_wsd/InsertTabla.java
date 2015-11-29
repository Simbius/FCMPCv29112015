package caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.insertTabla.
 */
@ManagedBean(name = "InsertTabla")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class InsertTabla extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8341651542052663296L;
	
	/**
	 * Constructor
	 */
	public InsertTabla() {
		super(caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.class,  // port type proxy class
			"insertTabla", // method to invoke
			new String[] { "insertTabla", } // method parameter names
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

		private static final long serialVersionUID = 830921038874933248L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.InsertTablaE insertTabla  = new  caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.InsertTablaE() ;

		public caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.InsertTablaE getInsertTabla() {
			return insertTabla;
		}

		public void setInsertTabla(caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.InsertTablaE insertTabla) {
			this.insertTabla = insertTabla;
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
	public caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.InsertTablaResponseE getResult() {
		return (caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.SFCMPCServicesInsertTabla_WSDStub.InsertTablaResponseE)result;
	}
	
	
}