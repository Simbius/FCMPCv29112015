/**
 * 
 */
package caf.war.Interfases.definirmarcometodologico;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author simbius
 *
 */

@ManagedBean(name = "DefinirMarcoMetodologicoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "DefinirMarcoMetodologico/default", beanType = BeanType.PAGE)
public class DefinirMarcoMetodologicoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.definirmarcometodologico.DefinirMarcoMetodologico definirMarcoMetodologico = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.GeneraMarco2 generaMarco2 = null;
	private static final String[][] GENERAMARCO2_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneraMarco2.authCredentials.authenticationMethod}", "1"},
		{"#{GeneraMarco2.authCredentials.requiresAuth}", "true"},
		{"#{GeneraMarco2.autoRefresh}", "false"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider objetivosEspecificosProvider2 = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider2.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider2.rowVariable}", "objetivosEspecifico"},
		{"#{ObjetivosEspecificosProvider2.rowIdBinding}", "#{objetivosEspecifico.nombreObjetivoSpecified}"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider kpisProvider = null;
	private static final String[][] KPISPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{KpisProvider.rowType}", "java.lang.String"},
		{"#{KpisProvider.rowVariable}", "kpi"},
		{"#{KpisProvider.rowIdBinding}", "#{kpi}"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider actividadessProvider2 = null;
	private static final String[][] ACTIVIDADESSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ActividadessProvider2.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.SFCMPCServicesGeneraMarco_WSDStub$Actividadess"},
		{"#{ActividadessProvider2.rowVariable}", "actividades"},
		{"#{ActividadessProvider2.rowIdBinding}", "#{actividades.tipoActividadSpecified}"},
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

	public caf.war.Interfases.definirmarcometodologico.DefinirMarcoMetodologico getDefinirMarcoMetodologico()  {
		if (definirMarcoMetodologico == null) {
		    definirMarcoMetodologico = (caf.war.Interfases.definirmarcometodologico.DefinirMarcoMetodologico)resolveExpression("#{DefinirMarcoMetodologico}");
		}
		return definirMarcoMetodologico;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.GeneraMarco2 getGeneraMarco2()  {
		if (generaMarco2 == null) {
		    generaMarco2 = (caf.war.Interfases.wsclient.sfcmpc.services.generamarco_wsd.GeneraMarco2)resolveExpression("#{GeneraMarco2}");
		}
	
	    resolveDataBinding(GENERAMARCO2_PROPERTY_BINDINGS, generaMarco2, "generaMarco2", false, false);
		return generaMarco2;
	}

	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getObjetivosEspecificosProvider2()  {
		if (objetivosEspecificosProvider2 == null) {
		    objetivosEspecificosProvider2 = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider2}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER2_PROPERTY_BINDINGS, objetivosEspecificosProvider2, "objetivosEspecificosProvider2", false, false);
		return objetivosEspecificosProvider2;
	}

	public void setObjetivosEspecificosProvider2(com.webmethods.caf.faces.data.object.SelectableListTableContentProvider objetivosEspecificosProvider2)  {
		this.objetivosEspecificosProvider2 = objetivosEspecificosProvider2;
	}

	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getKpisProvider()  {
		if (kpisProvider == null) {
		    kpisProvider = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{KpisProvider}");
		}
	
	    resolveDataBinding(KPISPROVIDER_PROPERTY_BINDINGS, kpisProvider, "kpisProvider", false, false);
		return kpisProvider;
	}

	public void setKpisProvider(com.webmethods.caf.faces.data.object.SelectableListTableContentProvider kpisProvider)  {
		this.kpisProvider = kpisProvider;
	}

	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getActividadessProvider2()  {
		if (actividadessProvider2 == null) {
		    actividadessProvider2 = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{ActividadessProvider2}");
		}
	
	    resolveDataBinding(ACTIVIDADESSPROVIDER2_PROPERTY_BINDINGS, actividadessProvider2, "actividadessProvider2", false, false);
		return actividadessProvider2;
	}

	public void setActividadessProvider2(com.webmethods.caf.faces.data.object.SelectableListTableContentProvider actividadessProvider2)  {
		this.actividadessProvider2 = actividadessProvider2;
	}
	
}