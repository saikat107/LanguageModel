<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return GatewayReceiverFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.gemfire.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ParsingUtils . CACHE_REF_ATTRIBUTE_NAME ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgReference ( SpringUtils . defaultIfEmpty ( java.lang.String , GemfireConstants . DEFAULT_GEMFIRE_CACHE_NAME ) ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . setLazyInit ( false ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . parseTransportFilters ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; }  <METHOD_END>
