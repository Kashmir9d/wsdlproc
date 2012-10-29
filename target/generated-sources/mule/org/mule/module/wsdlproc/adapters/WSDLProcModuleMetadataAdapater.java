
package org.mule.module.wsdlproc.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.module.wsdlproc.WSDLProcModule;


/**
 * A <code>WSDLProcModuleMetadataAdapater</code> is a wrapper around {@link WSDLProcModule } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.2-SNAPSHOT", date = "2012-09-27T10:38:09-07:00", comments = "Build master.1328.152292b")
public class WSDLProcModuleMetadataAdapater
    extends WSDLProcModuleCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "wsdlproc";
    private final static String MODULE_VERSION = "1.0";
    private final static String DEVKIT_VERSION = "3.3.2-SNAPSHOT";
    private final static String DEVKIT_BUILD = "master.1328.152292b";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
