<METHOD_START> public org.springframework.data.mongodb.config.BeanDefinition org.springframework.data.mongodb.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext ) { if ( org.springframework.data.mongodb.config.ParserContext . isNested ( ) ) { org.springframework.data.mongodb.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } BeanDefinitionRegistry org.springframework.data.mongodb.config.BeanDefinitionRegistry = org.springframework.data.mongodb.config.ParserContext . getRegistry ( ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( AbstractBeanDefinitionParser . ID_ATTRIBUTE ) ; java.lang.String = StringUtils . hasText ( java.lang.String ) ? java.lang.String : DEFAULT_CONVERTER_BEAN_NAME ; org.springframework.data.mongodb.config.ParserContext . pushContainingComponent ( new CompositeComponentDefinition ( STRING , org.w3c.dom.Element ) ) ; BeanDefinition org.springframework.data.mongodb.config.BeanDefinition = org.springframework.data.mongodb.config.BeanDefinition ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ; java.lang.String java.lang.String = java.lang.String ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext , org.springframework.data.mongodb.config.BeanDefinition , java.lang.String ) ; java.lang.String ( java.lang.String , org.springframework.data.mongodb.config.ParserContext , org.w3c.dom.Element ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = DB_FACTORY_BEAN_NAME ; } BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MappingMongoConverter .class ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.data.mongodb.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } if ( org.springframework.data.mongodb.config.BeanDefinition != null ) { org.springframework.data.mongodb.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.mongodb.config.BeanDefinition ) ; } if( ! org.springframework.data.mongodb.config.BeanDefinitionRegistry . containsBeanDefinition ( STRING ) ) { BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( STRING ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgValue ( BeanDefinitionBuilder . genericBeanDefinition ( QueryMapper .class ) . addConstructorArgReference ( java.lang.String ) . getBeanDefinition ( ) ) ; org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) , STRING ) ) ; } try { org.springframework.data.mongodb.config.BeanDefinitionRegistry . getBeanDefinition ( INDEX_HELPER_BEAN_NAME ) ; } catch ( NoSuchBeanDefinitionException org.springframework.data.mongodb.config.NoSuchBeanDefinitionException ) { BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MongoPersistentEntityIndexCreator .class ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( STRING ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addDependsOn ( java.lang.String ) ; org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) , INDEX_HELPER_BEAN_NAME ) ) ; } BeanDefinition org.springframework.data.mongodb.config.BeanDefinition = org.springframework.data.mongodb.config.BeanDefinition ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ; if ( org.springframework.data.mongodb.config.BeanDefinition != null ) { org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.BeanDefinition , VALIDATING_EVENT_LISTENER_BEAN_NAME ) ) ; } org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) , java.lang.String ) ) ; org.springframework.data.mongodb.config.ParserContext . popAndRegisterContainingComponent ( ) ; return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.config.BeanDefinition org.springframework.data.mongodb.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) && java.lang.Boolean . java.lang.Boolean ( java.lang.String ) ; if ( ! boolean ) { BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ) ; RuntimeBeanReference org.springframework.data.mongodb.config.RuntimeBeanReference = org.springframework.data.mongodb.config.RuntimeBeanReference ( org.springframework.data.mongodb.config.BeanDefinitionBuilder , org.springframework.data.mongodb.config.ParserContext ) ; if ( org.springframework.data.mongodb.config.RuntimeBeanReference != null ) { org.springframework.data.mongodb.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setBeanClass ( ValidatingMongoEventListener .class ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.data.mongodb.config.RuntimeBeanReference ) ; return org.springframework.data.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; } } return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.config.RuntimeBeanReference org.springframework.data.mongodb.config.RuntimeBeanReference ( java.lang.Object java.lang.Object , ParserContext org.springframework.data.mongodb.config.ParserContext ) { if ( ! boolean ) { return null ; } RootBeanDefinition org.springframework.data.mongodb.config.RootBeanDefinition = new RootBeanDefinition ( STRING ) ; org.springframework.data.mongodb.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.data.mongodb.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; java.lang.String java.lang.String = org.springframework.data.mongodb.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.data.mongodb.config.RootBeanDefinition ) ; org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.RootBeanDefinition , java.lang.String ) ) ; return new RuntimeBeanReference ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext , BeanDefinition org.springframework.data.mongodb.config.BeanDefinition , java.lang.String java.lang.String ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { return java.lang.String ; } BeanComponentDefinitionBuilder org.springframework.data.mongodb.config.BeanComponentDefinitionBuilder = new BeanComponentDefinitionBuilder ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ; BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MongoMappingContext .class ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = java.util.Set<java.lang.String> ( org.w3c.dom.Element ) ; if ( java.util.Set<java.lang.String> != null ) { org.springframework.data.mongodb.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.Set<java.lang.String> ) ; } if ( org.springframework.data.mongodb.config.BeanDefinition != null ) { AbstractBeanDefinition org.springframework.data.mongodb.config.AbstractBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.data.mongodb.config.AbstractBeanDefinition . setFactoryBeanName ( STRING ) ; org.springframework.data.mongodb.config.AbstractBeanDefinition . setFactoryMethodName ( STRING ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.mongodb.config.AbstractBeanDefinition ) ; } void ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext . getReaderContext ( ) , org.springframework.data.mongodb.config.BeanDefinitionBuilder ) ; java.lang.String = java.lang.String == null || DEFAULT_CONVERTER_BEAN_NAME . equals ( java.lang.String ) ? MAPPING_CONTEXT_BEAN_NAME : java.lang.String + STRING + MAPPING_CONTEXT_BEAN_NAME ; org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( org.springframework.data.mongodb.config.BeanComponentDefinitionBuilder . getComponent ( org.springframework.data.mongodb.config.BeanDefinitionBuilder , java.lang.String ) ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , ReaderContext org.springframework.data.mongodb.config.ReaderContext , BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) && java.lang.Boolean . boolean ( java.lang.String ) ; if ( boolean && boolean ) { org.springframework.data.mongodb.config.ReaderContext . error ( STRING , org.w3c.dom.Element ) ; return; } java.lang.Object java.lang.Object = null ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.Object = new RootBeanDefinition ( CamelCaseAbbreviatingFieldNamingStrategy .class ) ; } else if ( boolean ) { java.lang.Object = new RuntimeBeanReference ( java.lang.String ) ; } if ( java.lang.Object != null ) { org.springframework.data.mongodb.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.config.BeanDefinition org.springframework.data.mongodb.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( java.util.List<org.w3c.dom.Element> . int ( ) == NUMBER ) { org.w3c.dom.Element org.w3c.dom.Element = java.util.List<org.w3c.dom.Element> . org.w3c.dom.Element ( NUMBER ) ; ManagedList < BeanMetadataElement > org.springframework.data.mongodb.config.ManagedList<org.springframework.data.mongodb.config.BeanMetadataElement> = new ManagedList < BeanMetadataElement > ( ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( java.util.List<org.w3c.dom.Element> != null ) { for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { org.springframework.data.mongodb.config.ManagedList<org.springframework.data.mongodb.config.BeanMetadataElement> . add ( org.springframework.data.mongodb.config.BeanMetadataElement ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ) ; } } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { ClassPathScanningCandidateComponentProvider org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider = new ClassPathScanningCandidateComponentProvider ( true ) ; org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider . addExcludeFilter ( new org.springframework.data.mongodb.config.MappingMongoConverterParser.NegatingFilter ( new AssignableTypeFilter ( Converter .class ) , new AssignableTypeFilter ( GenericConverter .class ) ) ) ; for ( BeanDefinition org.springframework.data.mongodb.config.BeanDefinition : org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider . findCandidateComponents ( java.lang.String ) ) { org.springframework.data.mongodb.config.ManagedList<org.springframework.data.mongodb.config.BeanMetadataElement> . add ( org.springframework.data.mongodb.config.BeanDefinition ) ; } } BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( CustomConversions .class ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.data.mongodb.config.ManagedList<org.springframework.data.mongodb.config.BeanMetadataElement> ) ; AbstractBeanDefinition org.springframework.data.mongodb.config.AbstractBeanDefinition = org.springframework.data.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; org.springframework.data.mongodb.config.AbstractBeanDefinition . setSource ( org.springframework.data.mongodb.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.AbstractBeanDefinition , STRING ) ) ; return org.springframework.data.mongodb.config.AbstractBeanDefinition ; } return null ; }  <METHOD_END>
<METHOD_START> private static java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( org.w3c.dom.Element org.w3c.dom.Element ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { return null ; } ClassPathScanningCandidateComponentProvider org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider = new ClassPathScanningCandidateComponentProvider ( false ) ; org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider . addIncludeFilter ( new AnnotationTypeFilter ( Document .class ) ) ; org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider . addIncludeFilter ( new AnnotationTypeFilter ( Persistent .class ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new ManagedSet < java.lang.String > ( ) ; for ( BeanDefinition org.springframework.data.mongodb.config.BeanDefinition : org.springframework.data.mongodb.config.ClassPathScanningCandidateComponentProvider . findCandidateComponents ( java.lang.String ) ) { java.util.Set<java.lang.String> . boolean ( org.springframework.data.mongodb.config.BeanDefinition . getBeanClassName ( ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.config.BeanMetadataElement org.springframework.data.mongodb.config.BeanMetadataElement ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { return new RuntimeBeanReference ( java.lang.String ) ; } org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { BeanDefinitionHolder org.springframework.data.mongodb.config.BeanDefinitionHolder = org.springframework.data.mongodb.config.ParserContext . getDelegate ( ) . parseBeanDefinitionElement ( org.w3c.dom.Element ) ; org.springframework.data.mongodb.config.BeanDefinitionHolder = org.springframework.data.mongodb.config.ParserContext . getDelegate ( ) . decorateBeanDefinitionIfRequired ( org.w3c.dom.Element , org.springframework.data.mongodb.config.BeanDefinitionHolder ) ; return org.springframework.data.mongodb.config.BeanDefinitionHolder ; } org.springframework.data.mongodb.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; return null ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , ParserContext org.springframework.data.mongodb.config.ParserContext , org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( MappingContextIsNewStrategyFactory .class ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; BeanComponentDefinitionBuilder org.springframework.data.mongodb.config.BeanComponentDefinitionBuilder = new BeanComponentDefinitionBuilder ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ; org.springframework.data.mongodb.config.ParserContext . registerBeanComponent ( org.springframework.data.mongodb.config.BeanComponentDefinitionBuilder . getComponent ( org.springframework.data.mongodb.config.BeanDefinitionBuilder , IS_NEW_STRATEGY_FACTORY_BEAN_NAME ) ) ; return IS_NEW_STRATEGY_FACTORY_BEAN_NAME ; }  <METHOD_END>
<METHOD_START> public void ( TypeFilter ... org.springframework.data.mongodb.config.TypeFilter[] ) { Assert . notNull ( org.springframework.data.mongodb.config.TypeFilter[] , STRING ) ; this . java.util.Set<org.springframework.data.mongodb.config.TypeFilter> = new java.util.HashSet<org.springframework.data.mongodb.config.TypeFilter> < TypeFilter > ( java.util.Arrays . java.util.List ( org.springframework.data.mongodb.config.TypeFilter[] ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( MetadataReader org.springframework.data.mongodb.config.MetadataReader , MetadataReaderFactory org.springframework.data.mongodb.config.MetadataReaderFactory ) throws java.io.IOException { for ( TypeFilter org.springframework.data.mongodb.config.TypeFilter : java.util.Set<org.springframework.data.mongodb.config.TypeFilter> ) { if ( org.springframework.data.mongodb.config.TypeFilter . match ( org.springframework.data.mongodb.config.MetadataReader , org.springframework.data.mongodb.config.MetadataReaderFactory ) ) { return false ; } } return true ; }  <METHOD_END>