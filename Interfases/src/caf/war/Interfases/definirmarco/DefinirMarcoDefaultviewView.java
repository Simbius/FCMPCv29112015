/**
 * 
 */
package caf.war.Interfases.definirmarco;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "DefinirMarcoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "DefinirMarco/default", beanType = BeanType.PAGE)
public class DefinirMarcoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.Interfases.definirmarco.DefinirMarco definirMarco = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.GeneraMLogico generaMLogico = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivoProvider2 = null;
	private static final String[][] OBJETIVOPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivoProvider2.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub$Objetivo"},
		{"#{ObjetivoProvider2.rowVariable}", "objetivo"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosEspecificosProvider4 = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider4.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.SFCMPCServicesGeneraMLogico_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider4.rowVariable}", "objetivosEspecifico"},
	};
	private static final String[][] GENERAMLOGICO_PROPERTY_BINDINGS = new String[][] {
		{"#{generaMLogico.authCredentials.authenticationMethod}", "1"},
		{"#{generaMLogico.authCredentials.requiresAuth}", "true"},
		{"#{generaMLogico.autoRefresh}", "false"},
		{"#{generaMLogico.parameters.generaMLogico.generaMLogico.marcoLogico.objetivo}", "#{DefinirMarcoDefaultviewView.objetivoProvider2.array}"},
		{"#{generaMLogico.parameters.generaMLogico.generaMLogico.marcoLogico.objetivosEspecificos}", "#{DefinirMarcoDefaultviewView.objetivosEspecificosProvider4.array}"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.ProcesaTablas procesaTablas = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider especificosProvider = null;
	private static final String[][] ESPECIFICOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EspecificosProvider.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub$Especificos"},
		{"#{EspecificosProvider.rowVariable}", "especifico"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider estrategiaProvider = null;
	private static final String[][] ESTRATEGIAPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EstrategiaProvider.rowType}", "caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.SFCMPCServicesProcesaTablas_WSDStub$Estrategia"},
		{"#{EstrategiaProvider.rowVariable}", "estrategia"},
	};
	private static final String[][] PROCESATABLAS_PROPERTY_BINDINGS = new String[][] {
		{"#{procesaTablas.authCredentials.authenticationMethod}", "1"},
		{"#{procesaTablas.authCredentials.requiresAuth}", "true"},
		{"#{procesaTablas.autoRefresh}", "false"},
		{"#{procesaTablas.parameters.procesaTablas.procesaTablas.especificos}", "#{DefinirMarcoDefaultviewView.especificosProvider.array}"},
		{"#{procesaTablas.parameters.procesaTablas.procesaTablas.estrategia}", "#{DefinirMarcoDefaultviewView.estrategiaProvider.array}"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.LeeTablaCol leeTablaCol = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider = null;
	private static final String[][] SOLUCIONPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider.rowVariable}", "solucion"},
		{"#{solucionProvider.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider.array}", "#{DefinirMarcoDefaultviewView.leeTablaCol.result.leeTablaColOutput.rtabla.solucion}"},
	};
	private static final String[][] LEETABLACOL_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaCol.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaCol.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaCol.autoRefresh}", "true"},
		{"#{leeTablaCol.parameters.leeTablaColInput.leeTablaColInput.tablaNombre}", "marcoLogico"},
		{"#{leeTablaCol.parameters.leeTablaColInput.leeTablaColInput.campo}", "kpi"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV leeTablaMV = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider2 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider3 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider4 = null;
	private static final String[][] LEETABLAMV_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaMV.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaMV.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaMV.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider2.rowVariable}", "solucion"},
		{"#{solucionProvider2.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.array}", "#{DefinirMarcoDefaultviewView.leeTablaMV.result.leeTablaMVResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider3.rowVariable}", "solucion"},
		{"#{solucionProvider3.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.array}", "#{DefinirMarcoDefaultviewView.leeTablaCol.result.leeTablaColOutput.rtabla.solucion}"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo leeTablaObjetivo = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos leeTablaObjetivos = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider5 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider6 = null;
	private static final String[][] LEETABLAOBJETIVOS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaObjetivos.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaObjetivos.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaObjetivos.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAOBJETIVO_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaObjetivo.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaObjetivo.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaObjetivo.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER5_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider5.rowVariable}", "solucion"},
		{"#{solucionProvider5.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.array}", "#{DefinirMarcoDefaultviewView.leeTablaObjetivo.result.leeTablaObjetivoResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER6_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider6.rowVariable}", "solucion"},
		{"#{solucionProvider6.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.array}", "#{DefinirMarcoDefaultviewView.leeTablaObjetivos.result.leeTablaObjetivosResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider4.rowVariable}", "solucion"},
		{"#{solucionProvider4.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.array}", "#{DefinirMarcoDefaultviewView.leeTablaMV.result.leeTablaMVResponse.rtabla.solucion}"},
	};
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.LeeTablaEstrategia leeTablaEstrategia = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct leeTablaTipAct = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar leeTablaTipoPar = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel leeTablaNivel = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria leeTablaCategoria = null;
	private transient caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea leeTablaArea = null;
	private static final String[][] LEETABLAAREA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaArea.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaArea.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaArea.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLACATEGORIA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaCategoria.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaCategoria.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaCategoria.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLANIVEL_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaNivel.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaNivel.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaNivel.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLATIPOPAR_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaTipoPar.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaTipoPar.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaTipoPar.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLATIPACT_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaTipAct.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaTipAct.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaTipAct.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAESTRATEGIA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaEstrategia.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaEstrategia.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaEstrategia.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider7 = null;
	private static final String[][] SOLUCIONPROVIDER7_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider7.rowVariable}", "solucion"},
		{"#{solucionProvider7.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.array}", "#{DefinirMarcoDefaultviewView.leeTablaEstrategia.result.leeTablaEstrategiaResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider8 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider9 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider10 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider11 = null;
	private static final String[][] SOLUCIONPROVIDER8_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider8.rowVariable}", "solucion"},
		{"#{solucionProvider8.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider8.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider8.array}", "#{DefinirMarcoDefaultviewView.leeTablaTipAct.result.leeTablaTipActResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER9_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider9.rowVariable}", "solucion"},
		{"#{solucionProvider9.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider9.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider9.array}", "#{DefinirMarcoDefaultviewView.leeTablaTipoPar.result.leeTablaTipoParResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER10_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider10.rowVariable}", "solucion"},
		{"#{solucionProvider10.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider10.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider10.array}", "#{DefinirMarcoDefaultviewView.leeTablaCategoria.result.leeTablaCategoriaResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER11_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider11.rowVariable}", "solucion"},
		{"#{solucionProvider11.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider11.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider11.array}", "#{DefinirMarcoDefaultviewView.leeTablaArea.result.leeTablaAreaResponse.rtabla.solucion}"},
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

	public caf.war.Interfases.definirmarco.DefinirMarco getDefinirMarco()  {
		if (definirMarco == null) {
		    definirMarco = (caf.war.Interfases.definirmarco.DefinirMarco)resolveExpression("#{DefinirMarco}");
		}
		return definirMarco;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.GeneraMLogico getGeneraMLogico()  {
		if (generaMLogico == null) {
		    generaMLogico = (caf.war.Interfases.wsclient.sfcmpc.services.generamlogico_wsd.GeneraMLogico)resolveExpression("#{GeneraMLogico}");
		}
	
	    resolveDataBinding(GENERAMLOGICO_PROPERTY_BINDINGS, generaMLogico, "generaMLogico", false, false);
		return generaMLogico;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivoProvider2()  {
		if (objetivoProvider2 == null) {
		    objetivoProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivoProvider2}");
		}
	
	    resolveDataBinding(OBJETIVOPROVIDER2_PROPERTY_BINDINGS, objetivoProvider2, "objetivoProvider2", false, false);
		return objetivoProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosEspecificosProvider4()  {
		if (objetivosEspecificosProvider4 == null) {
		    objetivosEspecificosProvider4 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider4}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER4_PROPERTY_BINDINGS, objetivosEspecificosProvider4, "objetivosEspecificosProvider4", false, false);
		return objetivosEspecificosProvider4;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.ProcesaTablas getProcesaTablas()  {
		if (procesaTablas == null) {
		    procesaTablas = (caf.war.Interfases.wsclient.sfcmpc.services.procesatablas_wsd.ProcesaTablas)resolveExpression("#{ProcesaTablas}");
		}
	
	    resolveDataBinding(PROCESATABLAS_PROPERTY_BINDINGS, procesaTablas, "procesaTablas", false, false);
		return procesaTablas;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEspecificosProvider()  {
		if (especificosProvider == null) {
		    especificosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EspecificosProvider}");
		}
	
	    resolveDataBinding(ESPECIFICOSPROVIDER_PROPERTY_BINDINGS, especificosProvider, "especificosProvider", false, false);
		return especificosProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstrategiaProvider()  {
		if (estrategiaProvider == null) {
		    estrategiaProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstrategiaProvider}");
		}
	
	    resolveDataBinding(ESTRATEGIAPROVIDER_PROPERTY_BINDINGS, estrategiaProvider, "estrategiaProvider", false, false);
		return estrategiaProvider;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.LeeTablaCol getLeeTablaCol()  {
		if (leeTablaCol == null) {
		    leeTablaCol = (caf.war.Interfases.wsclient.sfcmpc.services.leetablacol_wsd.LeeTablaCol)resolveExpression("#{LeeTablaCol}");
		}
	
	    resolveDataBinding(LEETABLACOL_PROPERTY_BINDINGS, leeTablaCol, "leeTablaCol", false, false);
		return leeTablaCol;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider()  {
		if (solucionProvider == null) {
		    solucionProvider = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER_PROPERTY_BINDINGS, solucionProvider, "solucionProvider", false, false);
		return solucionProvider;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV getLeeTablaMV()  {
		if (leeTablaMV == null) {
		    leeTablaMV = (caf.war.Interfases.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV)resolveExpression("#{LeeTablaMV}");
		}
	
	    resolveDataBinding(LEETABLAMV_PROPERTY_BINDINGS, leeTablaMV, "leeTablaMV", false, false);
		return leeTablaMV;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider2()  {
		if (solucionProvider2 == null) {
		    solucionProvider2 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider2}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER2_PROPERTY_BINDINGS, solucionProvider2, "solucionProvider2", false, false);
		return solucionProvider2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider3()  {
		if (solucionProvider3 == null) {
		    solucionProvider3 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider3}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER3_PROPERTY_BINDINGS, solucionProvider3, "solucionProvider3", false, false);
		return solucionProvider3;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider4()  {
		if (solucionProvider4 == null) {
		    solucionProvider4 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider4}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER4_PROPERTY_BINDINGS, solucionProvider4, "solucionProvider4", false, false);
		return solucionProvider4;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo getLeeTablaObjetivo()  {
		if (leeTablaObjetivo == null) {
		    leeTablaObjetivo = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo)resolveExpression("#{LeeTablaObjetivo}");
		}
	
	    resolveDataBinding(LEETABLAOBJETIVO_PROPERTY_BINDINGS, leeTablaObjetivo, "leeTablaObjetivo", false, false);
		return leeTablaObjetivo;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos getLeeTablaObjetivos()  {
		if (leeTablaObjetivos == null) {
		    leeTablaObjetivos = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos)resolveExpression("#{LeeTablaObjetivos}");
		}
	
	    resolveDataBinding(LEETABLAOBJETIVOS_PROPERTY_BINDINGS, leeTablaObjetivos, "leeTablaObjetivos", false, false);
		return leeTablaObjetivos;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider5()  {
		if (solucionProvider5 == null) {
		    solucionProvider5 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider5}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER5_PROPERTY_BINDINGS, solucionProvider5, "solucionProvider5", false, false);
		return solucionProvider5;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider6()  {
		if (solucionProvider6 == null) {
		    solucionProvider6 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider6}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER6_PROPERTY_BINDINGS, solucionProvider6, "solucionProvider6", false, false);
		return solucionProvider6;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.LeeTablaEstrategia getLeeTablaEstrategia()  {
		if (leeTablaEstrategia == null) {
		    leeTablaEstrategia = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaestrategia_wsd.LeeTablaEstrategia)resolveExpression("#{LeeTablaEstrategia}");
		}
	
	    resolveDataBinding(LEETABLAESTRATEGIA_PROPERTY_BINDINGS, leeTablaEstrategia, "leeTablaEstrategia", false, false);
		return leeTablaEstrategia;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct getLeeTablaTipAct()  {
		if (leeTablaTipAct == null) {
		    leeTablaTipAct = (caf.war.Interfases.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct)resolveExpression("#{LeeTablaTipAct}");
		}
	
	    resolveDataBinding(LEETABLATIPACT_PROPERTY_BINDINGS, leeTablaTipAct, "leeTablaTipAct", false, false);
		return leeTablaTipAct;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar getLeeTablaTipoPar()  {
		if (leeTablaTipoPar == null) {
		    leeTablaTipoPar = (caf.war.Interfases.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar)resolveExpression("#{LeeTablaTipoPar}");
		}
	
	    resolveDataBinding(LEETABLATIPOPAR_PROPERTY_BINDINGS, leeTablaTipoPar, "leeTablaTipoPar", false, false);
		return leeTablaTipoPar;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel getLeeTablaNivel()  {
		if (leeTablaNivel == null) {
		    leeTablaNivel = (caf.war.Interfases.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel)resolveExpression("#{LeeTablaNivel}");
		}
	
	    resolveDataBinding(LEETABLANIVEL_PROPERTY_BINDINGS, leeTablaNivel, "leeTablaNivel", false, false);
		return leeTablaNivel;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria getLeeTablaCategoria()  {
		if (leeTablaCategoria == null) {
		    leeTablaCategoria = (caf.war.Interfases.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria)resolveExpression("#{LeeTablaCategoria}");
		}
	
	    resolveDataBinding(LEETABLACATEGORIA_PROPERTY_BINDINGS, leeTablaCategoria, "leeTablaCategoria", false, false);
		return leeTablaCategoria;
	}

	public caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea getLeeTablaArea()  {
		if (leeTablaArea == null) {
		    leeTablaArea = (caf.war.Interfases.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea)resolveExpression("#{LeeTablaArea}");
		}
	
	    resolveDataBinding(LEETABLAAREA_PROPERTY_BINDINGS, leeTablaArea, "leeTablaArea", false, false);
		return leeTablaArea;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider7()  {
		if (solucionProvider7 == null) {
		    solucionProvider7 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider7}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER7_PROPERTY_BINDINGS, solucionProvider7, "solucionProvider7", false, false);
		return solucionProvider7;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider8()  {
		if (solucionProvider8 == null) {
		    solucionProvider8 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider8}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER8_PROPERTY_BINDINGS, solucionProvider8, "solucionProvider8", false, false);
		return solucionProvider8;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider9()  {
		if (solucionProvider9 == null) {
		    solucionProvider9 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider9}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER9_PROPERTY_BINDINGS, solucionProvider9, "solucionProvider9", false, false);
		return solucionProvider9;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider10()  {
		if (solucionProvider10 == null) {
		    solucionProvider10 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider10}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER10_PROPERTY_BINDINGS, solucionProvider10, "solucionProvider10", false, false);
		return solucionProvider10;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider11()  {
		if (solucionProvider11 == null) {
		    solucionProvider11 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider11}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER11_PROPERTY_BINDINGS, solucionProvider11, "solucionProvider11", false, false);
		return solucionProvider11;
	}
	
}