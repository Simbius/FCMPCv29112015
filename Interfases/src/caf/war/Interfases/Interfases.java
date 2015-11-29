/**
 * 
 */
package caf.war.Interfases;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */
@ManagedBean(name = "Interfases")
@ApplicationScoped
@DTManagedBean(displayName = "Interfases", beanType = BeanType.APPLICATION)
public class Interfases extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Interfases()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "Interfases" );
	}
}