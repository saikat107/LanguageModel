<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.xml.BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { final BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ContentEnricher .class ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedMap < java.lang.String , java.lang.Object > org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> = new ManagedMap < java.lang.String , java.lang.Object > ( ) ; ManagedMap < java.lang.String , java.lang.Object > org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> = new ManagedMap < java.lang.String , java.lang.Object > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( boolean && boolean ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } if ( ! boolean && ! boolean && ! boolean ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } BeanDefinition org.springframework.integration.config.xml.BeanDefinition = null ; BeanDefinition org.springframework.integration.config.xml.BeanDefinition ; if ( boolean ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ValueExpression .class ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( new TypedStringValue ( java.lang.String , java.lang.String ) ) ; } else { org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } org.springframework.integration.config.xml.BeanDefinition = org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; } else if ( boolean ) { if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } org.springframework.integration.config.xml.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) . addConstructorArgValue ( java.lang.String ) . getBeanDefinition ( ) ; } if ( org.springframework.integration.config.xml.BeanDefinition != null ) { org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.integration.config.xml.BeanDefinition ) ; } if ( boolean ) { org.springframework.integration.config.xml.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) . addConstructorArgValue ( java.lang.String ) . getBeanDefinition ( ) ; org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.integration.config.xml.BeanDefinition ) ; } } if ( org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . size ( ) > NUMBER ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> ) ; } if ( org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . size ( ) > NUMBER ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> ) ; } } java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.w3c.dom.Element> ) ) { ManagedMap < java.lang.String , java.lang.Object > org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> = new ManagedMap < java.lang.String , java.lang.Object > ( ) ; ManagedMap < java.lang.String , java.lang.Object > org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> = new ManagedMap < java.lang.String , java.lang.Object > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( boolean && boolean ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + STRING + STRING + STRING + STRING , org.w3c.dom.Element ) ; } if ( ! boolean && ! boolean && ! boolean ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } BeanDefinition org.springframework.integration.config.xml.BeanDefinition = null ; if ( boolean ) { org.springframework.integration.config.xml.BeanDefinition = new RootBeanDefinition ( LiteralExpression .class ) ; org.springframework.integration.config.xml.BeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( java.lang.String ) ; } else if ( boolean ) { org.springframework.integration.config.xml.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( STRING , org.w3c.dom.Element ) ; } if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) && StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . warning ( STRING + STRING , org.w3c.dom.Element ) ; } if ( org.springframework.integration.config.xml.BeanDefinition != null ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionEvaluatingHeaderValueMessageProcessor .class ) . addConstructorArgValue ( org.springframework.integration.config.xml.BeanDefinition ) . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } if ( boolean ) { BeanDefinition org.springframework.integration.config.xml.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( STRING , org.w3c.dom.Element ) ; BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionEvaluatingHeaderValueMessageProcessor .class ) . addConstructorArgValue ( org.springframework.integration.config.xml.BeanDefinition ) . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } } if ( org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . size ( ) > NUMBER ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> ) ; } if ( org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> . size ( ) > NUMBER ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.ManagedMap<java.lang.String,java.lang.Object> ) ; } } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } return org.springframework.integration.config.xml.BeanDefinitionBuilder ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( org.w3c.dom.Element org.w3c.dom.Element ) { return true ; }  <METHOD_END>
