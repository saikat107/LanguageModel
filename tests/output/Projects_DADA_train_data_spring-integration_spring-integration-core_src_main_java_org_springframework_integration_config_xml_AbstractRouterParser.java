<METHOD_START> @ java.lang.Override protected final org.springframework.integration.config.xml.BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( RouterFactoryBean .class ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) && StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; BeanDefinition org.springframework.integration.config.xml.BeanDefinition = this . org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinition ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanDefinition org.springframework.integration.config.xml.BeanDefinition = this . org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext ) ; if ( org.springframework.integration.config.xml.BeanDefinition != null ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedMap < java.lang.String , java.lang.String > org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> = new ManagedMap < java.lang.String , java.lang.String > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( this . java.lang.String ( ) ) ; org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> . put ( java.lang.String , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } org.springframework.integration.config.xml.BeanDefinition . getPropertyValues ( ) . add ( STRING , org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> ) ; } } return org.springframework.integration.config.xml.BeanDefinition ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext );  <METHOD_END>