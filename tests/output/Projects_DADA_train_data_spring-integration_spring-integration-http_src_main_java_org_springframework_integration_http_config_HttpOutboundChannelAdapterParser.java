<METHOD_START> @ java.lang.Override protected org.springframework.integration.http.config.AbstractBeanDefinition org.springframework.integration.http.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.http.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.http.config.BeanDefinitionBuilder ; boolean boolean = org.w3c.dom.Element . java.lang.String ( ) . boolean ( STRING ) ; if ( boolean ) { org.springframework.integration.http.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ReactiveHttpRequestExecutingMessageHandler .class ) ; } else { org.springframework.integration.http.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( HttpRequestExecutingMessageHandler .class ) ; } org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , false ) ; HttpAdapterParsingUtils . configureUrlConstructorArg ( org.w3c.dom.Element , org.springframework.integration.http.config.ParserContext , org.springframework.integration.http.config.BeanDefinitionBuilder ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; HttpAdapterParsingUtils . setHttpMethodOrExpression ( org.w3c.dom.Element , org.springframework.integration.http.config.ParserContext , org.springframework.integration.http.config.BeanDefinitionBuilder ) ; if ( boolean ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.http.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } } else { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { HttpAdapterParsingUtils . verifyNoRestTemplateAttributes ( org.w3c.dom.Element , org.springframework.integration.http.config.ParserContext ) ; org.springframework.integration.http.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } else { for ( java.lang.String java.lang.String : HttpAdapterParsingUtils . SYNC_REST_TEMPLATE_REFERENCE_ATTRIBUTES ) { IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; } } } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.http.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.springframework.integration.http.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; return null ; } org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } else if ( StringUtils . hasText ( java.lang.String ) ) { BeanDefinitionBuilder org.springframework.integration.http.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; org.springframework.integration.http.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.http.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; HttpAdapterParsingUtils . setExpectedResponseOrExpression ( org.w3c.dom.Element , org.springframework.integration.http.config.ParserContext , org.springframework.integration.http.config.BeanDefinitionBuilder ) ; HttpAdapterParsingUtils . configureUriVariableExpressions ( org.springframework.integration.http.config.BeanDefinitionBuilder , org.springframework.integration.http.config.ParserContext , org.w3c.dom.Element ) ; return org.springframework.integration.http.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
