<METHOD_START> @ java.lang.Override protected org.springframework.integration.twitter.config.BeanMetadataElement org.springframework.integration.twitter.config.BeanMetadataElement ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.twitter.config.ParserContext ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( org.w3c.dom.Element , org.springframework.integration.twitter.config.ParserContext ) ; BeanDefinitionBuilder org.springframework.integration.twitter.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( java.lang.Class<> ) ; org.springframework.integration.twitter.config.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.integration.twitter.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.twitter.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.twitter.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.twitter.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.twitter.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.twitter.config.ParserContext ) { java.lang.Class<?> < ? > java.lang.Class<?> = null ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ) . java.lang.String ( ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.Class<?> = TimelineReceivingMessageSource .class ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.Class<?> = DirectMessageReceivingMessageSource .class ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.Class<?> = MentionsReceivingMessageSource .class ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.Class<?> = SearchReceivingMessageSource .class ; } else { org.springframework.integration.twitter.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } return java.lang.Class<> ; }  <METHOD_END>