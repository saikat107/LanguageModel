<METHOD_START> @ java.lang.Override protected org.springframework.jdbc.config.AbstractBeanDefinition org.springframework.jdbc.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.jdbc.config.ParserContext ) { BeanDefinitionBuilder org.springframework.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DataSourceInitializer .class ) ; org.springframework.jdbc.config.BeanDefinitionBuilder . addPropertyReference ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; DatabasePopulatorConfigUtils . setDatabasePopulator ( org.w3c.dom.Element , org.springframework.jdbc.config.BeanDefinitionBuilder ) ; org.springframework.jdbc.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setSource ( org.springframework.jdbc.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; return org.springframework.jdbc.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
