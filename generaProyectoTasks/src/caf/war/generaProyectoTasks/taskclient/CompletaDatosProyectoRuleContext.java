package caf.war.generaProyectoTasks.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "CompletaDatosProyectoRuleContext")
@SessionScoped
@DTManagedBean(displayName = "Completa Datos Proyecto Rule Context", beanType = BeanType.DEFAULT)
public class CompletaDatosProyectoRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}