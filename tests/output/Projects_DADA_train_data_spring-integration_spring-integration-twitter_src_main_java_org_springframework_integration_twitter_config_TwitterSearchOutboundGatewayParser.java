<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.twitter.config.BeanDefinitionBuilder org.springframework.integration.twitter.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.twitter.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.twitter.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( TwitterSearchOutboundGateway .class ) ; org.springframework.integration.twitter.config.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { BeanDefinition org.springframework.integration.twitter.config.BeanDefinition = new RootBeanDefinition ( ExpressionFactoryBean .class ) ; org.springframework.integration.twitter.config.BeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( java.lang.String ) ; org.springframework.integration.twitter.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.twitter.config.BeanDefinition ) ; } IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.twitter.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.twitter.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; return org.springframework.integration.twitter.config.BeanDefinitionBuilder ; }  <METHOD_END>
