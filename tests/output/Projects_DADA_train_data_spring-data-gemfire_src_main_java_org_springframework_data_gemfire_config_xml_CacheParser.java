<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return CacheFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.gemfire.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { super. doParse ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; void ( org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ( org.springframework.data.gemfire.config.xml.ParserContext ) ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING , STRING ) ; ParsingUtils . setPropertyReference ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; void ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyReference ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedList < java.lang.Object > org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> = new ManagedList < java.lang.Object > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> . add ( ParsingUtils . parseRefOrNestedBeanDeclaration ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ) ; } org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> ) ; } org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , ParsingUtils . parseRefOrNestedBeanDeclaration ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ) ; } org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { ParsingUtils . throwExceptionIfNotGemfireV7 ( org.w3c.dom.Element . java.lang.String ( ) , STRING , org.springframework.data.gemfire.config.xml.ParserContext ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , ParsingUtils . parseRefOrSingleNestedBeanDeclaration ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ) ; } void ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; void ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ( ParserContext org.springframework.data.gemfire.config.xml.ParserContext ) { return org.springframework.data.gemfire.config.xml.ParserContext . getRegistry ( ) ; }  <METHOD_END>
<METHOD_START> void void ( BeanDefinitionRegistry org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) { BeanDefinitionReaderUtils . registerWithGeneratedName ( BeanDefinitionBuilder . genericBeanDefinition ( CustomEditorBeanFactoryPostProcessor .class ) . getBeanDefinition ( ) , org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.gemfire.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING , STRING ) ; final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . isEmpty ( java.lang.String ) ) { void ( org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ( org.springframework.data.gemfire.config.xml.ParserContext ) , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> void void ( BeanDefinitionRegistry org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry , java.lang.String java.lang.String ) { BeanDefinitionReaderUtils . registerWithGeneratedName ( org.springframework.data.gemfire.config.xml.AbstractBeanDefinition ( java.lang.String ) , org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.gemfire.config.xml.AbstractBeanDefinition org.springframework.data.gemfire.config.xml.AbstractBeanDefinition ( java.lang.String java.lang.String ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( PdxDiskStoreAwareBeanFactoryPostProcessor .class ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; return org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ( org.w3c.dom.Element ) ; void ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element ) { if ( org.w3c.dom.Element != null ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CacheFactoryBean . CacheFactoryBean .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } return org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ; } return null ; }  <METHOD_END>
<METHOD_START> protected void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) {	}  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedList < java.lang.Object > org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> = new ManagedList < java.lang.Object > ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CacheFactoryBean . CacheFactoryBean .class ) ; org.w3c.dom.NamedNodeMap org.w3c.dom.NamedNodeMap = org.w3c.dom.Element . org.w3c.dom.NamedNodeMap ( ) ; ManagedMap < java.lang.String , java.lang.String > org.springframework.data.gemfire.config.xml.ManagedMap<java.lang.String,java.lang.String> = new ManagedMap < java.lang.String , java.lang.String > ( org.w3c.dom.NamedNodeMap . int ( ) ) ; for ( int int = NUMBER , int = org.w3c.dom.NamedNodeMap . int ( ) ; int < int ; int ++ ) { org.w3c.dom.Attr org.w3c.dom.Attr = ( org.w3c.dom.Attr ) org.w3c.dom.NamedNodeMap . org.w3c.dom.Node ( int ) ; org.springframework.data.gemfire.config.xml.ManagedMap<java.lang.String,java.lang.String> . put ( org.w3c.dom.Attr . java.lang.String ( ) , org.w3c.dom.Attr . java.lang.String ( ) ) ; } org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.ManagedMap<java.lang.String,java.lang.String> ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedList < java.lang.Object > org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> = new ManagedList < java.lang.Object > ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ) ; java.lang.String = ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String .class . java.lang.String ( ) ) ; org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> . add ( BeanDefinitionBuilder . genericBeanDefinition ( ConfigProperty .class ) . addConstructorArgValue ( java.lang.String ) . addConstructorArgValue ( java.lang.String ) . addConstructorArgValue ( java.lang.String ) . getBeanDefinition ( ) ) ; } org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> ) ; } org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> . add ( org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.ManagedList<java.lang.Object> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , ParserContext org.springframework.data.gemfire.config.xml.ParserContext )			throws org.springframework.data.gemfire.config.xml.BeanDefinitionStoreException { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , org.springframework.data.gemfire.config.xml.ParserContext ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = GemfireConstants . DEFAULT_GEMFIRE_CACHE_NAME ; org.springframework.data.gemfire.config.xml.ParserContext . getRegistry ( ) . registerAlias ( java.lang.String , STRING ) ; } return java.lang.String ; }  <METHOD_END>
