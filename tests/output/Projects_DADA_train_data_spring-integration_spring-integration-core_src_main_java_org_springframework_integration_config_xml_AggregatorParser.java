<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.xml.BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanComponentDefinition org.springframework.integration.config.xml.BeanComponentDefinition = IntegrationNamespaceUtils . parseInnerHandlerDefinition ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( REF_ATTRIBUTE ) ; BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( AggregatorFactoryBean .class ) ; BeanMetadataElement org.springframework.integration.config.xml.BeanMetadataElement = null ; if ( org.springframework.integration.config.xml.BeanComponentDefinition != null || StringUtils . hasText ( java.lang.String ) ) { if ( org.springframework.integration.config.xml.BeanComponentDefinition != null ) { org.springframework.integration.config.xml.BeanMetadataElement = org.springframework.integration.config.xml.BeanComponentDefinition ; } else { org.springframework.integration.config.xml.BeanMetadataElement = new RuntimeBeanReference ( java.lang.String ) ; } org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanMetadataElement ) ; } else { if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( EXPRESSION_ATTRIBUTE ) ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( EXPRESSION_ATTRIBUTE ) ; BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionEvaluatingMessageGroupProcessor .class ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } else { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , BeanDefinitionBuilder . genericBeanDefinition ( DefaultAggregatingMessageGroupProcessor .class ) . getBeanDefinition ( ) ) ; } } if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( METHOD_ATTRIBUTE ) ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( METHOD_ATTRIBUTE ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } this . doParse ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , org.springframework.integration.config.xml.BeanMetadataElement , org.springframework.integration.config.xml.ParserContext ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder ; }  <METHOD_END>