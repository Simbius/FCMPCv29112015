/**
 * 
 */
package caf.war.generaProyectoTasks.completadatosproyectooverview;

/**
 * @author veztm
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "CompletaDatosProyectoOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "CompletaDatosProyectoOverview/default", beanType = BeanType.PAGE)
public class CompletaDatosProyectoOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{CompletaDatosProyectoOverview.taskID}" }, };
	private transient caf.war.generaProyectoTasks.completadatosproyectooverview.CompletaDatosProyectoOverview completaDatosProyectoOverview = null;
	private caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto completaDatosProyecto = null;
	private static final String[][] COMPLETADATOSPROYECTO_PROPERTY_BINDINGS = new String[][] {
		{"#{CompletaDatosProyecto.taskID}", "#{CompletaDatosProyectoOverview.taskID}"},
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

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.generaProyectoTasks.completadatosproyectooverview.CompletaDatosProyectoOverview getCompletaDatosProyectoOverview()  {
		if (completaDatosProyectoOverview == null) {
		    completaDatosProyectoOverview = (caf.war.generaProyectoTasks.completadatosproyectooverview.CompletaDatosProyectoOverview)resolveExpression("#{CompletaDatosProyectoOverview}");
		}
		return completaDatosProyectoOverview;
	}

	public caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto getCompletaDatosProyecto()  {
		if (completaDatosProyecto == null) {
		    completaDatosProyecto = (caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto)resolveExpression("#{CompletaDatosProyecto}");
		}
	
	    resolveDataBinding(COMPLETADATOSPROYECTO_PROPERTY_BINDINGS, completaDatosProyecto, "completaDatosProyecto", false, false);
		return completaDatosProyecto;
	}

}