<METHOD_START> @ java.lang.Override protected org.springframework.integration.jpa.config.xml.BeanMetadataElement org.springframework.integration.jpa.config.xml.BeanMetadataElement ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jpa.config.xml.ParserContext ) { final BeanDefinitionBuilder org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( JpaPollingChannelAdapter .class ) ; final BeanDefinitionBuilder org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder = JpaParserUtils . getJpaExecutorBuilder ( org.w3c.dom.Element , org.springframework.integration.jpa.config.xml.ParserContext ) ; BeanDefinition org.springframework.integration.jpa.config.xml.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefinitionFromValueOrExpression ( STRING , STRING , org.springframework.integration.jpa.config.xml.ParserContext , org.w3c.dom.Element , false ) ; if ( org.springframework.integration.jpa.config.xml.BeanDefinition != null ) { org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.jpa.config.xml.BeanDefinition ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; final BeanDefinition org.springframework.integration.jpa.config.xml.BeanDefinition = org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; final java.lang.String java.lang.String = this . resolveId ( org.w3c.dom.Element , org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) , org.springframework.integration.jpa.config.xml.ParserContext ) ; final java.lang.String java.lang.String = java.lang.String + STRING ; org.springframework.integration.jpa.config.xml.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.integration.jpa.config.xml.BeanDefinition , java.lang.String ) ) ; org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; return org.springframework.integration.jpa.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>