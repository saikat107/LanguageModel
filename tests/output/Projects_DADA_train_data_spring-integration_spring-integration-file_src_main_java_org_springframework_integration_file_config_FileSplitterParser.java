<METHOD_START> @ java.lang.Override protected org.springframework.integration.file.config.BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.file.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( FileSplitter .class ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.file.config.BeanDefinitionBuilder ; }  <METHOD_END>
