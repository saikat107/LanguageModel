<METHOD_START> @ java.lang.Override protected org.springframework.integration.xml.config.BeanDefinitionBuilder org.springframework.integration.xml.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.xml.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.xml.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( XPathMessageSplitter .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; org.w3c.dom.NodeList org.w3c.dom.NodeList = org.w3c.dom.Element . org.w3c.dom.NodeList ( org.w3c.dom.Element . java.lang.String ( ) , STRING ) ; Assert . isTrue ( org.w3c.dom.NodeList . int ( ) <= NUMBER , STRING ) ; boolean boolean = org.w3c.dom.NodeList . int ( ) == NUMBER ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; Assert . isTrue ( boolean ^ boolean , STRING ) ; if ( boolean ) { org.w3c.dom.Element org.w3c.dom.Element = ( org.w3c.dom.Element ) org.w3c.dom.NodeList . org.w3c.dom.Node ( NUMBER ) ; org.springframework.integration.xml.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; XPathExpressionParser . parseAndPopulateNamespaceMap ( org.w3c.dom.Element , org.springframework.integration.xml.config.ParserContext , org.springframework.integration.xml.config.BeanDefinitionBuilder ) ; } else { org.springframework.integration.xml.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.xml.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.xml.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.xml.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.xml.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.xml.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.xml.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.xml.config.BeanDefinitionBuilder ; }  <METHOD_END>
