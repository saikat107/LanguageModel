<METHOD_START> @ java.lang.Override protected org.springframework.integration.gemfire.config.xml.AbstractBeanDefinition org.springframework.integration.gemfire.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.gemfire.config.xml.ParserContext , java.lang.String java.lang.String ) { BeanDefinitionBuilder org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ContinuousQueryMessageProducer .class ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , java.lang.String ) ; if ( ! org.w3c.dom.Element . boolean ( java.lang.String ) ) { org.springframework.integration.gemfire.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } if ( ! org.w3c.dom.Element . boolean ( java.lang.String ) ) { org.springframework.integration.gemfire.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) ) ; org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) ) ; org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . addPropertyReference ( java.lang.String , java.lang.String ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; return org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
