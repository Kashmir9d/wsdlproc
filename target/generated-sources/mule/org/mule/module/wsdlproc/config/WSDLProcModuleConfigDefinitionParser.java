
package org.mule.module.wsdlproc.config;

import javax.annotation.Generated;
import org.mule.module.wsdlproc.adapters.WSDLProcModuleInjectionAdapter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.3.2-SNAPSHOT", date = "2012-09-27T10:38:09-07:00", comments = "Build master.1328.152292b")
public class WSDLProcModuleConfigDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(WSDLProcModuleInjectionAdapter.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, WSDLProcModuleInjectionAdapter.class);
        setDestroyMethodIfNeeded(builder, WSDLProcModuleInjectionAdapter.class);
        parseProperty(builder, element, "wsdlLocation", "wsdlLocation");
        parseProperty(builder, element, "operationName", "operationName");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
