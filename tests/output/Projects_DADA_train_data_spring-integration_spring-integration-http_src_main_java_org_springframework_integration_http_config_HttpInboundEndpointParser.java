<METHOD_START> public void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return org.w3c.dom.Element . boolean ( STRING ) || org.w3c.dom.Element . boolean ( STRING ) ? HttpRequestHandlingController .class . java.lang.String ( ) : HttpRequestHandlingMessagingGateway .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.integration.http.config.AbstractBeanDefinition , ParserContext org.springframework.integration.http.config.ParserContext )			throws org.springframework.integration.http.config.BeanDefinitionStoreException { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.integration.http.config.AbstractBeanDefinition , org.springframework.integration.http.config.ParserContext ) ; if ( ! this . boolean && ! org.w3c.dom.Element . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = BeanDefinitionReaderUtils . generateBeanName ( org.springframework.integration.http.config.AbstractBeanDefinition , org.springframework.integration.http.config.ParserContext . getRegistry ( ) ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.http.config.ParserContext , BeanDefinitionBuilder org.springframework.integration.http.config.BeanDefinitionBuilder ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addConstructorArgValue ( this . boolean ) ; java.lang.String java.lang.String = this . java.lang.String ( ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { if ( this . boolean ) { org.springframework.integration.http.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } else { java.lang.String = IntegrationNamespaceUtils . createDirectChannel ( org.w3c.dom.Element , org.springframework.integration.http.config.ParserContext ) ; } } org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; BeanDefinition org.springframework.integration.http.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( STRING , org.w3c.dom.Element ) ; if ( org.springframework.integration.http.config.BeanDefinition != null ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinition ) ; } java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedMap < java.lang.String , java.lang.Object > org.springframework.integration.http.config.ManagedMap<java.lang.String,java.lang.Object> = new ManagedMap < java.lang.String , java.lang.Object > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( NAME_ATTRIBUTE ) ; BeanDefinition org.springframework.integration.http.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( IntegrationNamespaceUtils . EXPRESSION_ATTRIBUTE , org.w3c.dom.Element ) ; if ( org.springframework.integration.http.config.BeanDefinition != null ) { org.springframework.integration.http.config.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.integration.http.config.BeanDefinition ) ; } } org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.ManagedMap<java.lang.String,java.lang.Object> ) ; } if ( this . boolean ) { IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; } else { IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; } BeanDefinition org.springframework.integration.http.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefinitionFromValueOrExpression ( STRING , STRING , org.springframework.integration.http.config.ParserContext , org.w3c.dom.Element , false ) ; if ( org.springframework.integration.http.config.BeanDefinition != null ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinition ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( boolean || boolean ) { org.springframework.integration.http.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.springframework.integration.http.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; } org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } else { BeanDefinitionBuilder org.springframework.integration.http.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DefaultHttpHeaderMapper .class ) ; org.springframework.integration.http.config.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; if ( boolean ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } if ( boolean ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } BeanDefinition org.springframework.integration.http.config.BeanDefinition = org.springframework.integration.http.config.BeanDefinition ( org.w3c.dom.Element ) ; org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinition ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { BeanDefinitionBuilder org.springframework.integration.http.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CrossOrigin .class ) ; java.lang.String [] java.lang.String[] = { STRING , STRING , STRING , STRING , STRING } ; for ( java.lang.String java.lang.String : java.lang.String[] ) { IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , true ) ; org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; BeanDefinition org.springframework.integration.http.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( STRING , org.w3c.dom.Element ) ; if ( org.springframework.integration.http.config.BeanDefinition == null ) { org.springframework.integration.http.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( STRING , org.w3c.dom.Element ) ; } if ( org.springframework.integration.http.config.BeanDefinition != null ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinition ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , IntegrationNamespaceUtils . AUTO_STARTUP ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , IntegrationNamespaceUtils . PHASE ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return this . boolean ? STRING : STRING ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.config.BeanDefinition org.springframework.integration.http.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinitionBuilder org.springframework.integration.http.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( RequestMapping .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String . java.lang.String ( ) ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { for ( java.lang.String java.lang.String : new java.lang.String [] { STRING , STRING , STRING , STRING } ) { IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; } } return org.springframework.integration.http.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) ; }  <METHOD_END>
