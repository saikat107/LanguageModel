<METHOD_START> @ java.lang.Override protected final java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.integration.config.xml.AbstractBeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext )			throws org.springframework.integration.config.xml.BeanDefinitionStoreException { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) ; if ( ! org.w3c.dom.Element . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } else if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = BeanDefinitionReaderUtils . generateBeanName ( org.springframework.integration.config.xml.AbstractBeanDefinition , org.springframework.integration.config.xml.ParserContext . getRegistry ( ) , org.springframework.integration.config.xml.ParserContext . isNested ( ) ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final org.springframework.integration.config.xml.AbstractBeanDefinition org.springframework.integration.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = this . java.lang.String ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext ) ; } AbstractBeanDefinition org.springframework.integration.config.xml.AbstractBeanDefinition = org.springframework.integration.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext , java.lang.String ) ; MutablePropertyValues org.springframework.integration.config.xml.MutablePropertyValues = org.springframework.integration.config.xml.AbstractBeanDefinition . getPropertyValues ( ) ; if ( ! org.springframework.integration.config.xml.ParserContext . isNested ( ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( IntegrationNamespaceUtils . AUTO_STARTUP ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.MutablePropertyValues . add ( STRING , new TypedStringValue ( java.lang.String ) ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( IntegrationNamespaceUtils . PHASE ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.MutablePropertyValues . add ( STRING , new TypedStringValue ( java.lang.String ) ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( IntegrationNamespaceUtils . ROLE ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( ! StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } IntegrationNamespaceUtils . putLifecycleInRole ( java.lang.String , org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) , org.springframework.integration.config.xml.ParserContext ) ; } } return org.springframework.integration.config.xml.AbstractBeanDefinition ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { if ( org.springframework.integration.config.xml.ParserContext . isNested ( ) ) { return null ; } return IntegrationNamespaceUtils . createDirectChannel ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.integration.config.xml.AbstractBeanDefinition org.springframework.integration.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext , java.lang.String java.lang.String );  <METHOD_END>
