/**
 * 
 */
package caf.war.Interfases.definirmarcov1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "DefinirMarcoV1DefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "DefinirMarcoV1/default", beanType = BeanType.PAGE)
public class DefinirMarcoV1DefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.definirmarcov1.DefinirMarcoV1 definirMarcoV1 = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider = null;
	private static final String[][] PLANTAPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider.rowType}", "java.lang.String"},
		{"#{PlantaProvider.rowVariable}", "planta"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider comunaProvider = null;
	private static final String[][] COMUNAPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ComunaProvider.rowType}", "java.lang.String"},
		{"#{ComunaProvider.rowVariable}", "comuna"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider profesionalesProvider = null;
	private static final String[][] PROFESIONALESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ProfesionalesProvider.rowType}", "java.lang.String"},
		{"#{ProfesionalesProvider.rowVariable}", "profesionale"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider.rowType}", "java.lang.String"},
		{"#{EstablecimientosProvider.rowVariable}", "establecimiento"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivoProvider3 = null;
	private static final String[][] OBJETIVOPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivoProvider3.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Objetivo"},
		{"#{ObjetivoProvider3.rowVariable}", "objetivo"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo2 leeTablaObjetivo2 = null;
	private static final String[][] LEETABLAOBJETIVO2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaObjetivo2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaObjetivo2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaObjetivo2.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider12 = null;
	private static final String[][] SOLUCIONPROVIDER12_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider12.rowVariable}", "solucion"},
		{"#{solucionProvider12.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider12.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider12.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaObjetivo2.result.leeTablaObjetivoResponse.rtabla.solucion}"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos leeTablaModelos = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider13 = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis leeTablaKpis = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider14 = null;
	private static final String[][] LEETABLAKPIS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaKpis.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaKpis.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaKpis.autoRefresh}", "true"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV2 leeTablaMV2 = null;
	private static final String[][] LEETABLAMV2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaMV2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaMV2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaMV2.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider15 = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosEspecificosProvider6 = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER6_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider6.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider6.rowVariable}", "objetivosEspecifico"},
	};
	private static final String[][] LEETABLAMODELOS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaModelos.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaModelos.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaModelos.autoRefresh}", "true"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos2 leeTablaObjetivos2 = null;
	private static final String[][] LEETABLAOBJETIVOS2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaObjetivos2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaObjetivos2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaObjetivos2.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider16 = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.LeeTablaComponente leeTablaComponente = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider17 = null;
	private static final String[][] SOLUCIONPROVIDER17_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider17.rowVariable}", "solucion"},
		{"#{solucionProvider17.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider17.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider17.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaComponente.result.leeTablaComponenteResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER16_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider16.rowVariable}", "solucion"},
		{"#{solucionProvider16.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider16.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider16.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaObjetivos2.result.leeTablaObjetivosResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER15_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider15.rowVariable}", "solucion"},
		{"#{solucionProvider15.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider15.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider15.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaMV2.result.leeTablaMVResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER14_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider14.rowVariable}", "solucion"},
		{"#{solucionProvider14.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider14.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider14.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaKpis.result.leeTablaKpisResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER13_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider13.rowVariable}", "solucion"},
		{"#{solucionProvider13.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider13.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider13.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaModelos.result.leeTablaModelosResponse.modelos.solucion}"},
	};
	private static final String[][] LEETABLACOMPONENTE_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaComponente.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaComponente.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaComponente.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider especificosProvider4 = null;
	private static final String[][] ESPECIFICOSPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{EspecificosProvider4.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Especificos"},
		{"#{EspecificosProvider4.rowVariable}", "especifico"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider estrategiaProvider2 = null;
	private static final String[][] ESTRATEGIAPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{EstrategiaProvider2.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Estrategia"},
		{"#{EstrategiaProvider2.rowVariable}", "estrategia"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosXactividadProvider = null;
	private static final String[][] OBJETIVOSXACTIVIDADPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosXactividadProvider.rowType}", "java.lang.String"},
		{"#{ObjetivosXactividadProvider.rowVariable}", "objetivosXactividad"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct2 leeTablaTipAct2 = null;
	private static final String[][] LEETABLATIPACT2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaTipAct2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaTipAct2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaTipAct2.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider18 = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria2 leeTablaCategoria2 = null;
	private static final String[][] LEETABLACATEGORIA2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaCategoria2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaCategoria2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaCategoria2.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider19 = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar2 leeTablaTipoPar2 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider20 = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea2 leeTablaArea2 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider21 = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel2 leeTablaNivel2 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider22 = null;
	private static final String[][] SOLUCIONPROVIDER22_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider22.rowVariable}", "solucion"},
		{"#{solucionProvider22.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider22.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider22.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaNivel2.result.leeTablaNivelResponse.rtabla.solucion}"},
	};
	private static final String[][] LEETABLANIVEL2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaNivel2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaNivel2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaNivel2.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER21_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider21.rowVariable}", "solucion"},
		{"#{solucionProvider21.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider21.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider21.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaArea2.result.leeTablaAreaResponse.rtabla.solucion}"},
	};
	private static final String[][] LEETABLAAREA2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaArea2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaArea2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaArea2.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER20_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider20.rowVariable}", "solucion"},
		{"#{solucionProvider20.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider20.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider20.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaTipoPar2.result.leeTablaTipoParResponse.rtabla.solucion}"},
	};
	private static final String[][] LEETABLATIPOPAR2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaTipoPar2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaTipoPar2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaTipoPar2.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER19_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider19.rowVariable}", "solucion"},
		{"#{solucionProvider19.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider19.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider19.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaCategoria2.result.leeTablaCategoriaResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER18_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider18.rowVariable}", "solucion"},
		{"#{solucionProvider18.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider18.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider18.array}", "#{DefinirMarcoV1DefaultviewView.leeTablaTipAct2.result.leeTablaTipActResponse.rtabla.solucion}"},
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

	public caf.war.Interfases.definirmarcov1.DefinirMarcoV1 getDefinirMarcoV1()  {
		if (definirMarcoV1 == null) {
		    definirMarcoV1 = (caf.war.Interfases.definirmarcov1.DefinirMarcoV1)resolveExpression("#{DefinirMarcoV1}");
		}
		return definirMarcoV1;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider()  {
		if (plantaProvider == null) {
		    plantaProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER_PROPERTY_BINDINGS, plantaProvider, "plantaProvider", false, false);
		return plantaProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getComunaProvider()  {
		if (comunaProvider == null) {
		    comunaProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ComunaProvider}");
		}
	
	    resolveDataBinding(COMUNAPROVIDER_PROPERTY_BINDINGS, comunaProvider, "comunaProvider", false, false);
		return comunaProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getProfesionalesProvider()  {
		if (profesionalesProvider == null) {
		    profesionalesProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ProfesionalesProvider}");
		}
	
	    resolveDataBinding(PROFESIONALESPROVIDER_PROPERTY_BINDINGS, profesionalesProvider, "profesionalesProvider", false, false);
		return profesionalesProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider()  {
		if (establecimientosProvider == null) {
		    establecimientosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER_PROPERTY_BINDINGS, establecimientosProvider, "establecimientosProvider", false, false);
		return establecimientosProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivoProvider3()  {
		if (objetivoProvider3 == null) {
		    objetivoProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivoProvider3}");
		}
	
	    resolveDataBinding(OBJETIVOPROVIDER3_PROPERTY_BINDINGS, objetivoProvider3, "objetivoProvider3", false, false);
		return objetivoProvider3;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo2 getLeeTablaObjetivo2()  {
		if (leeTablaObjetivo2 == null) {
		    leeTablaObjetivo2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo2)resolveExpression("#{LeeTablaObjetivo2}");
		}
	
	    resolveDataBinding(LEETABLAOBJETIVO2_PROPERTY_BINDINGS, leeTablaObjetivo2, "leeTablaObjetivo2", false, false);
		return leeTablaObjetivo2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider12()  {
		if (solucionProvider12 == null) {
		    solucionProvider12 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider12}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER12_PROPERTY_BINDINGS, solucionProvider12, "solucionProvider12", false, false);
		return solucionProvider12;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos getLeeTablaModelos()  {
		if (leeTablaModelos == null) {
		    leeTablaModelos = (caf.war.Interfases.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos)resolveExpression("#{LeeTablaModelos}");
		}
	
	    resolveDataBinding(LEETABLAMODELOS_PROPERTY_BINDINGS, leeTablaModelos, "leeTablaModelos", false, false);
		return leeTablaModelos;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider13()  {
		if (solucionProvider13 == null) {
		    solucionProvider13 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider13}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER13_PROPERTY_BINDINGS, solucionProvider13, "solucionProvider13", false, false);
		return solucionProvider13;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis getLeeTablaKpis()  {
		if (leeTablaKpis == null) {
		    leeTablaKpis = (caf.war.Interfases.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis)resolveExpression("#{LeeTablaKpis}");
		}
	
	    resolveDataBinding(LEETABLAKPIS_PROPERTY_BINDINGS, leeTablaKpis, "leeTablaKpis", false, false);
		return leeTablaKpis;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider14()  {
		if (solucionProvider14 == null) {
		    solucionProvider14 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider14}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER14_PROPERTY_BINDINGS, solucionProvider14, "solucionProvider14", false, false);
		return solucionProvider14;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV2 getLeeTablaMV2()  {
		if (leeTablaMV2 == null) {
		    leeTablaMV2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV2)resolveExpression("#{LeeTablaMV2}");
		}
	
	    resolveDataBinding(LEETABLAMV2_PROPERTY_BINDINGS, leeTablaMV2, "leeTablaMV2", false, false);
		return leeTablaMV2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider15()  {
		if (solucionProvider15 == null) {
		    solucionProvider15 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider15}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER15_PROPERTY_BINDINGS, solucionProvider15, "solucionProvider15", false, false);
		return solucionProvider15;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosEspecificosProvider6()  {
		if (objetivosEspecificosProvider6 == null) {
		    objetivosEspecificosProvider6 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider6}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER6_PROPERTY_BINDINGS, objetivosEspecificosProvider6, "objetivosEspecificosProvider6", false, false);
		return objetivosEspecificosProvider6;
	}

	public String actionEvalua() {
	    // TODO: implement java method
	   
		return null;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos2 getLeeTablaObjetivos2()  {
		if (leeTablaObjetivos2 == null) {
		    leeTablaObjetivos2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos2)resolveExpression("#{LeeTablaObjetivos2}");
		}
	
	    resolveDataBinding(LEETABLAOBJETIVOS2_PROPERTY_BINDINGS, leeTablaObjetivos2, "leeTablaObjetivos2", false, false);
		return leeTablaObjetivos2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider16()  {
		if (solucionProvider16 == null) {
		    solucionProvider16 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider16}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER16_PROPERTY_BINDINGS, solucionProvider16, "solucionProvider16", false, false);
		return solucionProvider16;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.LeeTablaComponente getLeeTablaComponente()  {
		if (leeTablaComponente == null) {
		    leeTablaComponente = (caf.war.Interfases.wsclient.sfcmpc.services.leetablacomponente_wsd.LeeTablaComponente)resolveExpression("#{LeeTablaComponente}");
		}
	
	    resolveDataBinding(LEETABLACOMPONENTE_PROPERTY_BINDINGS, leeTablaComponente, "leeTablaComponente", false, false);
		return leeTablaComponente;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider17()  {
		if (solucionProvider17 == null) {
		    solucionProvider17 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider17}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER17_PROPERTY_BINDINGS, solucionProvider17, "solucionProvider17", false, false);
		return solucionProvider17;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEspecificosProvider4()  {
		if (especificosProvider4 == null) {
		    especificosProvider4 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EspecificosProvider4}");
		}
	
	    resolveDataBinding(ESPECIFICOSPROVIDER4_PROPERTY_BINDINGS, especificosProvider4, "especificosProvider4", false, false);
		return especificosProvider4;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstrategiaProvider2()  {
		if (estrategiaProvider2 == null) {
		    estrategiaProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstrategiaProvider2}");
		}
	
	    resolveDataBinding(ESTRATEGIAPROVIDER2_PROPERTY_BINDINGS, estrategiaProvider2, "estrategiaProvider2", false, false);
		return estrategiaProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosXactividadProvider()  {
		if (objetivosXactividadProvider == null) {
		    objetivosXactividadProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosXactividadProvider}");
		}
	
	    resolveDataBinding(OBJETIVOSXACTIVIDADPROVIDER_PROPERTY_BINDINGS, objetivosXactividadProvider, "objetivosXactividadProvider", false, false);
		return objetivosXactividadProvider;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct2 getLeeTablaTipAct2()  {
		if (leeTablaTipAct2 == null) {
		    leeTablaTipAct2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct2)resolveExpression("#{LeeTablaTipAct2}");
		}
	
	    resolveDataBinding(LEETABLATIPACT2_PROPERTY_BINDINGS, leeTablaTipAct2, "leeTablaTipAct2", false, false);
		return leeTablaTipAct2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider18()  {
		if (solucionProvider18 == null) {
		    solucionProvider18 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider18}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER18_PROPERTY_BINDINGS, solucionProvider18, "solucionProvider18", false, false);
		return solucionProvider18;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria2 getLeeTablaCategoria2()  {
		if (leeTablaCategoria2 == null) {
		    leeTablaCategoria2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria2)resolveExpression("#{LeeTablaCategoria2}");
		}
	
	    resolveDataBinding(LEETABLACATEGORIA2_PROPERTY_BINDINGS, leeTablaCategoria2, "leeTablaCategoria2", false, false);
		return leeTablaCategoria2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider19()  {
		if (solucionProvider19 == null) {
		    solucionProvider19 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider19}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER19_PROPERTY_BINDINGS, solucionProvider19, "solucionProvider19", false, false);
		return solucionProvider19;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar2 getLeeTablaTipoPar2()  {
		if (leeTablaTipoPar2 == null) {
		    leeTablaTipoPar2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar2)resolveExpression("#{LeeTablaTipoPar2}");
		}
	
	    resolveDataBinding(LEETABLATIPOPAR2_PROPERTY_BINDINGS, leeTablaTipoPar2, "leeTablaTipoPar2", false, false);
		return leeTablaTipoPar2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider20()  {
		if (solucionProvider20 == null) {
		    solucionProvider20 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider20}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER20_PROPERTY_BINDINGS, solucionProvider20, "solucionProvider20", false, false);
		return solucionProvider20;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea2 getLeeTablaArea2()  {
		if (leeTablaArea2 == null) {
		    leeTablaArea2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea2)resolveExpression("#{LeeTablaArea2}");
		}
	
	    resolveDataBinding(LEETABLAAREA2_PROPERTY_BINDINGS, leeTablaArea2, "leeTablaArea2", false, false);
		return leeTablaArea2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider21()  {
		if (solucionProvider21 == null) {
		    solucionProvider21 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider21}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER21_PROPERTY_BINDINGS, solucionProvider21, "solucionProvider21", false, false);
		return solucionProvider21;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel2 getLeeTablaNivel2()  {
		if (leeTablaNivel2 == null) {
		    leeTablaNivel2 = (caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel2)resolveExpression("#{LeeTablaNivel2}");
		}
	
	    resolveDataBinding(LEETABLANIVEL2_PROPERTY_BINDINGS, leeTablaNivel2, "leeTablaNivel2", false, false);
		return leeTablaNivel2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider22()  {
		if (solucionProvider22 == null) {
		    solucionProvider22 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider22}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER22_PROPERTY_BINDINGS, solucionProvider22, "solucionProvider22", false, false);
		return solucionProvider22;
	}
	
}