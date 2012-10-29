
package org.mule.module.wsdlproc.process;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.process.ProcessCallback;
import org.mule.api.process.ProcessInterceptor;
import org.mule.api.processor.MessageProcessor;

@Generated(value = "Mule DevKit Version 3.3.2-SNAPSHOT", date = "2012-09-27T10:38:09-07:00", comments = "Build master.1328.152292b")
public class ProcessCallbackProcessInterceptor<T, O >implements ProcessInterceptor<T, O>
{


    public T execute(ProcessCallback<T, O> processCallback, O object, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processCallback.process(object);
    }

}
