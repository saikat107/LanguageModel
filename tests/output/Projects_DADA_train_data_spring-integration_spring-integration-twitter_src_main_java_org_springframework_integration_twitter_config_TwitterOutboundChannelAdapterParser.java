<METHOD_START> @ java.lang.Override protected org.springframework.integration.twitter.config.AbstractBeanDefinition org.springframework.integration.twitter.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.twitter.config.ParserContext ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( org.w3c.dom.Element , org.springframework.integration.twitter.config.ParserContext ) ; BeanDefinitionBuilder org.springframework.integration.twitter.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( java.lang.Class<> ) ; org.springframework.integration.twitter.config.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.twitter.config.BeanDefinitionBuilder . addPropertyValue ( STRING , BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) . addConstructorArgValue ( java.lang.String ) . getBeanDefinition ( ) ) ; } return org.springframework.integration.twitter.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.twitter.config.ParserContext ) { java.lang.Class<?> < ? > java.lang.Class<?> = null ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ) . java.lang.String ( ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.Class<?> = StatusUpdatingMessageHandler .class ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.Class<?> = DirectMessageSendingMessageHandler .class ; } else { org.springframework.integration.twitter.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } return java.lang.Class<> ; }  <METHOD_END>
