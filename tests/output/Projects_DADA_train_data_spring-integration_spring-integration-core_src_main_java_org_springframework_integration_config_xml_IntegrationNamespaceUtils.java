<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , java.lang.String java.lang.String ) { void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String ) { void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , java.lang.String java.lang.String , boolean boolean ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) || ( boolean && org.w3c.dom.Element . boolean ( java.lang.String ) ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , new TypedStringValue ( java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , boolean boolean ) { void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , Conventions . attributeNameToPropertyName ( java.lang.String ) , boolean ) ; }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , java.lang.String java.lang.String ) { void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , java.lang.String java.lang.String , boolean boolean ) { if ( org.w3c.dom.Element . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( java.lang.String , java.lang.String ) ; } else if ( boolean ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , null ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String ) { void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , boolean boolean ) { void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String , Conventions . attributeNameToPropertyName ( java.lang.String ) , boolean ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { java.lang.String java.lang.String = STRING + org.w3c.dom.Element . java.lang.String ( ) + STRING ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.String += STRING + java.lang.String + STRING ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , ParserContext org.springframework.integration.config.xml.ParserContext ) { if ( org.w3c.dom.Element . boolean ( STRING ) ) { int int = org.w3c.dom.Element . org.w3c.dom.NamedNodeMap ( ) . int ( ) ; if ( int != NUMBER ) { if ( ! ( int == NUMBER && org.w3c.dom.Element . boolean ( STRING ) && org.w3c.dom.Element . java.lang.String ( STRING ) . boolean ( STRING ) ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } } if ( org.w3c.dom.Element . org.w3c.dom.NodeList ( ) . int ( ) != NUMBER ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } else { BeanDefinition org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.ParserContext . getDelegate ( ) . parseCustomElement ( org.w3c.dom.Element , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; if ( org.springframework.integration.config.xml.BeanDefinition == null ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinition ) ; } }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , ParserContext org.springframework.integration.config.xml.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) && org.w3c.dom.Element != null ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; return null ; } if ( ! StringUtils . hasText ( java.lang.String ) && org.w3c.dom.Element == null ) { return null ; } return StringUtils . hasText ( java.lang.String ) ? java.lang.String : org.w3c.dom.Element . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.config.xml.BeanComponentDefinition org.springframework.integration.config.xml.BeanComponentDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; BeanComponentDefinition org.springframework.integration.config.xml.BeanComponentDefinition = null ; if ( java.util.List<org.w3c.dom.Element> != null && java.util.List<org.w3c.dom.Element> . int ( ) == NUMBER ) { org.w3c.dom.Element org.w3c.dom.Element = java.util.List<org.w3c.dom.Element> . org.w3c.dom.Element ( NUMBER ) ; BeanDefinitionParserDelegate org.springframework.integration.config.xml.BeanDefinitionParserDelegate = org.springframework.integration.config.xml.ParserContext . getDelegate ( ) ; BeanDefinitionHolder org.springframework.integration.config.xml.BeanDefinitionHolder = org.springframework.integration.config.xml.BeanDefinitionParserDelegate . parseBeanDefinitionElement ( org.w3c.dom.Element ) ; org.springframework.integration.config.xml.BeanDefinitionHolder = org.springframework.integration.config.xml.BeanDefinitionParserDelegate . decorateBeanDefinitionIfRequired ( org.w3c.dom.Element , org.springframework.integration.config.xml.BeanDefinitionHolder ) ; BeanDefinition org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinitionHolder . getBeanDefinition ( ) ; org.springframework.integration.config.xml.BeanComponentDefinition = new BeanComponentDefinition ( org.springframework.integration.config.xml.BeanDefinition , org.springframework.integration.config.xml.BeanDefinitionHolder . getBeanName ( ) ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) && org.springframework.integration.config.xml.BeanComponentDefinition != null ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + ( org.springframework.integration.config.xml.BeanComponentDefinition . getBeanDefinition ( ) . getBeanClassName ( ) ) + STRING + java.lang.String + STRING + org.springframework.integration.config.xml.IntegrationNamespaceUtils . java.lang.String ( org.w3c.dom.Element ) + STRING , org.springframework.integration.config.xml.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; } return org.springframework.integration.config.xml.BeanComponentDefinition ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , ParserContext org.springframework.integration.config.xml.ParserContext , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { void ( org.w3c.dom.Element , org.springframework.integration.config.xml.BeanDefinitionBuilder , org.springframework.integration.config.xml.ParserContext , BeanDefinitionBuilder . genericBeanDefinition ( java.lang.Class<> ) , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , ParserContext org.springframework.integration.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , java.lang.String java.lang.String ) { java.lang.String java.lang.String = STRING ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = java.lang.String ; } boolean boolean = org.w3c.dom.Element . boolean ( STRING ) ; boolean boolean = org.w3c.dom.Element . boolean ( STRING ) ; boolean boolean = org.w3c.dom.Element . boolean ( java.lang.String ) ; if ( boolean && ( boolean || boolean ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + STRING + STRING , org.w3c.dom.Element ) ; } org.springframework.integration.config.xml.IntegrationNamespaceUtils . void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; if ( boolean || boolean ) { if ( boolean ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } if ( boolean ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( java.lang.String ) ) ; } org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { return org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element , false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , boolean boolean ) { BeanDefinition org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element ) ; BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MatchAlwaysTransactionAttributeSource .class ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinition ) ; BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( boolean ? TransactionHandleMessageAdvice .class : TransactionInterceptor .class ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DefaultTransactionAttribute .class ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , STRING + org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , STRING + org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String [] java.lang.String[] ( org.w3c.dom.Element org.w3c.dom.Element ) { java.lang.String [] java.lang.String[] = null ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( AbstractBeanDefinitionParser . ID_ATTRIBUTE ) ; if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.String[] = new java.lang.String [] { java.lang.String + IntegrationConfigUtils . HANDLER_ALIAS_SUFFIX } ; } return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , org.w3c.dom.Element org.w3c.dom.Element , BeanDefinition org.springframework.integration.config.xml.BeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext ) { void ( org.w3c.dom.Element , org.w3c.dom.Element , false , org.springframework.integration.config.xml.BeanDefinition , org.springframework.integration.config.xml.ParserContext ) ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , org.w3c.dom.Element org.w3c.dom.Element , boolean boolean , BeanDefinition org.springframework.integration.config.xml.BeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext ) { void ( org.w3c.dom.Element , org.w3c.dom.Element , boolean , org.springframework.integration.config.xml.BeanDefinition , org.springframework.integration.config.xml.ParserContext , STRING ) ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , org.w3c.dom.Element org.w3c.dom.Element , BeanDefinition org.springframework.integration.config.xml.BeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext , java.lang.String java.lang.String ) { void ( org.w3c.dom.Element , org.w3c.dom.Element , false , org.springframework.integration.config.xml.BeanDefinition , org.springframework.integration.config.xml.ParserContext , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) public static void void ( org.w3c.dom.Element org.w3c.dom.Element , org.w3c.dom.Element org.w3c.dom.Element , boolean boolean , BeanDefinition org.springframework.integration.config.xml.BeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext , java.lang.String java.lang.String ) { ManagedList org.springframework.integration.config.xml.ManagedList = org.springframework.integration.config.xml.ManagedList ( org.w3c.dom.Element , org.w3c.dom.Element , boolean , org.springframework.integration.config.xml.BeanDefinition , org.springframework.integration.config.xml.ParserContext ) ; if ( ! CollectionUtils . isEmpty ( org.springframework.integration.config.xml.ManagedList ) ) { org.springframework.integration.config.xml.BeanDefinition . getPropertyValues ( ) . add ( java.lang.String , org.springframework.integration.config.xml.ManagedList ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public static org.springframework.integration.config.xml.ManagedList org.springframework.integration.config.xml.ManagedList ( org.w3c.dom.Element org.w3c.dom.Element , org.w3c.dom.Element org.w3c.dom.Element , BeanDefinition org.springframework.integration.config.xml.BeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext ) { return org.springframework.integration.config.xml.ManagedList ( org.w3c.dom.Element , org.w3c.dom.Element , false , org.springframework.integration.config.xml.BeanDefinition , org.springframework.integration.config.xml.ParserContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) public static org.springframework.integration.config.xml.ManagedList org.springframework.integration.config.xml.ManagedList ( org.w3c.dom.Element org.w3c.dom.Element , org.w3c.dom.Element org.w3c.dom.Element , boolean boolean , BeanDefinition org.springframework.integration.config.xml.BeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext ) { ManagedList org.springframework.integration.config.xml.ManagedList = new ManagedList ( ) ; if ( org.w3c.dom.Element != null ) { org.springframework.integration.config.xml.ManagedList . add ( org.springframework.integration.config.xml.BeanDefinition ( org.w3c.dom.Element , boolean ) ) ; } if ( org.w3c.dom.Element != null ) { org.w3c.dom.NodeList org.w3c.dom.NodeList = org.w3c.dom.Element . org.w3c.dom.NodeList ( ) ; for ( int int = NUMBER ; int < org.w3c.dom.NodeList . int ( ) ; int ++ ) { org.w3c.dom.Node org.w3c.dom.Node = org.w3c.dom.NodeList . org.w3c.dom.Node ( int ) ; if ( org.w3c.dom.Node . short ( ) == org.w3c.dom.Node . short ) { org.w3c.dom.Element org.w3c.dom.Element = ( org.w3c.dom.Element ) org.w3c.dom.Node ; java.lang.String java.lang.String = org.w3c.dom.Node . java.lang.String ( ) ; if ( STRING . boolean ( java.lang.String ) ) { BeanDefinitionHolder org.springframework.integration.config.xml.BeanDefinitionHolder = org.springframework.integration.config.xml.ParserContext . getDelegate ( ) . parseBeanDefinitionElement ( org.w3c.dom.Element , org.springframework.integration.config.xml.BeanDefinition ) ; org.springframework.integration.config.xml.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.integration.config.xml.BeanDefinitionHolder ) ) ; org.springframework.integration.config.xml.ManagedList . add ( new RuntimeBeanReference ( org.springframework.integration.config.xml.BeanDefinitionHolder . getBeanName ( ) ) ) ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; org.springframework.integration.config.xml.ManagedList . add ( new RuntimeBeanReference ( java.lang.String ) ) ; } else { BeanDefinition org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.ParserContext . getDelegate ( ) . parseCustomElement ( org.w3c.dom.Element , org.springframework.integration.config.xml.BeanDefinition ) ; if ( org.springframework.integration.config.xml.BeanDefinition == null ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } org.springframework.integration.config.xml.ManagedList . add ( org.springframework.integration.config.xml.BeanDefinition ) ; } } } } return org.springframework.integration.config.xml.ManagedList ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( java.lang.String java.lang.String , java.lang.String java.lang.String , ParserContext org.springframework.integration.config.xml.ParserContext , org.w3c.dom.Element org.w3c.dom.Element , boolean boolean ) { Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( boolean && boolean ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } if ( boolean && ( ! boolean && ! boolean ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } BeanDefinition org.springframework.integration.config.xml.BeanDefinition ; if ( boolean ) { org.springframework.integration.config.xml.BeanDefinition = new RootBeanDefinition ( LiteralExpression .class ) ; org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( java.lang.String ) ; } else { org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinition ( java.lang.String , org.w3c.dom.Element ) ; } return org.springframework.integration.config.xml.BeanDefinition ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.config.xml.BeanDefinition org.springframework.integration.config.xml.BeanDefinition ( java.lang.String java.lang.String , org.w3c.dom.Element org.w3c.dom.Element ) { Assert . hasText ( java.lang.String , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) ; } return null ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( AbstractBeanDefinitionParser . ID_ATTRIBUTE ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } IntegrationConfigUtils . autoCreateDirectChannel ( java.lang.String , org.springframework.integration.config.xml.ParserContext . getRegistry ( ) ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public static void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext , java.lang.String java.lang.String , java.lang.String java.lang.String ) { BeanDefinitionRegistry org.springframework.integration.config.xml.BeanDefinitionRegistry = org.springframework.integration.config.xml.ParserContext . getRegistry ( ) ; if ( org.springframework.integration.config.xml.BeanDefinitionRegistry . containsBeanDefinition ( java.lang.String ) ) { BeanDefinition org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinitionRegistry . getBeanDefinition ( java.lang.String ) ; if ( FixedSubscriberChannel .class . java.lang.String ( ) . boolean ( org.springframework.integration.config.xml.BeanDefinition . getBeanClassName ( ) ) ) { ConstructorArgumentValues org.springframework.integration.config.xml.ConstructorArgumentValues = org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) ; if ( org.springframework.integration.config.xml.ConstructorArgumentValues . isEmpty ( ) ) { org.springframework.integration.config.xml.ConstructorArgumentValues . addGenericArgumentValue ( new RuntimeBeanReference ( java.lang.String ) ) ; } else { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } } } else { BeanDefinition org.springframework.integration.config.xml.BeanDefinition ; if ( ! org.springframework.integration.config.xml.BeanDefinitionRegistry . containsBeanDefinition ( IntegrationContextUtils . INTEGRATION_FIXED_SUBSCRIBER_CHANNEL_BPP_BEAN_NAME ) ) { org.springframework.integration.config.xml.BeanDefinition = new RootBeanDefinition ( FixedSubscriberChannelBeanFactoryPostProcessor .class ) ; org.springframework.integration.config.xml.BeanDefinitionRegistry . registerBeanDefinition ( IntegrationContextUtils . INTEGRATION_FIXED_SUBSCRIBER_CHANNEL_BPP_BEAN_NAME , org.springframework.integration.config.xml.BeanDefinition ) ; } else { org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinitionRegistry . getBeanDefinition ( IntegrationContextUtils . INTEGRATION_FIXED_SUBSCRIBER_CHANNEL_BPP_BEAN_NAME ) ; } ManagedMap < java.lang.String , java.lang.String > org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> ; ValueHolder org.springframework.integration.config.xml.ValueHolder = org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.util.Map .class ) ; if ( org.springframework.integration.config.xml.ValueHolder == null ) { org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> = new ManagedMap < java.lang.String , java.lang.String > ( ) ; org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> ) ; } else { org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> = ( ManagedMap < java.lang.String , java.lang.String > ) org.springframework.integration.config.xml.ValueHolder . getValue ( ) ; } org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.String> . put ( java.lang.String , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanDefinitionRegistry org.springframework.integration.config.xml.BeanDefinitionRegistry = org.springframework.integration.config.xml.ParserContext . getRegistry ( ) ; IntegrationConfigUtils . registerRoleControllerDefinitionIfNecessary ( org.springframework.integration.config.xml.BeanDefinitionRegistry ) ; BeanDefinition org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinitionRegistry . getBeanDefinition ( IntegrationContextUtils . INTEGRATION_LIFECYCLE_ROLE_CONTROLLER ) ; @ java.lang.SuppressWarnings ( STRING ) ManagedList < java.lang.String > org.springframework.integration.config.xml.ManagedList<java.lang.String> = ( ManagedList < java.lang.String > ) org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , ManagedList .class ) . getValue ( ) ; @ java.lang.SuppressWarnings ( STRING ) ManagedList < BeanReference > org.springframework.integration.config.xml.ManagedList<org.springframework.integration.config.xml.BeanReference> = ( ManagedList < BeanReference > ) org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , ManagedList .class ) . getValue ( ) ; org.springframework.integration.config.xml.ManagedList<java.lang.String> . add ( java.lang.String ) ; org.springframework.integration.config.xml.ManagedList<org.springframework.integration.config.xml.BeanReference> . add ( new RuntimeBeanReference ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanMetadataElement ( java.lang.String , java.lang.String , java.lang.String , java.lang.String , org.w3c.dom.Element , org.springframework.integration.config.xml.BeanMetadataElement , org.springframework.integration.config.xml.ParserContext ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , org.springframework.integration.config.xml.BeanMetadataElement ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanMetadataElement ( java.lang.String , java.lang.String , java.lang.String , java.lang.String , org.w3c.dom.Element , org.springframework.integration.config.xml.BeanMetadataElement , org.springframework.integration.config.xml.ParserContext ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.integration.config.xml.BeanMetadataElement ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.config.xml.BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , org.w3c.dom.Element org.w3c.dom.Element , BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement , ParserContext org.springframework.integration.config.xml.ParserContext ) { final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; final boolean boolean = StringUtils . hasText ( java.lang.String ) ; final boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( boolean && boolean ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement = null ; if ( boolean ) { org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanMetadataElement ( new RuntimeBeanReference ( java.lang.String ) , java.lang.String , java.lang.String ) ; } else if ( boolean ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( IntegrationConfigUtils . BASE_PACKAGE + STRING + java.lang.String ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; } else if ( org.springframework.integration.config.xml.BeanMetadataElement != null ) { org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanMetadataElement ( org.springframework.integration.config.xml.BeanMetadataElement , java.lang.String , java.lang.String ) ; } else { org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanMetadataElement ( null , java.lang.String , java.lang.String ) ; } return org.springframework.integration.config.xml.BeanMetadataElement ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.config.xml.BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement ( BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement , java.lang.String java.lang.String , java.lang.String java.lang.String ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( IntegrationConfigUtils . BASE_PACKAGE + STRING + java.lang.String + STRING ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanMetadataElement ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } return org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
