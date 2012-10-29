
package org.mule.module.wsdlproc.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.process.ProcessAdapter;
import org.mule.api.process.ProcessCallback;
import org.mule.api.process.ProcessTemplate;
import org.mule.api.process.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.module.wsdlproc.WSDLProcModule;


/**
 * A <code>WSDLProcModuleProcessAdapter</code> is a wrapper around {@link WSDLProcModule } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.2-SNAPSHOT", date = "2012-09-27T10:38:09-07:00", comments = "Build master.1328.152292b")
public class WSDLProcModuleProcessAdapter
    extends WSDLProcModuleLifecycleAdapter
    implements ProcessAdapter<WSDLProcModuleCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, WSDLProcModuleCapabilitiesAdapter> getProcessTemplate() {
        final WSDLProcModuleCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,WSDLProcModuleCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, WSDLProcModuleCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
