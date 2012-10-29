
package org.mule.module.wsdlproc.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.context.MuleContextAware;
import org.mule.module.wsdlproc.WSDLProcModule;


/**
 * A <code>WSDLProcModuleInjectionAdapter</code> is a wrapper around {@link WSDLProcModule } that allows the injection of several Mule facilities when a MuleContext is set.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.2-SNAPSHOT", date = "2012-09-27T10:38:09-07:00", comments = "Build master.1328.152292b")
public class WSDLProcModuleInjectionAdapter
    extends WSDLProcModuleProcessAdapter
    implements MuleContextAware
{


    @Override
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

}
