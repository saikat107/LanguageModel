<METHOD_START> protected java.lang.Object java.lang.Object ( BeanDefinitionBuilder org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , java.lang.String java.lang.String ) { return java.lang.Object ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( BeanDefinition org.springframework.data.gemfire.repository.config.BeanDefinition , java.lang.String java.lang.String ) { PropertyValue org.springframework.data.gemfire.repository.config.PropertyValue = org.springframework.data.gemfire.repository.config.BeanDefinition . getPropertyValues ( ) . getPropertyValue ( java.lang.String ) ; return ( org.springframework.data.gemfire.repository.config.PropertyValue != null ? org.springframework.data.gemfire.repository.config.PropertyValue . getValue ( ) : null ) ; }  <METHOD_END>
<METHOD_START> protected org.w3c.dom.Element org.w3c.dom.Element ( ) { org.w3c.dom.Element org.w3c.dom.Element = mock ( org.w3c.dom.Element .class ) ; org.w3c.dom.NodeList org.w3c.dom.NodeList = mock ( org.w3c.dom.NodeList .class ) ; when ( org.w3c.dom.NodeList . int ( ) ) . thenReturn ( NUMBER ) ; when ( org.w3c.dom.Element . org.w3c.dom.NodeList ( ) ) . thenReturn ( org.w3c.dom.NodeList ) ; return org.w3c.dom.Element ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.repository.config.Environment org.springframework.data.gemfire.repository.config.Environment ( ) { return mock ( Environment .class ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.repository.config.ParserContext org.springframework.data.gemfire.repository.config.ParserContext ( ) { XmlReaderContext org.springframework.data.gemfire.repository.config.XmlReaderContext = org.springframework.data.gemfire.repository.config.XmlReaderContext ( ) ; return new ParserContext ( org.springframework.data.gemfire.repository.config.XmlReaderContext , org.springframework.data.gemfire.repository.config.BeanDefinitionParserDelegate ( org.springframework.data.gemfire.repository.config.XmlReaderContext ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.repository.config.XmlReaderContext org.springframework.data.gemfire.repository.config.XmlReaderContext ( ) { ResourceLoader org.springframework.data.gemfire.repository.config.ResourceLoader = mock ( ResourceLoader .class ) ; XmlBeanDefinitionReader org.springframework.data.gemfire.repository.config.XmlBeanDefinitionReader = mock ( XmlBeanDefinitionReader .class ) ; when ( org.springframework.data.gemfire.repository.config.ResourceLoader . getClassLoader ( ) ) . thenReturn ( java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) ) ; when ( org.springframework.data.gemfire.repository.config.XmlBeanDefinitionReader . getResourceLoader ( ) ) . thenReturn ( org.springframework.data.gemfire.repository.config.ResourceLoader ) ; return new XmlReaderContext ( null , null , null , new PassThroughSourceExtractor ( ) , org.springframework.data.gemfire.repository.config.XmlBeanDefinitionReader , null ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.repository.config.BeanDefinitionParserDelegate org.springframework.data.gemfire.repository.config.BeanDefinitionParserDelegate ( XmlReaderContext org.springframework.data.gemfire.repository.config.XmlReaderContext ) { return new BeanDefinitionParserDelegate ( org.springframework.data.gemfire.repository.config.XmlReaderContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> = org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . getIdentifyingAnnotations ( ) ; assertThat ( java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> , is ( notNullValue ( java.util.Collection .class ) ) ) ; assertThat ( java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( Region .class ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Collection<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Collection<java.lang.Class<?>> = org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . getIdentifyingTypes ( ) ; assertThat ( java.util.Collection<java.lang.Class<?>> , is ( notNullValue ( java.util.Collection .class ) ) ) ; assertThat ( java.util.Collection<java.lang.Class<?>> . boolean ( GemfireRepository .class ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . getModulePrefix ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . getRepositoryFactoryBeanClassName ( ) , is ( equalTo ( GemfireRepositoryFactoryBean .class . java.lang.String ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationRepositoryConfigurationSource org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource = mock ( AnnotationRepositoryConfigurationSource .class ) ; when ( org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource . getAttribute ( eq ( STRING ) ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) ; BeanDefinitionBuilder org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ) ; org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . postProcess ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , STRING ) ; assertThat ( java.lang.Object , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; assertThat ( ( ( RuntimeBeanReference ) java.lang.Object ) . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; verify ( org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource , times ( NUMBER ) ) . getAttribute ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationRepositoryConfigurationSource org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource = mock ( AnnotationRepositoryConfigurationSource .class ) ; when ( org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource . getAttribute ( eq ( STRING ) ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; BeanDefinitionBuilder org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ) ; org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . postProcess ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , STRING ) ; assertThat ( java.lang.Object , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; assertThat ( ( ( RuntimeBeanReference ) java.lang.Object ) . getBeanName ( ) , is ( equalTo ( GemfireRepositoryConfigurationExtension . DEFAULT_MAPPING_CONTEXT_BEAN_NAME ) ) ) ; verify ( org.springframework.data.gemfire.repository.config.AnnotationRepositoryConfigurationSource , times ( NUMBER ) ) . getAttribute ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Element org.w3c.dom.Element = org.w3c.dom.Element ( ) ; when ( org.w3c.dom.Element . java.lang.String ( eq ( STRING ) ) ) . thenReturn ( STRING ) ; XmlRepositoryConfigurationSource org.springframework.data.gemfire.repository.config.XmlRepositoryConfigurationSource = new XmlRepositoryConfigurationSource ( org.w3c.dom.Element , org.springframework.data.gemfire.repository.config.ParserContext ( ) , org.springframework.data.gemfire.repository.config.Environment ( ) ) ; BeanDefinitionBuilder org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ) ; org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . postProcess ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , org.springframework.data.gemfire.repository.config.XmlRepositoryConfigurationSource ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , STRING ) ; assertThat ( java.lang.Object , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; assertThat ( ( ( RuntimeBeanReference ) java.lang.Object ) . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; verify ( org.w3c.dom.Element , times ( NUMBER ) ) . getAttribute ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Element org.w3c.dom.Element = org.w3c.dom.Element ( ) ; when ( org.w3c.dom.Element . java.lang.String ( eq ( STRING ) ) ) . thenReturn ( null ) ; XmlRepositoryConfigurationSource org.springframework.data.gemfire.repository.config.XmlRepositoryConfigurationSource = new XmlRepositoryConfigurationSource ( org.w3c.dom.Element , org.springframework.data.gemfire.repository.config.ParserContext ( ) , org.springframework.data.gemfire.repository.config.Environment ( ) ) ; BeanDefinitionBuilder org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ) ; org.springframework.data.gemfire.repository.config.GemfireRepositoryConfigurationExtension . postProcess ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , org.springframework.data.gemfire.repository.config.XmlRepositoryConfigurationSource ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.data.gemfire.repository.config.BeanDefinitionBuilder , STRING ) ; assertThat ( java.lang.Object , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; assertThat ( ( ( RuntimeBeanReference ) java.lang.Object ) . getBeanName ( ) , is ( equalTo ( GemfireRepositoryConfigurationExtension . DEFAULT_MAPPING_CONTEXT_BEAN_NAME ) ) ) ; verify ( org.w3c.dom.Element , times ( NUMBER ) ) . getAttribute ( eq ( STRING ) ) ; }  <METHOD_END>
