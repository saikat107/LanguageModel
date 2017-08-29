<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( final org.w3c.dom.Element org.w3c.dom.Element , final AbstractBeanDefinition org.springframework.data.couchbase.config.AbstractBeanDefinition , final ParserContext org.springframework.data.couchbase.config.ParserContext ) { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.data.couchbase.config.AbstractBeanDefinition , org.springframework.data.couchbase.config.ParserContext ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : BeanNames . COUCHBASE_CLUSTER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class java.lang.Class ( final org.w3c.dom.Element org.w3c.dom.Element ) { return CouchbaseCluster .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( final org.w3c.dom.Element org.w3c.dom.Element , final BeanDefinitionBuilder org.springframework.data.couchbase.config.BeanDefinitionBuilder ) { org.springframework.data.couchbase.config.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; org.springframework.data.couchbase.config.BeanDefinitionBuilder . setDestroyMethodName ( STRING ) ; boolean ( org.springframework.data.couchbase.config.BeanDefinitionBuilder , org.w3c.dom.Element ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , java.lang.String ) ; if ( java.util.List<org.w3c.dom.Element> != null && java.util.List<org.w3c.dom.Element> . int ( ) > NUMBER ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; for ( int int = NUMBER ; int < java.util.List<org.w3c.dom.Element> . int ( ) ; int ++ ) { java.util.List<java.lang.String> . boolean ( java.util.List<org.w3c.dom.Element> . org.w3c.dom.Element ( int ) . java.lang.String ( ) ) ; } org.springframework.data.couchbase.config.BeanDefinitionBuilder . addConstructorArgValue ( java.util.List<java.lang.String> ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( BeanDefinitionBuilder org.springframework.data.couchbase.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element ) { org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , java.lang.String ) ; if ( org.w3c.dom.Element != null && org.w3c.dom.Element . boolean ( ) ) { void ( org.springframework.data.couchbase.config.BeanDefinitionBuilder , org.w3c.dom.Element ) ; return true ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { void ( org.springframework.data.couchbase.config.BeanDefinitionBuilder , java.lang.String ) ; return true ; } void ( org.springframework.data.couchbase.config.BeanDefinitionBuilder , BeanNames . COUCHBASE_ENV ) ; return false ; }  <METHOD_END>
<METHOD_START> protected void void ( BeanDefinitionBuilder org.springframework.data.couchbase.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinitionBuilder org.springframework.data.couchbase.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CouchbaseEnvironmentFactoryBean .class ) ; new CouchbaseEnvironmentParser ( ) . doParse ( org.w3c.dom.Element , org.springframework.data.couchbase.config.BeanDefinitionBuilder ) ; org.springframework.data.couchbase.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.data.couchbase.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( BeanDefinitionBuilder org.springframework.data.couchbase.config.BeanDefinitionBuilder , java.lang.String java.lang.String ) { org.springframework.data.couchbase.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; }  <METHOD_END>
