<METHOD_START> @ java.lang.Override protected org.springframework.integration.groovy.config.BeanDefinitionBuilder org.springframework.integration.groovy.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.groovy.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.groovy.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( GroovyControlBusFactoryBean .class ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.groovy.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.groovy.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.groovy.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.groovy.config.BeanDefinitionBuilder ; }  <METHOD_END>