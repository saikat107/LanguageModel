<METHOD_START> @ java.lang.Override protected org.springframework.integration.jdbc.config.BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jdbc.config.ParserContext ) { final BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( StoredProcOutboundGateway .class ) ; final BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder = StoredProcParserUtils . getStoredProcExecutorBuilder ( org.w3c.dom.Element , org.springframework.integration.jdbc.config.ParserContext ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; final ManagedMap < java.lang.String , BeanMetadataElement > org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> = StoredProcParserUtils . getReturningResultsetBeanDefinitions ( org.w3c.dom.Element , org.springframework.integration.jdbc.config.ParserContext ) ; if ( ! org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> . isEmpty ( ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> ) ; } final AbstractBeanDefinition org.springframework.integration.jdbc.config.AbstractBeanDefinition = org.springframework.integration.jdbc.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; final java.lang.String java.lang.String = this . resolveId ( org.w3c.dom.Element , org.springframework.integration.jdbc.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) , org.springframework.integration.jdbc.config.ParserContext ) ; final java.lang.String java.lang.String = java.lang.String + STRING ; org.springframework.integration.jdbc.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.integration.jdbc.config.AbstractBeanDefinition , java.lang.String ) ) ; org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } return org.springframework.integration.jdbc.config.BeanDefinitionBuilder ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
