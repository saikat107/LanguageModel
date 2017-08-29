<METHOD_START> @ java.lang.Override protected org.springframework.integration.jms.config.BeanDefinitionBuilder org.springframework.integration.jms.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jms.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.jms.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( JmsChannelFactoryBean .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyReference ( JmsParserUtils . CONNECTION_FACTORY_PROPERTY , JmsParserUtils . determineConnectionFactoryBeanName ( org.w3c.dom.Element , org.springframework.integration.jms.config.ParserContext ) ) ; if ( STRING . boolean ( org.w3c.dom.Element . java.lang.String ( ) ) ) { this . void ( org.w3c.dom.Element , org.springframework.integration.jms.config.ParserContext , org.springframework.integration.jms.config.BeanDefinitionBuilder , STRING ) ; } else if ( STRING . boolean ( org.w3c.dom.Element . java.lang.String ( ) ) ) { this . void ( org.w3c.dom.Element , org.springframework.integration.jms.config.ParserContext , org.springframework.integration.jms.config.BeanDefinitionBuilder , STRING ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( ! StringUtils . hasText ( java.lang.String ) && StringUtils . hasText ( java.lang.String ) ) { if ( STRING . boolean ( java.lang.String ) ) { java.lang.String = STRING ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.String = STRING ; } } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( java.lang.String . boolean ( STRING ) ) { if ( ! ( STRING . boolean ( java.lang.String ) || STRING . boolean ( java.lang.String ) ) ) { org.springframework.integration.jms.config.ParserContext . getReaderContext ( ) . warning ( STRING + STRING , org.w3c.dom.Element ) ; } } else { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , STRING + java.lang.String . java.lang.String ( ) ) ; } } java.lang.Integer java.lang.Integer = this . java.lang.Integer ( org.w3c.dom.Element , org.springframework.integration.jms.config.ParserContext ) ; if ( java.lang.Integer != null ) { if ( java.lang.Integer == Session . SESSION_TRANSACTED ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Boolean . java.lang.Boolean ) ; } else { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Integer ) ; } } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( java.lang.String . boolean ( STRING ) ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Integer . java.lang.Integer ( java.lang.String ) ) ; } } return org.springframework.integration.jms.config.BeanDefinitionBuilder ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jms.config.ParserContext , BeanDefinitionBuilder org.springframework.integration.jms.config.BeanDefinitionBuilder , java.lang.String java.lang.String ) { boolean boolean = STRING . boolean ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String + STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( ! ( boolean ^ boolean ) ) { org.springframework.integration.jms.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } if ( boolean ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } else if ( boolean ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( STRING , boolean ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } } if ( boolean ) { IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Integer java.lang.Integer ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jms.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { int int = Session . AUTO_ACKNOWLEDGE ; if ( STRING . boolean ( java.lang.String ) ) { int = Session . SESSION_TRANSACTED ; } else if ( STRING . boolean ( java.lang.String ) ) { int = Session . DUPS_OK_ACKNOWLEDGE ; } else if ( STRING . boolean ( java.lang.String ) ) { int = Session . CLIENT_ACKNOWLEDGE ; } else if ( ! STRING . boolean ( java.lang.String ) ) { org.springframework.integration.jms.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } return int ; } else { return null ; } }  <METHOD_END>
