/**
 * 
 */
package caf.war.fcmpcPortales.prueba;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "PruebaDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Prueba/default", beanType = BeanType.PAGE)
public class PruebaDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.fcmpcPortales.prueba.Prueba prueba = null;
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1 generaMLogico_1 = null;
	private static final String[][] GENERAMLOGICO_1_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneraMLogico_1.authCredentials.authenticationMethod}", "1"},
		{"#{GeneraMLogico_1.authCredentials.requiresAuth}", "true"},
		{"#{GeneraMLogico_1.autoRefresh}", "false"},
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

	public caf.war.fcmpcPortales.prueba.Prueba getPrueba()  {
		if (prueba == null) {
		    prueba = (caf.war.fcmpcPortales.prueba.Prueba)resolveExpression("#{Prueba}");
		}
		return prueba;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1 getGeneraMLogico_1()  {
		if (generaMLogico_1 == null) {
		    generaMLogico_1 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1)resolveExpression("#{GeneraMLogico_1}");
		}
	
	    resolveDataBinding(GENERAMLOGICO_1_PROPERTY_BINDINGS, generaMLogico_1, "generaMLogico_1", false, false);
		return generaMLogico_1;
	}
	
}