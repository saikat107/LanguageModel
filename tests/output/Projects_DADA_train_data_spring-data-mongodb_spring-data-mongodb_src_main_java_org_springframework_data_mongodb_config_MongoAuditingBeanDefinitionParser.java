<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return AuditingEventListener .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext , BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { BeanDefinitionRegistry org.springframework.data.mongodb.config.BeanDefinitionRegistry = org.springframework.data.mongodb.config.ParserContext . getRegistry ( ) ; if ( ! org.springframework.data.mongodb.config.BeanDefinitionRegistry . containsBeanDefinition ( MAPPING_CONTEXT_BEAN_NAME ) ) { org.springframework.data.mongodb.config.BeanDefinitionRegistry . registerBeanDefinition ( MAPPING_CONTEXT_BEAN_NAME , new RootBeanDefinition ( MongoMappingContext .class ) ) ; } java.lang.String = MAPPING_CONTEXT_BEAN_NAME ; } IsNewAwareAuditingHandlerBeanDefinitionParser org.springframework.data.mongodb.config.IsNewAwareAuditingHandlerBeanDefinitionParser = new IsNewAwareAuditingHandlerBeanDefinitionParser ( java.lang.String ) ; org.springframework.data.mongodb.config.IsNewAwareAuditingHandlerBeanDefinitionParser . parse ( org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgValue ( getObjectFactoryBeanDefinition ( org.springframework.data.mongodb.config.IsNewAwareAuditingHandlerBeanDefinitionParser . getResolvedBeanName ( ) , org.springframework.data.mongodb.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ) ; }  <METHOD_END>
