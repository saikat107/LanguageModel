<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( HeaderValueRouter .class ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>