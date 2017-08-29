<METHOD_START> @ java.lang.Override protected org.springframework.integration.jms.config.AbstractBeanDefinition org.springframework.integration.jms.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jms.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.jms.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( JmsSendingMessageHandler .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( JmsParserUtils . JMS_TEMPLATE_ATTRIBUTE ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( JmsParserUtils . DESTINATION_ATTRIBUTE ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( JmsParserUtils . DESTINATION_NAME_ATTRIBUTE ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( JmsParserUtils . DESTINATION_EXPRESSION_ATTRIBUTE ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( JmsParserUtils . HEADER_MAPPER_ATTRIBUTE ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( boolean ) { JmsParserUtils . verifyNoJmsTemplateAttributes ( org.w3c.dom.Element , org.springframework.integration.jms.config.ParserContext ) ; org.springframework.integration.jms.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } else { org.springframework.integration.jms.config.BeanDefinitionBuilder . addConstructorArgValue ( JmsParserUtils . parseJmsTemplateBeanDefinition ( org.w3c.dom.Element , org.springframework.integration.jms.config.ParserContext ) ) ; } if ( boolean || boolean || boolean ) { if ( ! ( boolean ^ boolean ^ boolean ) ) { org.springframework.integration.jms.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.springframework.integration.jms.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; } if ( boolean ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyReference ( JmsParserUtils . DESTINATION_PROPERTY , java.lang.String ) ; } else if ( boolean ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( JmsParserUtils . DESTINATION_NAME_PROPERTY , java.lang.String ) ; } else if ( boolean ) { BeanDefinitionBuilder org.springframework.integration.jms.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) ; org.springframework.integration.jms.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyValue ( JmsParserUtils . DESTINATION_EXPRESSION_PROPERTY , org.springframework.integration.jms.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } } else if ( ! boolean ) { org.springframework.integration.jms.config.ParserContext . getReaderContext ( ) . error ( STRING + JmsParserUtils . JMS_TEMPLATE_ATTRIBUTE + STRING + JmsParserUtils . DESTINATION_ATTRIBUTE + STRING + JmsParserUtils . DESTINATION_NAME_ATTRIBUTE + STRING + JmsParserUtils . DESTINATION_EXPRESSION_ATTRIBUTE + STRING , org.springframework.integration.jms.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jms.config.BeanDefinitionBuilder . addPropertyReference ( JmsParserUtils . HEADER_MAPPER_PROPERTY , java.lang.String ) ; } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jms.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.jms.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>