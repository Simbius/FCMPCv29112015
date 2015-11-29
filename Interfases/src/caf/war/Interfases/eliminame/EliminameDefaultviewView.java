/**
 * 
 */
package caf.war.Interfases.eliminame;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "EliminameDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Eliminame/default", beanType = BeanType.PAGE)
public class EliminameDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.Interfases.eliminame.Eliminame eliminame = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.ProcesaTablas2 procesaTablas2 = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider especificosProvider2 = null;
	private static final String[][] ESPECIFICOSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{EspecificosProvider2.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub$Especificos"},
		{"#{EspecificosProvider2.rowVariable}", "especifico"},
	};
	private static final String[][] PROCESATABLAS2_PROPERTY_BINDINGS = new String[][] {
		{"#{procesaTablas2.authCredentials.authenticationMethod}", "1"},
		{"#{procesaTablas2.authCredentials.requiresAuth}", "true"},
		{"#{procesaTablas2.autoRefresh}", "false"},
		{"#{procesaTablas2.parameters.procesaTablas.procesaTablas.especificos}", "#{EliminameDefaultviewView.especificosProvider2.array}"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider especificosProvider3 = null;
	private static final String[][] ESPECIFICOSPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{EspecificosProvider3.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub$Especificos"},
		{"#{EspecificosProvider3.rowVariable}", "especifico"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.Interfases.eliminame.Eliminame getEliminame()  {
		if (eliminame == null) {
		    eliminame = (caf.war.Interfases.eliminame.Eliminame)resolveExpression("#{Eliminame}");
		}
		return eliminame;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.ProcesaTablas2 getProcesaTablas2()  {
		if (procesaTablas2 == null) {
		    procesaTablas2 = (caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.ProcesaTablas2)resolveExpression("#{ProcesaTablas2}");
		}
	
	    resolveDataBinding(PROCESATABLAS2_PROPERTY_BINDINGS, procesaTablas2, "procesaTablas2", false, false);
		return procesaTablas2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEspecificosProvider2()  {
		if (especificosProvider2 == null) {
		    especificosProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EspecificosProvider2}");
		}
	
	    resolveDataBinding(ESPECIFICOSPROVIDER2_PROPERTY_BINDINGS, especificosProvider2, "especificosProvider2", false, false);
		return especificosProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEspecificosProvider3()  {
		if (especificosProvider3 == null) {
		    especificosProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EspecificosProvider3}");
		}
	
	    resolveDataBinding(ESPECIFICOSPROVIDER3_PROPERTY_BINDINGS, especificosProvider3, "especificosProvider3", false, false);
		return especificosProvider3;
	}
	
}