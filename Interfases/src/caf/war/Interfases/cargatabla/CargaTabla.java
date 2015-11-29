/**
 * 
 */
package caf.war.Interfases.cargatabla;

/**
 * @author veztm
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "CargaTabla")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "cargaTabla", beanType = BeanType.PORTLET)
public class CargaTabla  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.Interfases.Interfases interfases = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public CargaTabla() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.Interfases.Interfases getInterfases()  {
		if (interfases == null) {
		    interfases = (caf.war.Interfases.Interfases)resolveExpression("#{Interfases}");
		}
		return interfases;
	}
}