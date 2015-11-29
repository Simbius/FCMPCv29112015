/**
 * 
 */
package caf.war.Interfases.cargatabla;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "CargaTablaDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "CargaTabla/default", beanType = BeanType.PAGE)
public class CargaTablaDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.cargatabla.CargaTabla cargaTabla = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.InsertTabla insertTabla = null;
	private static final String[][] INSERTTABLA_PROPERTY_BINDINGS = new String[][] {
		{"#{InsertTabla.authCredentials.authenticationMethod}", "1"},
		{"#{InsertTabla.authCredentials.requiresAuth}", "true"},
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

	public caf.war.Interfases.cargatabla.CargaTabla getCargaTabla()  {
		if (cargaTabla == null) {
		    cargaTabla = (caf.war.Interfases.cargatabla.CargaTabla)resolveExpression("#{CargaTabla}");
		}
		return cargaTabla;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.InsertTabla getInsertTabla()  {
		if (insertTabla == null) {
		    insertTabla = (caf.war.Interfases.wsclient.sfcmpc.services.inserttabla_wsd.InsertTabla)resolveExpression("#{InsertTabla}");
		}
	
	    resolveDataBinding(INSERTTABLA_PROPERTY_BINDINGS, insertTabla, "insertTabla", false, false);
		return insertTabla;
	}
	
}