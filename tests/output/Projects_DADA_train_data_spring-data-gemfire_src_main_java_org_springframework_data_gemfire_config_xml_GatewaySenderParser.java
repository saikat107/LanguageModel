<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return GatewaySenderFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.gemfire.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ParsingUtils . CACHE_REF_ATTRIBUTE_NAME ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgReference ( SpringUtils . defaultIfEmpty ( java.lang.String , GemfireConstants . DEFAULT_GEMFIRE_CACHE_NAME ) ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , NAME_ATTRIBUTE ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , ParsingUtils . parseRefOrNestedBeanDeclaration ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ) ; } org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , ParsingUtils . parseRefOrSingleNestedBeanDeclaration ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ) ; } ParsingUtils . parseTransportFilters ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; if ( ! StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( NAME_ATTRIBUTE ) ) ) { if ( org.w3c.dom.Element . org.w3c.dom.Node ( ) . java.lang.String ( ) . boolean ( STRING ) ) { org.w3c.dom.Element org.w3c.dom.Element = ( org.w3c.dom.Element ) org.w3c.dom.Element . org.w3c.dom.Node ( ) ; java.lang.String java.lang.String = ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( NAME_ATTRIBUTE ) ) ? org.w3c.dom.Element . java.lang.String ( NAME_ATTRIBUTE ) : org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) ) ; int int = NUMBER ; java.lang.String java.lang.String = ( java.lang.String + STRING + int ) ; while ( org.springframework.data.gemfire.config.xml.ParserContext . getRegistry ( ) . isBeanNameInUse ( java.lang.String ) ) { java.lang.String = ( java.lang.String + STRING + ( ++ int ) ) ; } org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } } }  <METHOD_END>
