<METHOD_START> @ java.lang.Override protected org.springframework.integration.redis.config.BeanDefinitionBuilder org.springframework.integration.redis.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.redis.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.redis.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( SubscribableRedisChannel .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = STRING ; } org.springframework.integration.redis.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; org.springframework.integration.redis.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.redis.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.redis.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.redis.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.redis.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.redis.config.BeanDefinitionBuilder ; }  <METHOD_END>
