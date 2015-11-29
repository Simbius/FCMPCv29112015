/**
 * 
 */
package caf.war.Interfases.pruebatempora;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "PruebaTemporaDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "PruebaTempora/default", beanType = BeanType.PAGE)
public class PruebaTemporaDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.pruebatempora.PruebaTempora pruebaTempora = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider2 = null;
	private static final String[][] PLANTAPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider2.rowType}", "java.lang.String"},
		{"#{PlantaProvider2.rowVariable}", "planta"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider comunaProvider2 = null;
	private static final String[][] COMUNAPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ComunaProvider2.rowType}", "java.lang.String"},
		{"#{ComunaProvider2.rowVariable}", "comuna"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider profesionalesProvider2 = null;
	private static final String[][] PROFESIONALESPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ProfesionalesProvider2.rowType}", "java.lang.String"},
		{"#{ProfesionalesProvider2.rowVariable}", "profesionale"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider2 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider2.rowType}", "java.lang.String"},
		{"#{EstablecimientosProvider2.rowVariable}", "establecimiento"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivoProvider5 = null;
	private static final String[][] OBJETIVOPROVIDER5_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivoProvider5.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Objetivo"},
		{"#{ObjetivoProvider5.rowVariable}", "objetivo"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosEspecificosProvider7 = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER7_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider7.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider7.rowVariable}", "objetivosEspecifico"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider3 = null;
	private static final String[][] PLANTAPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider3.rowType}", "java.lang.String"},
		{"#{PlantaProvider3.rowVariable}", "planta"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider comunaProvider3 = null;
	private static final String[][] COMUNAPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{ComunaProvider3.rowType}", "java.lang.String"},
		{"#{ComunaProvider3.rowVariable}", "comuna"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider profesionalesProvider3 = null;
	private static final String[][] PROFESIONALESPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{ProfesionalesProvider3.rowType}", "java.lang.String"},
		{"#{ProfesionalesProvider3.rowVariable}", "profesionale"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider3 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider3.rowType}", "java.lang.String"},
		{"#{EstablecimientosProvider3.rowVariable}", "establecimiento"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivoProvider6 = null;
	private static final String[][] OBJETIVOPROVIDER6_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivoProvider6.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Objetivo"},
		{"#{ObjetivoProvider6.rowVariable}", "objetivo"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosEspecificosProvider8 = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER8_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider8.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider8.rowVariable}", "objetivosEspecifico"},
	};
	private static final String[][] GENERAMLOGICO_13_PROPERTY_BINDINGS = new String[][] {
		{"#{generaMLogico_13.authCredentials.authenticationMethod}", "1"},
		{"#{generaMLogico_13.authCredentials.requiresAuth}", "true"},
		{"#{generaMLogico_13.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.planta}", "#{PruebaTemporaDefaultviewView.plantaProvider3.array}"},
		{"#{generaMLogico_13.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.comuna}", "#{PruebaTemporaDefaultviewView.comunaProvider3.array}"},
		{"#{generaMLogico_13.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.profesionales}", "#{PruebaTemporaDefaultviewView.profesionalesProvider3.array}"},
		{"#{generaMLogico_13.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.establecimientos}", "#{PruebaTemporaDefaultviewView.establecimientosProvider3.array}"},
		{"#{generaMLogico_13.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.objetivo}", "#{PruebaTemporaDefaultviewView.objetivoProvider6.array}"},
		{"#{generaMLogico_13.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.objetivosEspecificos}", "#{PruebaTemporaDefaultviewView.objetivosEspecificosProvider8.array}"},
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

	public caf.war.Interfases.pruebatempora.PruebaTempora getPruebaTempora()  {
		if (pruebaTempora == null) {
		    pruebaTempora = (caf.war.Interfases.pruebatempora.PruebaTempora)resolveExpression("#{PruebaTempora}");
		}
		return pruebaTempora;
	}

	

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider2()  {
		if (plantaProvider2 == null) {
		    plantaProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider2}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER2_PROPERTY_BINDINGS, plantaProvider2, "plantaProvider2", false, false);
		return plantaProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getComunaProvider2()  {
		if (comunaProvider2 == null) {
		    comunaProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ComunaProvider2}");
		}
	
	    resolveDataBinding(COMUNAPROVIDER2_PROPERTY_BINDINGS, comunaProvider2, "comunaProvider2", false, false);
		return comunaProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getProfesionalesProvider2()  {
		if (profesionalesProvider2 == null) {
		    profesionalesProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ProfesionalesProvider2}");
		}
	
	    resolveDataBinding(PROFESIONALESPROVIDER2_PROPERTY_BINDINGS, profesionalesProvider2, "profesionalesProvider2", false, false);
		return profesionalesProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider2()  {
		if (establecimientosProvider2 == null) {
		    establecimientosProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider2}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER2_PROPERTY_BINDINGS, establecimientosProvider2, "establecimientosProvider2", false, false);
		return establecimientosProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivoProvider5()  {
		if (objetivoProvider5 == null) {
		    objetivoProvider5 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivoProvider5}");
		}
	
	    resolveDataBinding(OBJETIVOPROVIDER5_PROPERTY_BINDINGS, objetivoProvider5, "objetivoProvider5", false, false);
		return objetivoProvider5;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosEspecificosProvider7()  {
		if (objetivosEspecificosProvider7 == null) {
		    objetivosEspecificosProvider7 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider7}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER7_PROPERTY_BINDINGS, objetivosEspecificosProvider7, "objetivosEspecificosProvider7", false, false);
		return objetivosEspecificosProvider7;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider3()  {
		if (plantaProvider3 == null) {
		    plantaProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider3}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER3_PROPERTY_BINDINGS, plantaProvider3, "plantaProvider3", false, false);
		return plantaProvider3;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getComunaProvider3()  {
		if (comunaProvider3 == null) {
		    comunaProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ComunaProvider3}");
		}
	
	    resolveDataBinding(COMUNAPROVIDER3_PROPERTY_BINDINGS, comunaProvider3, "comunaProvider3", false, false);
		return comunaProvider3;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getProfesionalesProvider3()  {
		if (profesionalesProvider3 == null) {
		    profesionalesProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ProfesionalesProvider3}");
		}
	
	    resolveDataBinding(PROFESIONALESPROVIDER3_PROPERTY_BINDINGS, profesionalesProvider3, "profesionalesProvider3", false, false);
		return profesionalesProvider3;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider3()  {
		if (establecimientosProvider3 == null) {
		    establecimientosProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider3}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER3_PROPERTY_BINDINGS, establecimientosProvider3, "establecimientosProvider3", false, false);
		return establecimientosProvider3;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivoProvider6()  {
		if (objetivoProvider6 == null) {
		    objetivoProvider6 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivoProvider6}");
		}
	
	    resolveDataBinding(OBJETIVOPROVIDER6_PROPERTY_BINDINGS, objetivoProvider6, "objetivoProvider6", false, false);
		return objetivoProvider6;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosEspecificosProvider8()  {
		if (objetivosEspecificosProvider8 == null) {
		    objetivosEspecificosProvider8 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider8}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER8_PROPERTY_BINDINGS, objetivosEspecificosProvider8, "objetivosEspecificosProvider8", false, false);
		return objetivosEspecificosProvider8;
	}
	
}