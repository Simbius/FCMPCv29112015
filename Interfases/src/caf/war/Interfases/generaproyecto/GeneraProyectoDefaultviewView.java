/**
 * 
 */
package caf.war.Interfases.generaproyecto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "GeneraProyectoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "GeneraProyecto/default", beanType = BeanType.PAGE)
public class GeneraProyectoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.generaproyecto.GeneraProyecto generaProyecto = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider componentesProvider = null;
	private static final String[][] COMPONENTESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ComponentesProvider.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.SFCMPCServicesPublicaProyecto_WSDStub$Componentes"},
		{"#{ComponentesProvider.rowVariable}", "componente"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.PublicaProyecto publicaProyecto = null;
	private static final String[][] PUBLICAPROYECTO_PROPERTY_BINDINGS = new String[][] {
		{"#{PublicaProyecto.authCredentials.authenticationMethod}", "1"},
		{"#{PublicaProyecto.authCredentials.requiresAuth}", "true"},
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

	public caf.war.Interfases.generaproyecto.GeneraProyecto getGeneraProyecto()  {
		if (generaProyecto == null) {
		    generaProyecto = (caf.war.Interfases.generaproyecto.GeneraProyecto)resolveExpression("#{GeneraProyecto}");
		}
		return generaProyecto;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getComponentesProvider()  {
		if (componentesProvider == null) {
		    componentesProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ComponentesProvider}");
		}
	
	    resolveDataBinding(COMPONENTESPROVIDER_PROPERTY_BINDINGS, componentesProvider, "componentesProvider", false, false);
		return componentesProvider;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.PublicaProyecto getPublicaProyecto()  {
		if (publicaProyecto == null) {
		    publicaProyecto = (caf.war.Interfases.wsclient.sfcmpc.services.publicaproyecto_wsd.PublicaProyecto)resolveExpression("#{PublicaProyecto}");
		}
	
	    resolveDataBinding(PUBLICAPROYECTO_PROPERTY_BINDINGS, publicaProyecto, "publicaProyecto", false, false);
		return publicaProyecto;
	}
	
}