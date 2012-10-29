
package org.mule.module.wsdlproc.adapters;

import javax.annotation.Generated;
import org.mule.api.Capabilities;
import org.mule.api.Capability;
import org.mule.module.wsdlproc.WSDLProcModule;


/**
 * A <code>WSDLProcModuleCapabilitiesAdapter</code> is a wrapper around {@link WSDLProcModule } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.2-SNAPSHOT", date = "2012-09-27T10:38:09-07:00", comments = "Build master.1328.152292b")
public class WSDLProcModuleCapabilitiesAdapter
    extends WSDLProcModule
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
