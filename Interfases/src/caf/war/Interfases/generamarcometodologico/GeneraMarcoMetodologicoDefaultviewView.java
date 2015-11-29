/**
 * 
 */
package caf.war.Interfases.generamarcometodologico;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author simbius
 *
 */

@ManagedBean(name = "GeneraMarcoMetodologicoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "GeneraMarcoMetodologico/default", beanType = BeanType.PAGE)
public class GeneraMarcoMetodologicoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.generamarcometodologico.GeneraMarcoMetodologico generaMarcoMetodologico = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.GeneraMarco generaMarco = null;
	private static final String[][] GENERAMARCO_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneraMarco.authCredentials.authenticationMethod}", "1"},
		{"#{GeneraMarco.authCredentials.requiresAuth}", "true"},
		{"#{GeneraMarco.autoRefresh}", "false"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider objetivosEspecificosProvider = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider.rowVariable}", "objetivosEspecifico"},
		{"#{ObjetivosEspecificosProvider.rowIdBinding}", "#{objetivosEspecifico.nombreObjetivoSpecified}"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider kpisProvider2 = null;
	private static final String[][] KPISPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{KpisProvider2.rowType}", "java.lang.String"},
		{"#{KpisProvider2.rowVariable}", "kpi"},
		{"#{KpisProvider2.rowIdBinding}", "#{kpi}"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider actividadessProvider = null;
	private static final String[][] ACTIVIDADESSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ActividadessProvider.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub$Actividadess"},
		{"#{ActividadessProvider.rowVariable}", "actividades"},
		{"#{ActividadessProvider.rowIdBinding}", "#{actividades.tipoActividadSpecified}"},
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

	public caf.war.Interfases.generamarcometodologico.GeneraMarcoMetodologico getGeneraMarcoMetodologico()  {
		if (generaMarcoMetodologico == null) {
		    generaMarcoMetodologico = (caf.war.Interfases.generamarcometodologico.GeneraMarcoMetodologico)resolveExpression("#{GeneraMarcoMetodologico}");
		}
		return generaMarcoMetodologico;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.GeneraMarco getGeneraMarco()  {
		if (generaMarco == null) {
		    generaMarco = (caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.GeneraMarco)resolveExpression("#{GeneraMarco}");
		}
	
	    resolveDataBinding(GENERAMARCO_PROPERTY_BINDINGS, generaMarco, "generaMarco", false, false);
		return generaMarco;
	}

	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getObjetivosEspecificosProvider()  {
		if (objetivosEspecificosProvider == null) {
		    objetivosEspecificosProvider = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER_PROPERTY_BINDINGS, objetivosEspecificosProvider, "objetivosEspecificosProvider", false, false);
		return objetivosEspecificosProvider;
	}

	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getKpisProvider2()  {
		if (kpisProvider2 == null) {
		    kpisProvider2 = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{KpisProvider2}");
		}
	
	    resolveDataBinding(KPISPROVIDER2_PROPERTY_BINDINGS, kpisProvider2, "kpisProvider2", false, false);
		return kpisProvider2;
	}

	public void setKpisProvider2(com.webmethods.caf.faces.data.object.SelectableListTableContentProvider kpisProvider2)  {
		this.kpisProvider2 = kpisProvider2;
	}

	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getActividadessProvider()  {
		if (actividadessProvider == null) {
		    actividadessProvider = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{ActividadessProvider}");
		}
	
	    resolveDataBinding(ACTIVIDADESSPROVIDER_PROPERTY_BINDINGS, actividadessProvider, "actividadessProvider", false, false);
		return actividadessProvider;
	}

	public void setActividadessProvider(com.webmethods.caf.faces.data.object.SelectableListTableContentProvider actividadessProvider)  {
		this.actividadessProvider = actividadessProvider;
	}
	
}